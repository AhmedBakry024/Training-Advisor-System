import java.util.*;

public class Course {

    private String courseName;
    private String coursetype;
    private String courseID;
    private double courseScore;
    private double courseCost;
    private String prerequisite = new String();
    public Exams exam = new Exams();
    public Materials materials;

    public Course() {
        this.courseName = "course Name";
        this.coursetype = "course type";
        this.courseID = "course ID";
        this.courseScore = 0;
        this.courseCost = 0;
    }

    public Course(String name, String type, String ID, String pre, double cost, String material) {
        courseName = name;
        coursetype = type;
        courseID = ID.toUpperCase();
        courseCost = cost;
        prerequisite = pre;
        materials.materialsVector.add(material);
    }

    public void setCourse(String name, String type, String ID, int score, int cost) {
        this.courseName = name;
        this.coursetype = type;
        this.courseID = ID.toUpperCase();
        this.courseScore = score;
        this.courseCost = cost;
    }

    public boolean Matching(String CourseName) {
        String name;
        for (int i = 0; i < App.coursesVector.size(); i++) {
            name = App.coursesVector.get(i).getCourseName();
            name = name.toLowerCase();
            if (name.equals(CourseName)) {
                return true;
            }
        }
        return false;
    }
    public void SearchCourse()
    {
        String name = new String();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter course name: ");
        name = input.nextLine();
        name.toLowerCase();
        for (int i = 0; i < App.coursesVector.size(); i++)
        {
            if (App.coursesVector.get(i).courseName.matches(name))
            {
                System.out.println("Course ID:  " + App.coursesVector.get(i).getCourseID());
                System.out.println("Course name: " + App.coursesVector.get(i).getCourseName());
                System.out.println("Course type: " + App.coursesVector.get(i).getCourseType());
                System.out.println("Course prerequisites: " + App.coursesVector.get(i).getPrerequisites());
                System.out.println("Course cost: " + App.coursesVector.get(i).getCourseCost());
                System.out.println("Do you want to enroll in this course? Pass 1 for yes and 2 for no");
                int choice = input.nextInt();
                if (choice == 1)
                {
                    App.accounts.get(VisitorAccount.accountIndex).Enroll(App.coursesVector.get(i).getCourseID());
                }

            }
        }
    }

    //Setters
    public void setCourseName(String name) {
        courseName = name;
    }

    public void setCourseType(String type) {
        coursetype = type;
    }

    public void setCourseID(String ID) {
        courseID = ID.toUpperCase();
    }

    public void setCourseScore(Double score) {
        courseScore = score;
    }

    public void setCourseCost(Double cost) {
        courseCost = cost;
    }

    public void setPrerequisites(String pre) {
        prerequisite = pre;
    }

    //Getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseType() {
        return coursetype;
    }

    public String getCourseID() {
        return courseID;
    }

    public double getCourseScore() {
        return courseScore;
    }

    public double getCourseCost() {
        return courseCost;
    }

    public String getPrerequisites() {
        return prerequisite;
    }

    public void progressTracking() {

        System.out.println("You finished " + courseScore + " % of the course");
        if (exam.getExam()) {
            System.out.println("You finished the course exam");
        }
        else if (!exam.getExam()) {
            System.out.println("You didn't finish the course exam");
        }
        if (exam.getQuiz()) {
            System.out.println("You finished the course quiz");
        }
        else if (!exam.getQuiz()) {
            System.out.println("You didn't finish the course quiz");
        }
    }
}
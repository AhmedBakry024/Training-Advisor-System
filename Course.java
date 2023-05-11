import java.util.Vector;

public class Course {

    private String courseName;
    private String coursetype;
    private String courseID;
    private double courseScore;
    private double courseCost;
    private Vector<String> prerequisites = new Vector<>();
    public Exams exams;
    public Materials materials;

    public Course() {
        this.courseName = "course Name";
        this.coursetype = "course type";
        this.courseID = "course ID";
        this.courseScore = 0;
        this.courseCost = 0;
    }

    public Course(String name, String type, String ID, Vector<String> pre, double cost, String material) {
        courseName = name;
        coursetype = type;
        courseID = ID.toUpperCase();
        courseCost = cost;
        prerequisites = pre;
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
        prerequisites.add(pre);
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

    public Vector<String> getPrerequisites() {
        return prerequisites;
    }

    public void progressTracking() {

        System.out.println("You finished " + courseScore + " % of the course");
    }
}
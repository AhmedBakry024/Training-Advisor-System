import java.util.Scanner;

public class CourseInteraction extends Course implements ICheck {
    private double score;

    public CourseInteraction() {
        super();
        this.score = 0;
        setCourseScore(this.score);
    }

    public double getScore() {
        return this.score;
    }

    public void TakingQuizzesAndExams(String Id) {
        for (int i = 0; i < App.coursesVector.size(); i++) {
            if (App.coursesVector.get(i).getCourseID().equals(Id)) {
                System.out.println("\nExam : " + Exams.getExamsVector());
                System.out.println("\nEnter the answer of the exam : ");
                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();
                answer = answer.toLowerCase();
                if (Exams.answersVector.get(i).equals(answer)) {
                    System.out.println("Correct answer\n");
                    this.score += 10;
                } else {
                    System.out.println("Wrong answer\n");
                }
                setCourseScore(this.score);
            }
        }
    }

    public void viewMaterials() {
        System.out.println("Materials :\n" + Materials.getMaterialsVector());
    }

    public boolean checkCost() {
        if (getCourseCost() != 0) {
            // pay for course
            return true;
        } else {
            // course is free
            return false;
        }
    }

    public boolean checkScore() {
        if (this.score >= 50) {
            System.out.println("You passed the course");
            return true;
        } else {
            System.out.println("You failed the course");
            return false;
        }
    }

}
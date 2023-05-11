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

    public void takingExam(String Id) {
        for (int i = 0; i < App.coursesVector.size(); i++) {
            if (App.coursesVector.get(i).getCourseID().equals(Id)) {
                App.coursesVector.get(i).exam.solveExam(i);
            }
        }
    }
    public void takingQuiz(String Id) {
        for (int i = 0; i < App.coursesVector.size(); i++) {
            if (App.coursesVector.get(i).getCourseID().equals(Id)) {
                App.coursesVector.get(i).exam.solveQuiz(i);
            }
        }
    }

    public void viewMaterials() {
        System.out.println("Materials :\n" + Materials.getMaterialsVector());
    }

    public boolean checkCost(String Id) {
        for(int i=0;i<App.coursesVector.size();i++)
        {
            if(App.coursesVector.get(i).getCourseID().equals(Id))
            {
                if (App.coursesVector.get(i).getCourseCost() != 0) {
                    System.out.println("You payed the course");
                    return true;
                } else {
                    System.out.println("You didn't pay the course");
                    return false;
                }
            }
        }
        return false;
    }

    public boolean checkScore(String Id) {
        for(int i=0;i<App.coursesVector.size();i++)
        {
            if(App.coursesVector.get(i).getCourseID().equals(Id))
            {
                if (App.coursesVector.get(i).getCourseScore() >= 50) {
                    System.out.println("You passed the course");
                    return true;
                } else {
                    System.out.println("You failed the course");
                    return false;
                }
            }
        }
        return false;
    }

}
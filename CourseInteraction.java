public class CourseInteraction extends Course implements ICheck
{
    private double score;

    public CourseInteraction()
    {
        super();
        this.score = 0;
        setCourseScore(this.score);
    }
    public double getScore()
    {
        return this.score;
    }
    
    public void TakingQuizzesAndExams()
    {
        System.out.println("Exam :\n"+exams.getExamsVector());
    }
    public void viewMaterials()
    {
        System.out.println("Materials :\n"+materials.getMaterialsVector());
    }

    public boolean checkCost()
    {
        if (getCourseCost() != 0)
        {
            //pay for course
            return true;
        }
        else
        {
            //course is free
            return false;
        }
    }
    public boolean checkScore()
    {
        if (this.score >= 70)
        {
            System.out.println("You passed the course");
            return true;
        }
        else
        {
            System.out.println("You failed the course");
            return false;
        }
    }
    
}
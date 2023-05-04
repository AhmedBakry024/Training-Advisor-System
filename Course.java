public class Course 
{

    private String courseName;
    private String coursetype;
    private String courseID;
    private double courseScore;
    private double courseCost;

    public Course()
    {
        this.courseName = "course Name";
        this.coursetype = "course type";
        this.courseID = "course ID";
        this.courseScore = 0;
        this.courseCost = 0;
    }

    public void setCourse(String name, String type, String ID, int score, int cost)
    {
        this.courseName = name;
        this.coursetype = type;
        this.courseID = ID;
        this.courseScore = score;
        this.courseCost = cost;
    }
//Setters
    public void setCourseName(String name)
    {
        this.courseName = name;
    }
    public void setCourseType(String type)
    {
        this.coursetype = type;
    }
    public void setCourseID(String ID)
    {
        this.courseID = ID;
    }
    public void setCourseScore(Double score)
    {
        this.courseScore = score;
    }
    public void setCourseCost(Double cost)
    {
        this.courseCost = cost;
    }
//Getters
    public String getCourseName()
    {
        return this.courseName;
    }
    public String getCourseType()
    {
        return this.coursetype;
    }
    public String getCourseID()
    {
        return this.courseID;
    }
    public double getCourseScore()
    {
        return this.courseScore;
    }
    public double getCourseCost()
    {
        return this.courseCost;
    }
   
    

}
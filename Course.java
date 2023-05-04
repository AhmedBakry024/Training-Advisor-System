import java.util.Vector;

public class Course 
{

    private String courseName;
    private String coursetype;
    private String courseID;
    private double courseScore;
    private double courseCost;
    private Vector<String> quizzesVector = new Vector<String>();
    private Vector<String> examsVector = new Vector<String>();
    private Vector<String> videosVector = new Vector<String>();
    private Vector<String> materialsVector = new Vector<String>();


    public Course()
    {
        this.courseName = "course Name";
        this.coursetype = "course type";
        this.courseID = "course ID";
        this.quizzesVector.add("quiz 1");
        this.quizzesVector.add("quiz 2");
        this.examsVector.add("exam 1");
        this.examsVector.add("exam 2");
        this.videosVector.add("video 1");
        this.videosVector.add("video 2");
        this.materialsVector.add("material");
        this.courseScore = 0;
        this.courseCost = 0;
    }

    public void setCourse(String name, String type, String ID, int score, int cost,String quiz, String exam, String video, String material)
    {
        this.courseName = name;
        this.coursetype = type;
        this.courseID = ID;
        this.courseScore = score;
        this.courseCost = cost;
        this.quizzesVector.add(quiz);
        this.examsVector.add(exam);
        this.videosVector.add(video);
        this.materialsVector.add(material);
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
    public void setQuizzesVector(String quiz)
    {
        this.quizzesVector.add(quiz);
    }
    public void setExamsVector(String exam)
    {
        this.examsVector.add(exam);
    }
    public void setVideosVector(String video)
    {
        this.videosVector.add(video);
    }
    public void setMaterialsVector(String material)
    {
        this.materialsVector.add(material);
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
    public Vector<String> getQuizzesVector()
    {
        return this.quizzesVector;
    }
    public Vector<String> getExamsVector()
    {
        return this.examsVector;
    }
    public Vector<String> getVideosVector()
    {
        return this.videosVector;
    }
    public Vector<String> getMaterialsVector()
    {
        return this.materialsVector;
    }

    

}
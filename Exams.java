import java.util.Vector;

public class Exams
{
    private static Vector<String> examsVector = new Vector<String>();
    private static Vector<String> answersVector = new Vector<String>();
    
    
    //setters
    public void setExamsVector(String exam)
    {
        Exams.examsVector.add(exam);
    }
    public void setAnswersVector(String answer)
    {
        Exams.answersVector.add(answer);
    }
   
    //getters
    public static Vector<String> getExamsVector()
    {
        return examsVector;
    }
    public static Vector<String> getAnswersVector()
    {
        return answersVector;
    }
   
}
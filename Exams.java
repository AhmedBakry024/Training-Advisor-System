import java.util.Vector;

public class Exams
{
    private static Vector<String> examsVector = new Vector<String>();
    //setters
    public void setExamsVector(String exam)
    {
        this.examsVector.add(exam);
    }
    //getters
    public static Vector<String> getExamsVector()
    {
        return examsVector;
    }
}
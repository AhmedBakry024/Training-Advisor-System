import java.util.Vector;

public class Exams
{
    private static Vector<String> examsVector = new Vector<String>();
    private static Vector<String> answersVector = new Vector<String>();
    private static int numOfExams;
    
    public void displayExams()
    {
        for(int i=0;i<numOfExams;i++)
        {
            System.out.println("Exam "+i+1+": "+examsVector.get(i));
        }
    }
    //setters
    public void setExamsVector(String exam)
    {
        Exams.examsVector.add(exam);
    }
    public void setAnswersVector(String answer)
    {
        Exams.answersVector.add(answer);
    }
    public void setNumOfExams(int num)
    {
        this.numOfExams = num;
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
    public static int getNumOfExams()
    {
        return numOfExams;
    }
}
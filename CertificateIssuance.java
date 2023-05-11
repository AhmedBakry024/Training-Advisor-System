import java.util.*;


public class CertificateIssuance implements ICheck {

    Scanner scanner = new Scanner(System.in);

    public boolean checkCost(String Id) {
        for(int i=0;i<App.coursesVector.size();i++)
        {
            if(App.coursesVector.get(i).getCourseID().equals(Id))
            {
                if (App.coursesVector.get(i).getCourseCost() != 0.0) {
                    Double fee = App.coursesVector.get(i).getCourseCost();
                    Payment payment = new Payment();
                    payment.paymentMethod(fee);
                    return true;
                } else {
                    System.out.println("The course is already paid");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkScore(String Id) {
        for(int i=0;i<App.coursesVector.size();i++)
        {
            if(App.accounts.get(VisitorAccount.accountIndex).myCourses.get(i).getCourseID().equals(Id))
            {
                if (App.accounts.get(VisitorAccount.accountIndex).myCourses.get(i).exam.getExam()) {
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
    public void issueCertificate(String Id)
    {
        if(checkCost(Id) && checkScore(Id))
        {
            System.out.println("Certificate issued");
        }
        else
        {
            System.out.println("Certificate not issued");
        }
    }
    
}

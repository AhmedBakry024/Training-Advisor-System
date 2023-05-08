public class CertificateIssuance implements ICheck{

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

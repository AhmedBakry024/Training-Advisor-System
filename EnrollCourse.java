public class EnrollCourse {
    
    public void Enroll(String id) {
        for(int i = 0; i < App.coursesVector.size(); i++)
        {
            if(App.coursesVector.get(i).getCourseID().equals(id))
            {
                App.accounts.get(VisitorAccount.accountIndex).myCourses.add(App.coursesVector.get(i));
                System.out.println("Course successfully enrolled");
            }
        }
        
    }
}

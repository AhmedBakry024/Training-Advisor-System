public class WithdrawCourse {
    
    public void Withdraw(String id) {
        for(int i = 0; i < App.accounts.get(VisitorAccount.accountIndex).myCourses.size(); i++)
        {
            if(App.accounts.get(VisitorAccount.accountIndex).myCourses.get(VisitorAccount.accountIndex).getCourseID().equals(id))
            {
                App.accounts.get(VisitorAccount.accountIndex).myCourses.remove(i);
                System.out.println("Course successfully withdrawn");
            }
        }
    }
    
}

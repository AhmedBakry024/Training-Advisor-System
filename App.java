import java.util.*;

public class App {

    public static Vector<VisitorAccount> accounts = new Vector<VisitorAccount>();
    public static Vector<Course> coursesVector = new Vector<Course>();


    public static void main(String args[]) {

        VisitorAccount user = new VisitorAccount();
        user.Signup();
        user.Signup();
        user.Signup();

        user.Login();
        accounts.get(VisitorAccount.accountIndex).viewdata();
        }
}
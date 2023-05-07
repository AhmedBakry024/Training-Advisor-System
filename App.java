import java.util.*;

public class App {

    public static Vector<VisitorAccount> accounts = new Vector<VisitorAccount>();


    public static void main(String args[]) {

        VisitorAccount user = new VisitorAccount();
        user.Signup();
        user.Login();
        accounts.get(VisitorAccount.accountIndex).viewdata();
        }
}
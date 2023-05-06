import java.util.*;

public class App {

    public static Vector<VisitorAccount> accounts = new Vector<VisitorAccount>();


    public static void main(String args[]) {

        Signup signup = new Signup();
        Login login = new Login();
        accounts.get(Login.accountIndex).viewdata();
        }
}
import java.util.*;

public class Login {
    
    public static int accountIndex = -1;

    public Login() {

        System.out.println("Login Section");
        Scanner scanner = new Scanner(System.in);
        VisitorAccount inputLogin = new VisitorAccount();


        System.out.println("Enter your Email");
        inputLogin.Email = scanner.next();
        System.out.println("Enter your Password");
        inputLogin.Pass = scanner.next();

        for (int i = 0; i < App.accounts.size(); i++) {

            if (inputLogin.Email.equals(App.accounts.get(i).Email)
                    && inputLogin.Pass.equals(App.accounts.get(i).Pass)) {
                    accountIndex = i;
                }
        }        
        if (accountIndex == -1) {
            System.out.println("Wrong Email or password");
        }
        else {
            System.out.println(App.accounts.get(accountIndex).Name);
        }
    }

}
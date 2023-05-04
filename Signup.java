import java.util.*;

public class Signup {

    public Signup() {

        System.out.println("Signup Section");

        Scanner scanner = new Scanner(System.in);

        VisitorAccount userInput = new VisitorAccount();
        System.out.println("Enter your name");
        userInput.Name = scanner.nextLine();
        System.out.println("Enter your Email");
        userInput.Email= scanner.nextLine();
        System.out.println("Enter your Password");
        userInput.Pass = scanner.nextLine();
        App.accounts.addElement(userInput);
    }
}

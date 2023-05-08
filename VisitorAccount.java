import java.util.*;

public class VisitorAccount {

    Scanner scanner = new Scanner(System.in);
    public static int accountIndex = -1;


    public String Name = new String();
    public String Email = new String();
    public String Pass = new String();
    public String phoneNum;
    public Vector<Course> myCourses = new Vector<Course>();

    public void EditProfile() {
        System.out.println("Change Profile");
        System.out.println("Press 1 to change your name");
        System.out.println("Press 2 to change your email");
        System.out.println("Press 3 to change your password");
        System.out.println("Press 4 to change your phone number");

        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter new name");
            String nameString = scanner.next();
            Name = nameString;
            System.out.println("Name changed successfully");
        }
        if (choice == 2) {
            System.out.println("Enter new email");
            String emailString = scanner.next();
            Email = emailString;
            System.out.println("Email changed successfully");
        }
        if (choice == 3) {
            System.out.println("Enter new password");
            String passwordString = scanner.next();
            Email = passwordString;
            System.out.println("Password changed successfully");
        }
        if (choice == 4) {
            System.out.println("Enter new phone number");
            String phoneString = scanner.next();
            phoneNum = phoneString;
            System.out.println("Phone number changed successfully");
        }

    }

    public void viewdata() {
        System.out.println("    Your profile    ");
        System.out.println("Your Name:  " + Name);
        System.out.println("Your Email:  " + Email);
        System.out.println("Your Phone Number:  " + phoneNum);
    }

    public void Login() {

        accountIndex = -1;

        System.out.println("Login Section");
        Scanner scanner = new Scanner(System.in);
        VisitorAccount inputLogin = new VisitorAccount();

        System.out.println("Enter your Email");
        inputLogin.Email = scanner.next();
        System.out.println("Enter your Password");
        inputLogin.Pass = scanner.next();

        for (int i = 0; i < App.accounts.size(); i++) 
        {
            if (inputLogin.Email.equals(App.accounts.get(i).Email)
                    && inputLogin.Pass.equals(App.accounts.get(i).Pass)) {
                accountIndex = i;
            }
        }
    }
    
    public VisitorAccount Signup() {

        System.out.println("Signup Section");
        Scanner scanner = new Scanner(System.in);

        VisitorAccount userInput = new VisitorAccount();
        System.out.println("Enter your name");
        userInput.Name = scanner.nextLine();
        System.out.println("Enter your Email");
        userInput.Email = scanner.nextLine();
        System.out.println("Enter your Password");
        userInput.Pass = scanner.nextLine();
        System.out.println("Enter your Phone number");
        userInput.phoneNum = scanner.next();
        return userInput;
        
    }

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

    public void Withdraw(String id) {
        for(int i = 0; i < myCourses.size(); i++)
        {
            if(myCourses.get(i).getCourseID().equals(id))
            {
                App.accounts.get(VisitorAccount.accountIndex).myCourses.remove(i);
                System.out.println("Course successfully withdrawn");
            }
        }
    }
}
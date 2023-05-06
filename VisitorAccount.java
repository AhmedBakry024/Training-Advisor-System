import java.util.*;

public class VisitorAccount {

    Scanner scanner = new Scanner(System.in);

    public String Name = new String();
    public String Email = new String();
    public String Pass = new String();
    public Integer phoneNum;

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
            Integer phoneString = scanner.nextInt();
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
}
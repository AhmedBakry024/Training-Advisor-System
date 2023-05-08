import java.util.*;

public class App {

    public static Vector<VisitorAccount> accounts = new Vector<VisitorAccount>();
    public static Vector<VisitorAccount> admins = new Vector<VisitorAccount>();
    public static Vector<Course> coursesVector = new Vector<Course>();
    

    public static void main(String args[]) {

        String id;
        VisitorAccount user = new VisitorAccount();
        Scanner scanner = new Scanner(System.in);
        Administration admin = new Administration();
        int choice;
        System.out.println("         Welcome to Training Advisor");
        System.out.println("Press 1 to Signup as a user, 2 to signup as an administrator");
        choice = scanner.nextInt();
        
            switch (choice) {
                case 1:
                    accounts.add(user.Signup());
                    System.out.println("Signed up Successfully");
                    System.out.println();
                    user.Login();
                    if (VisitorAccount.accountIndex == -1) {
                        System.out.println("Wrong Email or password");
                    }
                    else {
                        System.out.println("Logged in successfully \n\n");
                        for (;;) {
                            System.out.println("      Main menu");
                            System.out.println(
                                    "View my courses (Press 1) \nSearch course (Press 2) \nEnroll Course (Press 3) \nEdit Profile (Press 4) \nWithdraw from a Couse (Press 5) \nView Profile (Press 6) \nSignup from another account (Press 7) \nLogin from another account (Press 8) ");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 1:
                                    for (int i = 0; i < accounts.get(VisitorAccount.accountIndex).myCourses
                                            .size(); i++) {
                                        System.out.println(accounts.get(VisitorAccount.accountIndex).myCourses.get(i).getCourseName());
                                    }
                                    break;
                                case 2:
                                    CourseSearch courseSearch = new CourseSearch();
                                    courseSearch.SearchCourse();
                                    
                                    break;
                                case 3:
                                    System.out.println("Enter course ID");
                                    id = scanner.nextLine();
                                    id.toUpperCase();
                                    user.Enroll(id);
                                    break;
                                case 4:
                                    accounts.get(VisitorAccount.accountIndex).EditProfile();
                                    break;
                                case 5:
                                    System.out.println("Enter course ID");
                                    id = scanner.nextLine();
                                    id.toUpperCase();
                                    user.Withdraw(id);
                                    break;
                                case 6:
                                    accounts.get(VisitorAccount.accountIndex).viewdata();
                                    break;
                                case 7:
                                    accounts.add(user.Signup());
                                    System.out.println("Signed up Successfully");
                                    System.out.println();
                                    break;
                                case 8:
                                    user.Login();
                                    if (VisitorAccount.accountIndex == -1) {
                                        System.out.println("Wrong Email or password");
                                    }
                                    else {
                                        System.out.println("Logged in successfully \n\n");
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                        }
                    }
                    break;
                case 2:
                    admins.add(user.Signup());
                    System.out.println("Signed up successfully");
                    System.out.println("Press 1 to set course and 2 to Edit course");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            admin.setCourse();
                            break;
                        case 2:
                            admin.DefiningCourse("0");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;
                default:
                    System.out.println("Invalid input");    

                    
            }
        
    }
}
import java.util.*;

public class App {

    public static Vector<VisitorAccount> accounts = new Vector<VisitorAccount>();
    public static VisitorAccount admins = new VisitorAccount();
    public static Vector<Course> coursesVector = new Vector<Course>();
    

    public static void main(String args[]) 
    {
        Course course;
        coursesVector.add(course = new Course("math 0", "Math", "MA12", "", 100.0, "material"));
        coursesVector.add(course = new Course("math 1", "Math", "MA22", "math 0", 100.0, "material"));
        admins.Email = "admin";
        admins.Pass = "admin";
        String id;
        VisitorAccount user = new VisitorAccount();
        Scanner scanner = new Scanner(System.in);
        Administration admin = new Administration();
        boolean loopBreak = false;
        int choice;
        for (;;) 
        {
            System.out.println("         Welcome to Training Advisor");
            System.out.println("Press 1 to Signup as a user, 2 to Login as an administrator and 3 to exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    accounts.add(user.Signup());
                    System.out.println("Signed up Successfully");
                    System.out.println();
                    user.Login();
                    loopBreak = false;

                    if (VisitorAccount.accountIndex == -1) {
                        System.out.println("Wrong Email or password");
                    } else {
                        System.out.println("Logged in successfully \n\n");
                        while (loopBreak == false) {
                            System.out.println("      Main menu");
                            System.out.println(
                                    "View my courses (Press 1) \nSearch course (Press 2) \nEnroll Course (Press 3) \nEdit Profile (Press 4) \nWithdraw from a Course (Press 5) \nView Profile (Press 6) \nSignup from another account (Press 7) \nLogin from another account (Press 8) \nGet certificate (Press 9)\nSolve quizzes and exams (Press 10) \nHelpdesk (Press 11) \nExit to login page (Press 0) ");
                            choice = scanner.nextInt();
                            switch (choice) {
                                case 0:
                                    loopBreak = true;
                                    break;
                                case 1:
                                    if (accounts.get(VisitorAccount.accountIndex).myCourses.size() < 1) 
                                    {
                                        System.out.println("\nNo Registered courses\n\n");
                                    }
                                    else {
                                        for (int i = 0; i < accounts.get(VisitorAccount.accountIndex).myCourses
                                                .size(); i++) {
                                            System.out.println("Course Name: "
                                                    + accounts.get(VisitorAccount.accountIndex).myCourses.get(i)
                                                            .getCourseName());
                                            System.out.println(
                                                    "Course ID: " + accounts.get(VisitorAccount.accountIndex).myCourses
                                                            .get(i).getCourseID());
                                        }
                                        System.out.println(
                                                "If you want to track progress of a course press one, else press any other key");
                                        choice = scanner.nextInt();
                                        if (choice == 1) {
                                            System.out.println("Enter course ID");
                                            scanner.nextLine();
                                            String iDString = scanner.nextLine();
                                            for (int i = 0; i < accounts.get(VisitorAccount.accountIndex).myCourses
                                                    .size(); i++) 
                                            {
                                                if (accounts.get(VisitorAccount.accountIndex).myCourses
                                                        .get(VisitorAccount.accountIndex).getCourseID()
                                                        .equals(iDString)) 
                                                {
                                                    accounts.get(VisitorAccount.accountIndex).myCourses.get(VisitorAccount.accountIndex).progressTracking();
                                                }
                                            }

                                        }
                                    }
                                    break;
                                case 2:
                                    Course courseSearch = new Course();
                                    courseSearch.SearchCourse();

                                    break;
                                case 3:
                                    System.out.println("Enter course ID");
                                    scanner.nextLine();
                                    id = scanner.nextLine();
                                    id.toUpperCase();
                                    user.Enroll(id);
                                    break;
                                case 4:
                                    accounts.get(VisitorAccount.accountIndex).EditProfile();
                                    break;
                                case 5:
                                    System.out.println("Enter course ID");
                                    scanner.nextLine();
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
                                    } else {
                                        System.out.println("Logged in successfully \n\n");
                                    }
                                    break;
                                case 9:
                                    System.out.println("Enter course ID");
                                    scanner.nextLine();
                                    id = scanner.nextLine();
                                    id.toUpperCase();
                                    CertificateIssuance Certificate = new CertificateIssuance();
                                    Certificate.issueCertificate(id);
                                    break;
                                case 10:
                                    System.out.println("Press 1 to solve the exam and 2 to solve the quiz");
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            System.out.println("Enter course ID");
                                            scanner.nextLine();
                                            id = scanner.nextLine();
                                            id.toUpperCase();

                                            for (int i = 0; i < accounts.get(VisitorAccount.accountIndex).myCourses
                                                    .size(); i++) {
                                                if (accounts.get(VisitorAccount.accountIndex).myCourses
                                                        .get(i).getCourseID().equals(id)) {
                                                    accounts.get(VisitorAccount.accountIndex).myCourses
                                                            .get(i).exam
                                                            .solveExam(
                                                                    accounts.get(VisitorAccount.accountIndex).myCourses
                                                                            .get(i)
                                                                            .getCourseScore());
                                                }
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Enter course ID");
                                            scanner.nextLine();
                                            id = scanner.nextLine();
                                            id.toUpperCase();

                                            for (int i = 0; i < accounts.get(VisitorAccount.accountIndex).myCourses
                                                    .size(); i++) {
                                                if (accounts.get(VisitorAccount.accountIndex).myCourses
                                                        .get(i).getCourseID().equals(id)) 
                                                        {
                                                    accounts.get(VisitorAccount.accountIndex).myCourses.get(i).exam
                                                            .solveQuiz(
                                                                    accounts.get(VisitorAccount.accountIndex).myCourses.get(i)
                                                                            .getCourseScore());
                                                }
                                            }
                                            break;
                                    }
                                    break;
                                case 11:
                                    Helpdesk help = new Helpdesk();
                                    break;
                                default:
                                    System.out.println("Invalid input");
                            }
                        }
                    }
                    break;
                case 2:
                    loopBreak = false;
                    String inputUser, inputPass;
                    System.out.print("Enter the username: ");
                    scanner.nextLine();
                    inputUser = scanner.nextLine();
                    System.out.print("Enter the password: ");
                    inputPass = scanner.nextLine();
                    if (inputPass.equals(admins.Pass) && inputUser.equals(admins.Email))
                    {
                        System.out.println("Logged up successfully");
                        while (loopBreak == false) {
                            System.out.println(
                                    "Set course (Press 1) \nEdit course (Press 2) \nDelete Course(Press 3) \nExit to main menu (Press 0)");
                            choice = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice) {
                                case 1:
                                    admin.setCourse();
                                    break;
                                case 2:
                                    System.out.println("Enter course ID");
                                    id = scanner.nextLine();
                                    id.toUpperCase();
                                    admin.DefiningCourse(id);
                                    break;
                                case 3:
                                    System.out.println("Enter course ID");
                                    id = scanner.nextLine();
                                    id.toUpperCase();
                                    admin.deleteCourse(id);
                                case 0:
                                    loopBreak = true;
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
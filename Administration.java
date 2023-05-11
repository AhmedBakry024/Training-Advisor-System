import java.util.*;


public class Administration {
    private Course course;

    public void setCourse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  course name: ");
        String name = input.nextLine();
        System.out.println("Enter  course type: ");
        String type = input.nextLine();
        System.out.println("Enter  course ID: ");
        String ID = input.nextLine();
        System.out.println("Enter the number of prerequisite Courses: ");
        Integer prerequisitesNum = input.nextInt();
        input.nextLine();
        Vector<String> prerequisites = new Vector<>();
        for (int i = 0; i < prerequisitesNum; i++) {
            System.out.println("Enter Course ID");
            prerequisites.add(input.nextLine());
        }
        System.out.println("Enter course cost: ");
        double cost = input.nextDouble();
        input.nextLine();
        System.out.println("Enter course material: ");
        String material = input.nextLine();
        App.coursesVector.add(course = new Course(name, type, ID, prerequisites, cost, material));
    }

    public void DefiningCourse(String ID) {
        for (int i = 0; i < App.coursesVector.size(); i++) {
            if (App.coursesVector.get(i).getCourseID().equals(ID)) {
                System.out.println(
                        "Enter 1 to change course name or 2 to change course type or 3 to change course ID or 4 to change course prerequisites or 5 to change course cost or 6 to change course exam or 7 to change course material");
                Scanner input = new Scanner(System.in);
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new course name: ");
                        String name = input.nextLine();
                        App.coursesVector.get(i).setCourseName(name);
                        break;
                    case 2:
                        System.out.println("Enter new course type: ");
                        String type = input.nextLine();
                        App.coursesVector.get(i).setCourseType(type);
                        break;
                    case 3:
                        System.out.println("Enter new course ID: ");
                        String id = input.nextLine();
                        App.coursesVector.get(i).setCourseID(id);
                        break;
                    case 4:
                        System.out.println("Enter new course prerequisites: ");
                        String prerequisites = input.nextLine();
                        App.coursesVector.get(i).setPrerequisites(prerequisites);
                        break;
                    case 5:
                        System.out.println("Enter new course cost: ");
                        double cost = input.nextDouble();
                        App.coursesVector.get(i).setCourseCost(cost);
                        break;
                    case 6:
                        System.out.println("Enter new course exam: ");
                        String exam = input.nextLine();
                        App.coursesVector.get(i).exams.setExamsVector(exam);
                        break;
                    case 7:
                        System.out.println("Enter new course material: ");
                        String material = input.nextLine();
                        App.coursesVector.get(i).materials.setMaterialsVector(material);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }

    public void deleteCourse(String ID) {
        for (int i = 0; i < App.coursesVector.size(); i++) 
        {
            if (App.coursesVector.get(i).getCourseID().equals(ID)) 
            {
                App.coursesVector.remove(i);
                System.out.println("Course successfully deleted");
            }
        }
    }
}
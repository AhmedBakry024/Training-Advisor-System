import java.util.Scanner;

public class CourseSearch 
 {
    private Course course;
    public CourseSearch()
    {
        this.course = new Course();
    }
    public void SearchCourse()
    {
        String name = new String();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter course name: ");
        name = input.nextLine();
        name.toLowerCase();
        for (int i = 0; i < App.coursesVector.size(); i++)
        {
            if (course.Matching(name))
            {
                System.out.println("Course ID:  " + i);
                System.out.println("Course name: " + App.coursesVector.get(i).getCourseName());
                System.out.println("Course type: " + App.coursesVector.get(i).getCourseType());
                System.out.println("Course prerequisites: " + App.coursesVector.get(i).getPrerequisites());
                System.out.println("Course cost: " + App.coursesVector.get(i).getCourseCost());
            }
        }
    }
}
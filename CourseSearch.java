import java.util.Scanner;

public class CourseSearch 
 {
    private Course course;
    public CourseSearch()
    {
        this.course = new Course();
    }
    public void SearchCourse(String name)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter course name: ");
        name = input.nextLine();
        name.toLowerCase();
        for (int i = 0; i < course.getCoursesVector().size(); i++)
        {
            if (course.Matching(name))
            {
                System.out.println("Course name: " + course.getCoursesVector().get(i).getCourseName());
                System.out.println("Course type: " + course.getCoursesVector().get(i).getCourseType());
                System.out.println("Course prerequisites: " + course.getCoursesVector().get(i).getPrerequisites());
                System.out.println("Course cost: " + course.getCoursesVector().get(i).getCourseCost());
            }
        }
    }
}
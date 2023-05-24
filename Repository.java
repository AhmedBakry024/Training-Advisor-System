import java.util.Vector;

public class Repository {

    public Vector<VisitorAccount> accounts = new Vector<VisitorAccount>();
    public VisitorAccount admins = new VisitorAccount();
    public Vector<Course> coursesVector = new Vector<Course>();
    public int accountIndex = -1;
    private static Repository repo;

    private Repository() {
        
    }

    public static Repository getInstance() {
        if (repo == null) {
            repo = new Repository();
        }
        return repo;
    }
}

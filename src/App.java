import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s = new Student();
        s.set_name("student");
        Teacher t = new Teacher();
        t.set_name("teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);

        for(User u: User.admins) {
            // POLYMORPHISM
            u.verify();
        }
    }
}


public class Student extends User {
    void verify() {
        System.out.println("verifying through email");
        set_verified(true);
    }

}

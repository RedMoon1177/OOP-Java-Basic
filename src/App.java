public class App {
    public static void main(String[] args) throws Exception {
        User u = new User("Anne", "gold"); 
        User u2 = new User("Hannah", "gold"); 
        System.out.println(u.equals(u2));
    }
}

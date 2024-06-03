public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        User u = new User();
        u.set_name("Anne");    
        u.set_membership(User.Membership.Gold);   
        System.out.println(u.get_name());
        System.out.println(u.get_memebership());
    }
}

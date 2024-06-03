import java.util.List;

public abstract class User {

    // ATTRIBUTES
    private String _name;
    private String _memebership;
    private boolean _verified = false;
    public enum Membership {
        Bronze, Silver, Gold;
    }

    /////////////////// Static Data
    public static List<User> admins;

    /////////////////// Static methods
    public static void print_admin_names() {
        for(User u: admins) {
            System.out.println(u.get_name());
        }
    }

    // CONTRUCTORS (METHODS)
    public User() {
    }

    public User(String name) {
        set_name(name);
    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    // GET - SET METHODS
    void set_name(String name) {
        _name = name;
    }

    String get_name() {
        return _name;
    }

    /////////////////// OVERLOADING
    void set_verified(boolean verified) {
        _verified = verified;
    }

    boolean get_verified() {
        return _verified;
    }

    void set_membership(String membership) {
        _memebership = membership;
    }

    void set_membership(Membership membership) {
        _memebership = membership.name();
    }

    String get_memebership() {
        return _memebership;
    }

    // OVERRIDING METHODS
    public String toString() {
        return get_name() + " " + get_memebership();
    }

    public boolean equals(User u2) {
        if(get_name() == u2.get_name() && get_memebership() == u2.get_memebership()) {
            return true; 
        } else {
            return false;
        }
    }


    void verify() {
        System.out.println("verifying...");
        set_verified(true);
    }
} 

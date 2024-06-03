
public class User {

    // ATTRIBUTES
    private String _name;
    private String _memebership;
    public enum Membership {
        Bronze, Silver, Gold;
    }

    // CONTRUCTORS (METHODS)
    public User() {
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
} 

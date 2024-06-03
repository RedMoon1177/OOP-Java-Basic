
public class User {

    // ATTRIBUTES
    private String _name;
    private String _memebership;
    public enum Membership {
        Bronze, Silver, Gold;
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
}

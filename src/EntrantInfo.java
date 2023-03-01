public class EntrantInfo {          //  This class holds information of entrants input. Like the name, email, and the version of JDK they work with most.
    private final String name;
    private final String email;
    private final String jdkVersion;

    public EntrantInfo (String name, String email, String jdkVersion) {     // Constructor
        this.name = name;
        this.email = email;
        this. jdkVersion = jdkVersion;
    }

    public String getName() {      // added get methods for each variable so that their values can be retrieved
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJdkVersion() {
        return jdkVersion;
    }
}
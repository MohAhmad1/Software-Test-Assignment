package ie.gmit;
//  06/05/20
//  Class to create a Lecturer information entry
public class Lecturers {
    private String name;
    private String email;

    public String getName() {

        return name;
    }

    public String getEmail() {
        return email;
    }

    public Lecturers(String name, String email) {
        if (name == "" || email == "") {
            throw new IllegalArgumentException("Missing data");
        } else {
            this.name = name;
            this.email = email;
        }
    }
}
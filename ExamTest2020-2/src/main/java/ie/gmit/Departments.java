package ie.gmit;

public class Departments {
    private String name;
    private String code;
    private String phone;
    private String email;

    Departments(String name, String code, String phone, String email) {
        this.name = name;
        this.code = code;
        this.phone = phone;
        this.email = email;
    }
     String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    String getCode () {
        return code;
    }

    public void setCode (String code){
        this.code = code;
    }

     String getEmail () {
        return email;
    }

    public void setEmail (String email){
        this.email = email;
    }

     String getPhone () {
        return phone;
    }

    public void setPhone (String phone){
        this.phone = phone;
    }
}
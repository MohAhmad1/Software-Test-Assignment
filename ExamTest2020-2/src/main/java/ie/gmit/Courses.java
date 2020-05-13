package ie.gmit;

public class Courses {
    private String name;
    private String code;
    private String department;
    private String entryPoints;


    Courses(String name, String code, String department, String entryPoints) {
        this.name = name;
        this.code = code;
        this.department = department;
        this.entryPoints = entryPoints;
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

    String getDepartment () {
        return department;
    }

    public void setDepartment (String department){
        this.department = department;
    }

    public String getEntryPoints () {
        return entryPoints;
    }

    public void setEntryPoints (String entryPoints){
        this.entryPoints = entryPoints;
    }

}
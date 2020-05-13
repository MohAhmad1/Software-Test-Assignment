package ie.gmit;

public class Person {
    private String firstName;
    private String surname;
    private String email;
    private String phoneNumber;
    private String dateOfBirth;
    private String address;

    Person(String firstName, String surname, String email, String phoneNumber, String dateOfBirth, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    String getDisplayName() {
        return firstName + ", " + surname;
    }
    String getEmail(){
        return email;
    }
    String getPhoneNumber(){
        return phoneNumber;
    }
    String getDateOfBirth(){
        return dateOfBirth;
    }
    String getAddress(){
        return address;
    }
}

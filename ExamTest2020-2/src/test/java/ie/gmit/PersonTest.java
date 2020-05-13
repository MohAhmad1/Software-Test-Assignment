package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testGetDisplayName() {
        Person person = new Person("Mohammad", "Ahmad", "g00321094@gmit.ie", "0857777777", "23/03/1996", "Dublin road, Galway");
        String displayName = person.getDisplayName();
        assertEquals("Mohammad, Ahmad", displayName);
    }
    @Test
    void testGetEmail() {
        Person person = new Person("Mohammad", "Ahmad", "g00321094@gmit.ie", "0857777777", "23/03/1996", "Dublin road, Galway");
        String Email = person.getEmail();
        assertEquals("g00321094@gmit.ie", Email);
    }
    @Test
    void testGetPhoneNumber() {
        Person person = new Person("Mohammad", "Ahmad", "g00321094@gmit.ie", "0857777777", "23/03/1996", "Dublin road, Galway");
        String phoneNumner = person.getPhoneNumber();
        assertEquals("0857777777", phoneNumner);
    }
    @Test
    void testGetDateOfBirth() {
        Person person = new Person("Mohammad", "Ahmad", "g00321094@gmit.ie", "0857777777", "23/03/1996", "Dublin road, Galway");
        String dateOfBirth = person.getDateOfBirth();
        assertEquals("23/03/1996", dateOfBirth);
    }
    @Test
    void testGetAddress() {
        Person person = new Person("Mohammad", "Ahmad", "g00321094@gmit.ie", "0857777777", "23/03/1996", "Dublin road, Galway");
        String address = person.getAddress();
        assertEquals("Dublin road, Galway", address);
    }

}
package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonListTest {
    Person thisPerson;
    PersonList thisList;

    @BeforeEach
    void setup()
    {
        thisPerson = new Person("Mohammad", "Ahmad", "g00321094@gmit.ie", "0857777777", "23/03/1996", "Dublin road, Galway");
        thisList = new PersonList();
    }

    @Test
    void testAddPerson() {
        thisList.addPerson(thisPerson);
        assertEquals(1, thisList.getSize());
    }

    @Test
    void testFindByNamePerson() {
        thisList.addPerson(thisPerson);
        assertEquals(thisPerson, thisList.findByName("Mohammad, Ahmad"));
    }

    @Test
    void testFindByNameEmail() {
        thisList.addPerson(thisPerson);
        assertEquals(thisPerson, thisList.findByEmail("g00321094@gmit.ie"));
    }

    @Test
    void testFindByPhoneNumber() {
        thisList.addPerson(thisPerson);
        assertEquals(thisPerson, thisList.findByPhoneNumber("0857777777"));
    }

    @Test
    void testFindByDateOfBirth() {
        thisList.addPerson(thisPerson);
        assertEquals(thisPerson, thisList.findByDateOfBirth("23/03/1996"));
    }

    @Test
    void testFindByAddress() {
        thisList.addPerson(thisPerson);
        assertEquals(thisPerson, thisList.findByAddress("Dublin road, Galway"));
    }



}

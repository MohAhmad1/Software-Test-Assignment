package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class LecturersListTest{
    Lecturers thisLecturer;
    LecturersList thisList;

    @BeforeEach
    void setup()
    {
        thisLecturer = new Lecturers("Des Des", "Des.Des@gmit.ie");
        thisList = new LecturersList();
    }

    @Test
    void testAddLecturer() {
        thisList.addLecturer(thisLecturer);
        assertEquals(1, thisList.getSize());
    }

    @Test
    void testFindByNameLecturer() {
        thisList.addLecturer(thisLecturer);
        assertEquals(thisLecturer, thisList.findByName("Des Des"));
    }
    @Test
    void testFindByNameEamil() {
        thisList.addLecturer(thisLecturer);
        assertEquals(thisLecturer, thisList.findByEmail("Des.Des@gmit.ie"));
    }

}
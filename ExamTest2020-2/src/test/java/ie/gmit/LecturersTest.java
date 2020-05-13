package ie.gmit;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LecturersTest {
    @Test
    void testConstructor()
    {
        Lecturers thisLecturer = new Lecturers("Paul L", "Paul.L@gmit.ie");
        assertEquals("Paul L", thisLecturer.getName());
    }

    @Test
    void testGetName()
    {
        Lecturers thisLecturer = new Lecturers("Paul L", "Paul.L@gmit.ie");
        assertEquals("Paul L", thisLecturer.getName());
    }

    @Test
    void testGetEmail()
    {
        Lecturers thisLecturer = new Lecturers("Paul L", "Paul.L@gmit.ie");
        assertEquals("Paul.L@gmit.ie", thisLecturer.getEmail());
    }
}

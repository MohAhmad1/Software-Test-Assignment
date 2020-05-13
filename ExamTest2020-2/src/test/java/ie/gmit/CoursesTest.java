package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoursesTest {
    @Test
    void testConstructor()
    {
        Courses thisCourse = new Courses("Software and Electronic Engineering", "GA570", "Engineering", "220");
        assertEquals("Software and Electronic Engineering", thisCourse.getName());
    }

    @Test
    void testGetName() {
        Courses thisCourse = new Courses("Software and Electronic Engineering", "GA570", "Engineering", "220");
        String Name = thisCourse.getName();
        assertEquals("Software and Electronic Engineering", Name);
    }

    @Test
    void testGetCode() {
        Courses thisCourse = new Courses("Software and Electronic Engineering", "GA570", "Engineering", "220");
        String Code = thisCourse.getCode();
        assertEquals("GA570", Code);
    }

    @Test
    void testGetDepartment() {
        Courses thisCourse = new Courses("Software and Electronic Engineering", "GA570", "Engineering", "220");
        String Department = thisCourse.getDepartment();
        assertEquals("Engineering", Department);
    }

    @Test
    void testCGetEntryPoints()
    {
        Courses thisCourse = new Courses("Software and Electronic Engineering", "GA570", "Engineering", "220");
        String EntryPoints = thisCourse.getEntryPoints();
        assertEquals("220", EntryPoints);
    }
}
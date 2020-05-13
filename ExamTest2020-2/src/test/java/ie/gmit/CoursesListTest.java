package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoursesListTest {
    Courses thisCourses;
    CoursesList thisList;

    @BeforeEach
    void setup()
    {
        thisCourses = new Courses("Software and Electronic Engineering", "GA570", "Engineering", "220");
        thisList = new CoursesList();
    }

    @Test
    void testAddDepartment() {
        thisList.addCourses(thisCourses);
        assertEquals(1, thisList.getSize());
    }

    @Test
    void testFindByNameDepartment() {
        thisList.addCourses(thisCourses);
        assertEquals(thisCourses, thisList.findByName("Software and Electronic Engineering"));
    }

    @Test
    void testFindByCode() {
        thisList.addCourses(thisCourses);
        assertEquals(thisCourses, thisList.findByCode("GA570"));
    }

    @Test
    void testFindByPhone() {
        thisList.addCourses(thisCourses);
        assertEquals(thisCourses, thisList.findByDepartment("Engineering"));
    }

    @Test
    void testFindByEntryPoints() {
        thisList.addCourses(thisCourses);
        assertEquals(thisCourses, thisList.findByEntryPoints("220"));
    }


}

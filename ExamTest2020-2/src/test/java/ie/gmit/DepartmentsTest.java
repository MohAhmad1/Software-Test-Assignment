package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentsTest {
    @Test
    void testConstructor()
    {
        Departments thisDepartment = new Departments("Engineering", "ENG", "091742201", "engineering@gmit.ie");
        assertEquals("Engineering", thisDepartment.getName());
    }

    @Test
    void testGetName()
    {
        Departments thisDepartment = new Departments("Engineering", "ENG", "091742201", "engineering@gmit.ie");        String Name = thisDepartment.getName();
        assertEquals("Engineering", Name);
    }

    @Test
    void testGetCode()
    {
        Departments thisDepartment = new Departments("Engineering", "ENG", "091742201", "engineering@gmit.ie");        String Code = thisDepartment.getCode();
        assertEquals("ENG", Code);
    }

    @Test
    void testGetEmail()
    {
        Departments thisDepartment = new Departments("Engineering", "ENG", "091742201", "engineering@gmit.ie");        String Email = thisDepartment.getEmail();
        assertEquals("engineering@gmit.ie", Email);
    }

    @Test
    void testGetPhone()
    {
        Departments thisDepartment = new Departments("Engineering", "ENG", "091742201", "engineering@gmit.ie");        String Phone = thisDepartment.getPhone();
        assertEquals("091742201", Phone);
    }
}

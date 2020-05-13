package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentsListTest {
    Departments thisDepartments;
    DepartmentsList thisList;

    @BeforeEach
    void setup()
    {
        thisDepartments = new Departments("Engineering", "ENG", "091742201", "engineering@gmit.ie");
        thisList = new DepartmentsList();
    }

    @Test
    void testAddDepartment() {
        thisList.addDepartments(thisDepartments);
        assertEquals(1, thisList.getSize());
    }

    @Test
    void testFindByNameDepartment() {
        thisList.addDepartments(thisDepartments);
        assertEquals(thisDepartments, thisList.findByName("Engineering"));
    }

    @Test
    void testFindByCode() {
        thisList.addDepartments(thisDepartments);
        assertEquals(thisDepartments, thisList.findByCode("ENG"));
    }

    @Test
    void testFindByPhone() {
        thisList.addDepartments(thisDepartments);
        assertEquals(thisDepartments, thisList.findByPhone("091742201"));
    }

    @Test
    void testFindByEmail() {
        thisList.addDepartments(thisDepartments);
        assertEquals(thisDepartments, thisList.findByEmail("engineering@gmit.ie"));
    }



}

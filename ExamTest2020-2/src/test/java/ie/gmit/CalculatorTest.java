package ie.gmit;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddPass() {
        // assertEquals(String message, long expected, long actual)
        assertEquals("error in add()",  6, Calculator.add(3, 3));
        assertEquals("error in add()", -8, Calculator.add(-4, -4));
        assertEquals("error in add()",  20, Calculator.add(0, 20));
    }

    @Test
    public void testAddFail() {
        // assertNotEquals(String message, long expected, long actual)
        assertNotEquals("error in add()", 30, Calculator.add(1, 30));
    }

    @Test
    public void testSubPass() {
        assertEquals("error in sub()",  1, Calculator.sub(2, 1));
        assertEquals("error in sub()", -1, Calculator.sub(-2, -1));
        assertEquals("error in sub()",  0, Calculator.sub(6, 6));
    }

    @Test
    public void testSubFail() {
        assertNotEquals("error in sub()", 2, Calculator.sub(8, 9));
    }

    @Test
    public void testDivIntPass() {
        assertEquals("error in divInt()", 3, Calculator.divInt(9, 3));
        assertEquals("error in divInt()", 0, Calculator.divInt(1, 7));
    }

    @Test
    public void testDivIntFail() {
        assertNotEquals("error in divInt()", 10, Calculator.divInt(9, 30));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivIntByZero() {
        Calculator.divInt(9, 0); // expect an IllegalArgumentException
    }

}
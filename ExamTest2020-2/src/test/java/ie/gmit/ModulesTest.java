package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModulesTest {
    @Test
    void testModule1()
    {
        Modules Modules = new Modules("Project Management", "Cloud Computing", "Mobile App", "DSP", "Project", "Software Test");
        String Module1 = Modules.getModule1();
        assertEquals("Project Management", Module1);
    }
    @Test
    void testModule2()
    {
        Modules Modules = new Modules("Project Management", "Cloud Computing", "Mobile App", "DSP", "Project", "Software Test");
        String Module2 = Modules.getModule2();
        assertEquals("Cloud Computing", Module2);
    }
    @Test
    void testModule3()
    {
        Modules Modules = new Modules("Project Management", "Cloud Computing", "Mobile App", "DSP", "Project", "Software Test");
        String Module3 = Modules.getModule3();
        assertEquals("Mobile App", Module3);
    }
    @Test
    void testModule4()
    {
        Modules Modules = new Modules("Project Management", "Cloud Computing", "Mobile App", "DSP", "Project", "Software Test");
        String Module4 = Modules.getModule4();
        assertEquals("DSP", Module4);
    }
    @Test
    void testModule5()
    {
        Modules Modules = new Modules("Project Management", "Cloud Computing", "Mobile App", "DSP", "Project", "Software Test");
        String Module5 = Modules.getModule5();
        assertEquals("Project", Module5);
    }
    @Test
    void testModule6()
    {
        Modules Modules = new Modules("Project Management", "Cloud Computing", "Mobile App", "DSP", "Project", "Software Test");
        String Module6 = Modules.getModule6();
        assertEquals("Software Test", Module6);
    }
}

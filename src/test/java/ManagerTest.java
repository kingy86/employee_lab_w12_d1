import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mark Kingy", 555763, 30000.00, "Management");
    }

    @Test
    public void checkGetName(){
        assertEquals("Mark Kingy", manager.getName());
    }

    @Test
    public void checkGetNationalInsurance(){
        assertEquals(555763, manager.getNationalInsurance());
    }

    @Test
    public void checkGetDeptname(){
        assertEquals("Management", manager.getDeptname());
    }

    @Test
    public void checkRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(31000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void checkPayBonus(){
        manager.payBonus();
        assertEquals(30300.00, manager.getSalary(), 0.01);
    }
}

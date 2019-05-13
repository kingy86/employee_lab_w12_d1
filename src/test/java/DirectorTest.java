import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Steve Jobs", 132465, 50000.00, "Management", 100000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Steve Jobs", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber(){
        assertEquals(132465, director.getNationalInsurance());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000.00, 50000.00, director.getSalary());
    }

    @Test
    public void worksInADept(){
        assertEquals("Management", director.getDeptname());
    }

    @Test
    public void hasABudgetToWorkWith(){
        assertEquals(100000.00, 100000.00, director.budgetAmount());
    }
}

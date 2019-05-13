import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jimmy Jones", 735421, 35000.00);
    }

    @Test
    public void getName(){
        assertEquals("Jimmy Jones", databaseAdmin.getName());
    }

    @Test
    public void getNationalInsuranceNumber(){
        assertEquals(735421, databaseAdmin.getNationalInsurance());
    }

    @Test
    public void getSalary(){
        assertEquals(35000.00, 35000.00, databaseAdmin.getSalary());
    }

}
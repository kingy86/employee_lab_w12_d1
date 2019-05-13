import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Grant Rutherford", 345677, 45000.00);
    }

    @Test
    public void getName(){
        assertEquals("Grant Rutherford", developer.getName());
    }

}

import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import javax.crypto.spec.DESedeKeySpec;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
   private Dealership dealership;
    @Before
    public void before(){
        dealership = new Dealership("See it in person", 100.0);
    }
    @Test
    public void canGetName(){
        assertEquals("See it in person", dealership.getName());
    }
    @Test
    public void canGetTil(){
        assertEquals(100.0, dealership.getTill(), 0.01);
    }
    @Test
    public void canGetStockSize(){
        assertEquals(0, dealership.getStockSize());
    }

}


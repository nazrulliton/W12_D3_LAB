import org.junit.Before;
import org.junit.Test;
import people.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;

    @Before
    public void before(){
        customer = new Customer("Bruce Wayne", 1000.0);
    }
    @Test
    public void canGetName(){
        assertEquals("Bruce Wayne", customer.getName());
    }
    @Test
    public void canGetMoney(){
        assertEquals(1000.0, customer.getMoney(), 0.01);

    }
    @Test
    public void ownedVehiclesListStartsEmpty(){
        assertEquals(0, customer.getNumOfVehiclesOwned());
    }



}

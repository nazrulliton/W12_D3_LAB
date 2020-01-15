import components.EngineType;
import components.TyreType;
import org.junit.Before;
import org.junit.Test;
import vehicles.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    private HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar("Prius", "Yellow", EngineType.SLOW, TyreType.BUDGET, 50.0);
    }
    @Test
    public void canGetName(){
        assertEquals("Prius", hybridCar.getName());
    }
    @Test
    public void canGetColour(){
        assertEquals("Yellow", hybridCar.getColour());
    }
    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.SLOW, hybridCar.getEngine());
    }
    @Test
    public void canGetTyreType(){
        assertEquals(TyreType.BUDGET, hybridCar.getTyre());
    }
    @Test
    public void canGetPrice(){
        assertEquals(50.00, hybridCar.getPrice(), 0.01);
    }


}

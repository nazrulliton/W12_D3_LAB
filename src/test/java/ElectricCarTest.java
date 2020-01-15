import components.EngineType;
import components.TyreType;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ElectricCarTest {
   private ElectricCar electricCar;

   @Before
    public void before(){
       electricCar = new ElectricCar("Herbie", "white", EngineType.MEDIUM, TyreType.SNOW, 30.0, 1 );
   }
    @Test
    public void canGetName(){
        assertEquals("Herbie", electricCar.getName());
    }
    @Test
    public void canGetColour(){
        assertEquals("white", electricCar.getColour());
    }
    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.MEDIUM, electricCar.getEngine());
    }
    @Test
    public void canGetTyreType(){
        assertEquals(TyreType.SNOW, electricCar.getTyre());
    }
    @Test
    public void canGetPrice(){
        assertEquals(30.0, electricCar.getPrice(), 0.01);
    }
    @Test
    public void cangetNumOfWindows(){
       assertEquals(1, electricCar.getNumOfTires());
    }


}

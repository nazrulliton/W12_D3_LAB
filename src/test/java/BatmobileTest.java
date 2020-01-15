import components.EngineType;
import components.TyreType;
import org.junit.Before;
import org.junit.Test;
import vehicles.Batmobile;

import static org.junit.Assert.assertEquals;

public class BatmobileTest {
    Batmobile batmobile;

    @Before
    public void before(){
        batmobile = new Batmobile("BasicModel", "Black", EngineType.FAST, TyreType.RACING, 100.00, "Rocket Launcher");
    }
    @Test
    public void canGetName(){
        assertEquals("BasicModel", batmobile.getName());
    }
    @Test
    public void canGetColour(){
        assertEquals("Black", batmobile.getColour());
    }
    @Test
    public void canGetEngineType(){
        assertEquals(EngineType.FAST, batmobile.getEngine());
    }
    @Test
    public void canGetTyreType(){
        assertEquals(TyreType.RACING, batmobile.getTyre());
    }
    @Test
    public void canGetPrice(){
        assertEquals(100.00, batmobile.getPrice(), 0.01);
    }
    @Test
    public void canGetWeapons(){
        assertEquals("Rocket Launcher", batmobile.getWeapons());
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicalAccessoryTest {

    MusicalAccessory accessory;

    @Before
    public void setUp(){
        accessory = new MusicalAccessory("Guitar pick", 6.00, 20.00, "Guitar", "Fender");
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(14, accessory.calculateMarkUp(), 0.01);
    }

    @Test
    public void hasDescription(){
        assertEquals("Guitar pick", accessory.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(6.00, accessory.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(20.00, accessory.getSellPrice(), 0.01);
    }

    @Test
    public void hasInstrument(){
        assertEquals("Guitar", accessory.getInstrument());
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", accessory.getMake());
    }

}

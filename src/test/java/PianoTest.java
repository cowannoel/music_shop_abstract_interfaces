import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Piano", "Wood", "White", "Plinky plink plonk", 1000.00, 2000.00, "Stand up", 88);
    }

    @Test
    public void hasName(){
        assertEquals("Piano", piano.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("White", piano.getColour());
    }

    @Test
    public void hasSound(){
        assertEquals("Plinky plink plonk", piano.getSound());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(1000.00, piano.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(2000.00, piano.getSellPrice(), 0.01);
    }

    @Test
    public void hasStyle(){
        assertEquals("Stand up", piano.getStyle());
    }

    @Test
    public void numberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("When you play the Piano it makes a Plinky plink plonk sound!", piano.play());
    }

}

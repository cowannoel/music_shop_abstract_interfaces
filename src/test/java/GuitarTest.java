import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar", "Mahogany", "Dark mahogany","Twanging", 100, 200, true, 6);
    }

    @Test
    public void isAcoustic(){
        assertEquals(true, guitar.isAcoustic());
    }

    @Test
    public void getNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasName(){
        assertEquals("Guitar", guitar.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Dark mahogany", guitar.getColour());
    }

    @Test
    public void hasSound(){
        assertEquals("Twanging", guitar.getSound());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, guitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200.00, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void canPlay(){
        assertEquals("When you play the Guitar it makes a Twanging sound!", guitar.play());
    }

    @Test
    public void canSellForProfit(){
        assertEquals(100, guitar.calculateMarkUp(), 0.01);
    }

}

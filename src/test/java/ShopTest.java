import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp(){
        shop = new Shop("Soundz");
    }

    @Test
    public void hasName(){
        assertEquals("Soundz", shop.getName());
    }

    @Test
    public void canAddStock(){
        Guitar guitar = new Guitar("Guitar", "Mahogany", "Dark mahogany","Twanging", 100, 200, true, 6);
        shop.addStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        Guitar guitar = new Guitar("Guitar", "Mahogany", "Dark mahogany","Twanging", 100, 200, true, 6);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getStock().size());
    }
}

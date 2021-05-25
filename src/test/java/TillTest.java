import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till till;


    @Before
    public void setUp() {
        till = new Till(20000.00);

    }

    @Test
    public void hasInitialBalance() {
        assertEquals(20000.00, till.getInitialBalance(), 0.01);
    }

    @Test
    public void hasCurrentBalance() {
        assertEquals(20000.00, till.getCurrentBalance(), 0.01);
    }

    @Test
    public void canReduceBalance() {
        till.reduceBalance(5000.00);
        assertEquals(15000.00, till.getCurrentBalance(), 0.01);
    }

    @Test
    public void canIncreaseBalance() {
        till.increaseBalance(5000.00);
        assertEquals(25000.00, till.getCurrentBalance(), 0.01);
    }
}

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void plus() {
        Assert.assertEquals(35, Calc.plus(12,23));
    }
    @Test
    public void minus() {
        Assert.assertEquals(10, Calc.minus(12,2));
    }
    @Test
    public void mul() {
        Assert.assertEquals(24, Calc.mul(12,2));
    }
    @Test
    public void div() {
        Assert.assertEquals(6, Calc.div(12,2));
    }
}
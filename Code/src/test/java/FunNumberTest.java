import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FunNumberTest {
    private FunNumber funNumber;

    @Before
    public void initialized() {
        funNumber = new FunNumber();
    }

    @Test
    public void funNumberTest1() {
        double actualResult = funNumber.findNextSquare(121);
        double expectedResult = 144;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void funNumberTest2() {
        double actualResult = funNumber.findNextSquare(625);
        double expectedResult = 676;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void funNumberTest3() {
        double actualResult = funNumber.findNextSquare(114);
        double expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult, 0);
    }
}

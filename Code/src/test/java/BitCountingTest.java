import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BitCountingTest {
    private BitCounting bitCounting;

    @Before
    public void initialized() {
        bitCounting = new BitCounting();
    }

    @Test
    public void bitCountingTest1() {
        int actualResult = bitCounting.countBits(1234);
        int expectedResult = 5;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void bitCountingTest2() {
        int actualResult = bitCounting.countBits(-5);
        int expectedResult = 0;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void bitCountingTest3() {
        int actualResult = bitCounting.countBits(2);
        int expectedResult = 0;
        Assert.assertFalse(actualResult == expectedResult);
    }
}

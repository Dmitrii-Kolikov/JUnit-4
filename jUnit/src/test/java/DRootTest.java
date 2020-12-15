import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void newNumberShouldHaveSumOfDigits1() {
        assertEquals( "Nope!" , 1, DRoot.sumOfDigits(10));
        // public static void assertEquals(String message, long expected, long actual) {
        //        if (expected != actual) {
        //            failNotEquals(message, expected, actual);
        //        }
    }
    @Test
    public void newNumberShouldHaveSumOfDigits2() {
        assertEquals( "Nope!" , 6, DRoot.sumOfDigits(456));
    }
}

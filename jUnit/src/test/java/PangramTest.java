import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PangramTest {
    private static Pangram v1;

    @BeforeClass
    public static void createNewPangram() {
         v1 = new Pangram();
    }

    @Test
    public void PangramShouldHaveTrue() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertEquals(true, v1.check(pangram1));
    }
    @Test
    public void PangramShouldHaveFalse() {
        String pangram2 = "You shall not pass!";
        assertEquals(false, v1.check(pangram2));
    }
}


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1; // @BeforeClass поле должно быть статическим

//    @Before //запускается перед каждым тестовым методом
//    public void createNewVector() {
//        v1 = new Vector2D(); } // для каждого нашего метода будет создаваться новый объект.

    @BeforeClass //запускается только один раз при запуске теста @BeforeClass методы должны быть статическими.
    public static void createNewVector() {
        v1 = new Vector2D(); //Один объект общий
    }

    @Test
    public void newShouldHaveZeroLength(){
        //assertion -проверить ожидаемый результат совпадает с фактическим
        Assert.assertEquals(0, v1.length(), EPS);
        //  public static void assertEquals(double expected, double actual, double delta) {
        //        assertEquals((String)null, expected, actual, delta); }
    }

    @Test
    public void newShouldHaveZeroX() {
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newShouldHaveZeroY() {
        Assert.assertEquals(0, v1.getY(), EPS);

    }
}

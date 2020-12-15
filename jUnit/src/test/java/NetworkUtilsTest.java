import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1000) //указал 1 секунду
    public void getConnectionShouldReturnFasterThanOneSecond() {
        NetworkUtils.getConnection();
    }
}

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber(){
        MainClass objMainClass = new MainClass();

        int expected = 14;
        int actual = objMainClass.getLocalNumber();

        Assert.assertTrue("Actual value is different from 14", actual == expected);
    }
}
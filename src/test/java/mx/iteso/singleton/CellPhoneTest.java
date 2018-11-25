package mx.iteso.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CellPhoneTest {
    private CellPhone iPhoneXS;
    @Before
    public void setUp() {
        iPhoneXS = new CellPhone();
    }

    @Test
    public void testMessageSent() {
        String result;
        String result2;

        result = iPhoneXS.fastText("Hola mundo", "Madonna");
        result2 = iPhoneXS.slowText("Goodbye", "Jesus");

        Assert.assertEquals("Message: Hola mundo sent faster than Telcel to: Madonna",result);
        Assert.assertEquals("Message: Goodbye sent to: Jesus",result2);
    }

    @Test
    public void testPullMessage() {
        String result;
        String result2;

        result = iPhoneXS.pullFast("iTunes");
        result2 = iPhoneXS.pullSlow("sms");

        Assert.assertEquals("Pulling data from: iTunes",result);
        Assert.assertEquals("Pulling data from: sms",result2);
    }
}

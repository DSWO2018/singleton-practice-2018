package mx.iteso;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingletonTest {

    private Cellphone huawei_Y6_2018;

    @Before
    public void setUp() {
        huawei_Y6_2018 = new Cellphone();
    }

    @Test
    public void testConnections() {

        String conn1 = huawei_Y6_2018.connectSIM1("SIM1");
        String conn2 = huawei_Y6_2018.connectSIM2("SIM2");

        Assert.assertEquals("Your SIM1 is now connected to TELCEL", conn1);
        Assert.assertEquals("Your SIM2 is now connected to AT&T", conn2);
    }

    @Test
    public void testGetData() {

        String data1 = huawei_Y6_2018.getDataSIM1();
        String data2 = huawei_Y6_2018.getDataSIM2();

        Assert.assertEquals("Getting data from TELCEL", data1);
        Assert.assertEquals("Getting data from AT&T", data2);

    }

}

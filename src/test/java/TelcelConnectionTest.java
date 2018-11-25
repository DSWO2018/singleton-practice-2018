import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelcelConnectionTest {
    private DataConnection telcel;

    @Before
    public void setUp(){
        telcel = TelcelConnection.getInstance();
    }
    @Test
    public void connectToNework(){
        assertEquals("Conectado a la red Telcel", telcel.connectToNetwork());
    }

    @Test
    public void getSignal(){
        assertEquals("100% de señal en red Telcel", telcel.getSignal());
    }
}
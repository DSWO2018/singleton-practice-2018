import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtntConnectionTest {
    private DataConnection atnt;

    @Before
    public void setUp(){
        atnt = AtntConnection.getInstance();
    }
    @Test
    public void connectToNework(){
        assertEquals("Conectado a la red Atnt", atnt.connectToNetwork());
    }

    @Test
    public void getSignal(){
        assertEquals("100% de señal en red Atnt", atnt.getSignal());
    }
}
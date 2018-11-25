import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CellphoneTest {
    private Cellphone huaweiiP20;
    private DataConnection atnt;

    @Before
    public void setUp(){
        atnt = AtntConnection.getInstance();
        huaweiiP20 = new Cellphone("3222317467", atnt);
    }
    @Test
    public void call(){
        assertEquals("Marcando al 3222317467", huaweiiP20.call("3222317467"));
    }

    @Test
    public void conectToNetowrk(){
        assertEquals("Conectado a la red Atnt", huaweiiP20.connectToNework());
    }

    @Test
    public void showSignal(){
        assertEquals("100% de señal en red Atnt", huaweiiP20.showSignal());
    }
}
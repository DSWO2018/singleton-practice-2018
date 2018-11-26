

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * test.
 */
public class MobileTest {

    public Mobile movil1;
    public Mobile movil2;


    @Before
    public void setUp() {
        movil1 = new Mobile();
        movil2 = new Mobile();
    }

    @Test
    public void testConnection(){
        movil1.setConexion(new Telcel());
        movil2.setConexion(new Movistar());


        Assert.assertEquals(false, movil1.getConexion().setConnection(new Telcel()));
        Assert.assertEquals(true, movil2.getConexion().setConnection(new Telcel()));
    }

}

/**
 * telcel.
 */
public class Telcel implements Connection {

    /**
     * setC.
     * @param c .
     * @return     */
    @Override
    public boolean setConnection(Connection c) {
        if(c instanceof Telcel){
            return false;
        }
        else{
            c =new Telcel();
        }
        return true;
    }
}

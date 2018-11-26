/**
 * movistar.
 */
public class Movistar implements Connection {

    /**
     * setC.
     * @param c .
     * @return     */
    @Override
    public boolean setConnection(Connection c) {
        if(c instanceof Movistar){
            return false;
        }
        else{
            c =new Movistar();
        }
        return true;
    }
}

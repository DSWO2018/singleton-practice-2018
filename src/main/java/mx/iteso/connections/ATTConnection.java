package mx.iteso.connections;

import mx.iteso.DataConnection;
/**Implementacion de AT&T.*/
public final class ATTConnection implements DataConnection {
    /**Variable de singleton AT&T.*/
    private static DataConnection attConnection;
    /**Comstructor importantemente privado.*/
    private ATTConnection() {

    }
    /**
     * Conseguir conexion.
     * @return instancia de attconnection.
     * */
    public static DataConnection getAttConnection() {
        if (attConnection == null) {
            attConnection = new ATTConnection();
        }
        return attConnection;
    }
    /**
     * Funcion para conectar cel a at&t.
     * @param sim sim2.
     * @return mensaje cool.
     * */
    public String connectCellphone(final String sim) {
        return "Your " + sim + " is now connected to AT&T";
    }
    /**
     * Traer datos de AT&T.
     * @return consiguiendo datos de AT&T.
     * */
    public String getData() {
        return "Getting data from AT&T";
    }
}

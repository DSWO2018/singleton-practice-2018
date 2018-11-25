package mx.iteso.connections;

import mx.iteso.DataConnection;
/**Implementacion de Telcel.*/
public final class TelcelConnection implements DataConnection {
    /**Variable de singleton telcel.*/
    private static DataConnection telcelConnection;
    /**Constructor importantemente privado.*/
    private TelcelConnection() {

    }
    /**
     * Conseguir conexion.
     * @return instancia de telcelconnection.
     * */
    public static DataConnection getTelcelConnection() {
        if (telcelConnection == null) {
            telcelConnection = new TelcelConnection();
        }
        return telcelConnection;
    }

    /**
     * Funcion para conetar cel a telcel.
     * @param sim sim1.
     * @return mensje cool.
     * */
    public String connectCellphone(final String sim) {

        return "Your " + sim + " is now connected to TELCEL";
    }
    /**
     * Traer datos de telcel.
     * @return consiguiendo datos de telcel.
     * */
    public String getData() {
        return "Getting data from TELCEL";
    }
}

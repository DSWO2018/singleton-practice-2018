package mx.iteso;

import mx.iteso.connections.ATTConnection;
import mx.iteso.connections.TelcelConnection;

/**Clase cellphone.*/
public class Cellphone {
    /**
     * Instancia de Telcel.
     * */
    private DataConnection sim1 = TelcelConnection.getTelcelConnection();
    /**
     * Instnacia de AT&T.
     * */
    private DataConnection sim2 = ATTConnection.getAttConnection();

    /**
     * conectar sim1.
     * @param sim .
     * @return connection.
     * */
    public final String connectSIM1(final String sim) {
       return sim1.connectCellphone(sim);
    }

    /**
     * traer datos de telcel.
     * @return datos de telcel.
     * */
    public final String getDataSIM1() {
        return sim1.getData();
    }

    /**
     * conectar sim2.
     * @param sim .
     * @return connection.
     * */
    public final String connectSIM2(final String sim) {
        return sim2.connectCellphone(sim);
    }

    /**
     * traer datos de at&t.
     * @return datos de at&t.
     * */
    public final String getDataSIM2() {
        return sim2.getData();
    }
}

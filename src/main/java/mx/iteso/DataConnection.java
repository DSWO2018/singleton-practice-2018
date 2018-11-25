package mx.iteso;
/**Interface de conexiones de datos.*/
public interface DataConnection {
    /**
     * Conectar celular.
     * @param cellphone celular.
     * @return conexion.
     * */
    String connectCellphone(String cellphone);
    /**
     * Conseguir datos.
     * @return datos.
     * */
    String getData();

}

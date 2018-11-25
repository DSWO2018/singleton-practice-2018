/**AtntConnecion class.*/
public final class AtntConnection implements DataConnection {
    /**variable instance.*/
    private static AtntConnection instance = null;
    /**Constructor.*/
    private AtntConnection() { };
    /**function getInstance.
     *
     * @return AtntConnection.*/
    public static AtntConnection getInstance() {
        if (instance == null) {
            instance = new AtntConnection();
        }
        return instance;
    }
    /**function connectToNetwork.
     * @return String .*/
    @Override
    public String connectToNetwork() {
        return "Conectado a la red Atnt";
    }
    /**function getSignal.
     * @return String .*/
    @Override
    public String getSignal() {
        return "100% de señal en red Atnt";
    }
}

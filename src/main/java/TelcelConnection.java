/**Class TelcelConnection.*/
public final class TelcelConnection implements DataConnection {
    /**Variable isntance.*/
    private static TelcelConnection instance = null;
    /**Constructor.*/
    private TelcelConnection() { };
    /**function getInstance.
     * @return instance.*/
    public static TelcelConnection getInstance() {
        if (instance == null) {
            instance = new TelcelConnection();
        }
        return instance;
    }
    /**function connectToNetwork.
     * @return String .*/
    @Override
    public String connectToNetwork() {
        return "Conectado a la red Telcel";
    }
    /**function getSignal.
     * @return String .*/
    @Override
    public String getSignal() {
        return "100% de señal en red Telcel";
    }
}

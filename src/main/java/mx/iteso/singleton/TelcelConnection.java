package mx.iteso.singleton;

/**
 * Telcel implementation.
 */
public final class TelcelConnection implements DataConnection {
    /**
     * Telcel singleton.
     */
    private static DataConnection telcelInstance;

    /**
     * Private constructor.
     */
    private TelcelConnection() {

    }

    /**
     * Instance getter.
     * @return the singleton.
     */
    public static DataConnection getInstance() {
        if (telcelInstance == null) {
            telcelInstance = new TelcelConnection();
        }
        return telcelInstance;
    }

    /**
     * Post a message.
     * @param msg to sent.
     * @param destiny direction.
     * @return response.
     */
    public String post(final String msg, final String destiny) {
        return "Message: " + msg + " sent to: " + destiny;
    }

    /**
     * Get a message.
     * @param data where to pull.
     * @return response.
     */
    public String get(final String data) {
        return "Pulling data from: " + data;
    }
}

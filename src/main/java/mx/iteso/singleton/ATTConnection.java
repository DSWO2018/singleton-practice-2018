package mx.iteso.singleton;

/**
 * ATT implementation.
 */
public final class ATTConnection implements DataConnection {
    /**
     * ATT singleton.
     */
    private static DataConnection attInstance;

    /**
     * Private constructor.
     */
    private ATTConnection() {

    }

    /**
     * Instance getter.
     * @return the singleton.
     */
    public static DataConnection getInstance() {
        if (attInstance == null) {
            attInstance = new ATTConnection();
        }
        return attInstance;
    }

    /**
     * Post a message.
     * @param msg to sent.
     * @param destiny direction.
     * @return response.
     */
    public String post(final String msg, final String destiny) {
        return "Message: " + msg + " sent faster than Telcel to: " + destiny;
    }

    /**
     * Get a message.
     * @param data where to pull.
     * @return response.
     */
    public String get(final String data) {
        return "Pulling data faster than Telcel from: " + data;
    }
}

package mx.iteso.singleton;

/**
 * DataConnection interface.
 */
public interface DataConnection {
    /**
     * Post a message.
     * @param msg to sent.
     * @param destiny direction.
     * @return response.
     */
    String post(String msg, String destiny);

    /**
     * Get a message.
     * @param data where to pull.
     * @return response.
     */
    String get(String data);
}

package mx.iteso.singleton;

/**
 * CellPhone class.
 */
public class CellPhone {
    /**
     * ATT SIM connection.
     */
    private DataConnection attSIM = ATTConnection.getInstance();
    /**
     * Telcel SIM connection.
     */
    private DataConnection telcelSIM = TelcelConnection.getInstance();

    /**
     * Send a text.
     * @param msg message.
     * @param phone number.
     * @return response.
     */
    public String slowText(final String msg, final String phone) {
        return telcelSIM.post(msg, phone);
    }

    /**
     * Send a faster text.
     * @param msg message.
     * @param phone number.
     * @return response.
     */
    public String fastText(final String msg, final String phone) {
        return attSIM.post(msg, phone);
    }

    /**
     * Pull data.
     * @param data direction.
     * @return response.
     */
    public String pullSlow(final String data) {
        return telcelSIM.get(data);
    }

    /**
     * Pull data faster.
     * @param data direction.
     * @return response.
     */
    public String pullFast(final String data) {
        return telcelSIM.get(data);
    }
}

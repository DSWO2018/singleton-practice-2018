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
     */
    public void slowText(final String msg, final String phone) {
        System.out.println(telcelSIM.post(msg, phone));
    }

    /**
     * Send a faster text.
     * @param msg message.
     * @param phone number.
     */
    public void fastText(final String msg, final String phone) {
        System.out.println(attSIM.post(msg, phone));
    }

    /**
     * Pull data.
     * @param data direction.
     */
    public void pullSlow(final String data) {
        System.out.println(telcelSIM.get(data));
    }

    /**
     * Pull data faster.
     * @param data direction.
     */
    public void pullFast(final String data) {
        System.out.println(telcelSIM.get(data));
    }
}

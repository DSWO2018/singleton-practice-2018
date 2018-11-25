/**CellPhone Class.*/
public class Cellphone {
    /**var phoneNumber.*/
    private String phoneNumber;
    /**var network.*/
    private DataConnection network;
    /**Constructor.
     * @param vPhoneNumber .
     *@param vNetwork .*/
    public Cellphone(final String vPhoneNumber, final DataConnection vNetwork) {
        this.phoneNumber = vPhoneNumber;
        this.network = vNetwork;
    }
    /**function call.
     * @param number .
     * @return String .*/
     public final String call(final String number) {
        return "Marcando al " + number;
     }
    /**function connectToNetwork.
     * @return String .*/
     public final String connectToNework() {
        return network.connectToNetwork();
     }
    /**function showSignal.
     * @return String .*/
     public final String showSignal() {
        return network.getSignal();
     }
}

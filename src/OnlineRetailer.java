public class OnlineRetailer extends AdvertOwner {
    private String webAddress;

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public OnlineRetailer(String fullName, int ADVERT_OWNER_ID, String contactNumber, String webAddress) {
        super(fullName, ADVERT_OWNER_ID, contactNumber);
        setWebAddress(webAddress);
    }
    @Override
    public void advertise() {
        super.advertise();
        System.out.println("Web Address: " + getWebAddress());
    }
}

public class AdvertOwner implements Advertisable {
    private String fullName;
    private int ADVERT_OWNER_ID;
    private String contactNumber;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setADVERT_OWNER_ID(int ADVERT_OWNER_ID) {
        this.ADVERT_OWNER_ID = ADVERT_OWNER_ID;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFullName() {
        return fullName;
    }
    public int getADVERT_OWNER_ID() {
        return ADVERT_OWNER_ID;
    }
    public String getContactNumber() {
        return contactNumber;
    }

    public AdvertOwner(String fullName, int ADVERT_OWNER_ID, String contactNumber) {
        setFullName(fullName);
        setADVERT_OWNER_ID(ADVERT_OWNER_ID);
        setContactNumber(contactNumber);
    }
    @Override
    public void advertise() {
        System.out.println("\nFull Name: " + getFullName());
        System.out.println("Advert Owner ID: " + getADVERT_OWNER_ID());
        System.out.println("Contact Number: " + getContactNumber());
    }
}

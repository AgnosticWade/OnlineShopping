public class ComputerOwner extends AdvertOwner {
    private String occupation;

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public ComputerOwner(String fullName, int ADVERT_OWNER_ID, String contactNumber, String occupation) {
        super(fullName, ADVERT_OWNER_ID, contactNumber);
        setOccupation(occupation);
    }
    @Override
    public void advertise() {
        super.advertise();
        System.out.println("Occupation: " + getOccupation());
    }
}

public class Advert implements Advertisable {
    private int ADVERT_NO;
    private AdvertOwner advertOwner;
    private Computer computer;
    private int price;

    public void setADVERT_NO(int ADVERT_NO) {
        this.ADVERT_NO = ADVERT_NO;
    }
    public void setAdvertOwner(AdvertOwner advertOwner) {
        this.advertOwner = advertOwner;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
        else {
            System.out.println("Price cannot be negative.");
        }
    }
    public int getADVERT_NO() {
        return ADVERT_NO;
    }

    /*
    public AdvertOwner getAdvertOwner() {
        return advertOwner;
    }
    */

    public Computer getComputer() {
        return computer;
    }
    public int getPrice() {
        return price;
    }

    public Advert(int ADVERT_NO, AdvertOwner advertOwner, Computer computer, int price) {
        setADVERT_NO(ADVERT_NO);
        setAdvertOwner(advertOwner);
        setComputer(computer);
        setPrice(price);
    }
    @Override
    public void advertise() {
        System.out.println("Advert No: " + getADVERT_NO());
        advertOwner.advertise();
        computer.advertise();
        System.out.println("Price: " + getPrice());
    }
}

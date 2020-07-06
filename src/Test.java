import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void menu() {
        System.out.println("\n\n\n<<<<<ONLINE SHOPPING SEARCH PROGRAM>>>>>");
        System.out.println("PRESS 1 to search for a computer by the properties you seek");
        System.out.println("PRESS 2 to search for a computer by checking an advert owner");
        System.out.println("PRESS 3 to quit");
        System.out.println("\nPlease enter you choice to continue...");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<AdvertOwner> advertOwnerList = new ArrayList<>();
        // ArrayList<Computer> computerList = new ArrayList<>();
        ArrayList<Advert> advertList = new ArrayList<>();

        // Instances...
        ComputerOwner computerOwner1 = new ComputerOwner("Ozan Sahin", 1, "1000", "Computer Scientist");
        ComputerOwner computerOwner2 = new ComputerOwner("Cem Ceylan", 2, "1001", "Software Engineer");
        // String fullName, int ADVERT_OWNER_ID, String contactNumber, String Occupation
        OnlineRetailer onlineRetailer1 = new OnlineRetailer("Ege Altıok", 3, "1002", "www.egealtıok.com");
        OnlineRetailer onlineRetailer2 = new OnlineRetailer("Mert Yıldız", 4, "1003", "www.mertyıldız.com");
        // String fullName, int ADVERT_OWNER_ID, String contactNumber, String webAddress
        Computer computer1 = new Computer(16, "Windows", "1920*1080", 1024);
        Computer computer2 = new Computer(32, "MacOS", "2880*1800", 512);
        // int ramSize, String operatingSystem, String screenResolution, int hardDriveSize
        Advert advert1 = new Advert(5, computerOwner1, computer1, 16000);
        Advert advert2 = new Advert(6, computerOwner2, computer2, 25000);
        // int ADVERT_NO, AdvertOwner advertOwner, Computer computer, int price

        advertOwnerList.add(computerOwner1);
        advertOwnerList.add(computerOwner2);
        advertOwnerList.add(onlineRetailer1);
        advertOwnerList.add(onlineRetailer2);

        // computerList.add(computer1);
        // computerList.add(computer2);

        advertList.add(advert1);
        advertList.add(advert2);

        boolean t = true;

        while (t) {

            menu();

            int selection = sc.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("Please enter a ram size: ");
                    int myRamSize = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Please enter a screen resolution: ");
                    String myScreenResolution = sc.nextLine();


                    int counter = 0;
                    boolean control = false;

                    for (int i = 0; i < advertList.size(); i++) {

                        if (advertList.get(i).getComputer().getRamSize() == myRamSize || advertList.get(i).getComputer().getScreenResolution().equals(myScreenResolution)) {
                            advertList.get(i).advertise();
                            control = true;
                        }

                        counter++;

                        if (counter == advertList.size() && !control) {
                            System.out.println("\nThere is no matched product...");
                            break;
                        }
                    }

                    System.out.print("Please enter advert no: ");
                    int myADVERT_NO = sc.nextInt();

                    if (control) {
                        for (Advert advert : advertList) {
                            if (advert.getComputer().getRamSize() == myRamSize || advert.getComputer().getScreenResolution().equals(myScreenResolution)) {
                                if (myADVERT_NO == advert.getADVERT_NO()) {
                                    advert.advertise();
                                }
                                else {
                                    System.out.println("\nProduct not found...");
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("\nProduct not found...");
                    }
                    break;
                case 2:
                    boolean secondControl = false;
                    int secondCounter = 0;

                    sc.nextLine();
                    System.out.print("Please enter advert owner's full name: ");
                    String myFullName = sc.nextLine();

                    for (int j = 0; j < advertOwnerList.size(); j++) {
                        if (advertOwnerList.get(j).getFullName().equals(myFullName)) {
                            advertOwnerList.get(j).advertise();
                            secondControl = true;
                        }
                        secondCounter++;

                        if (secondCounter == advertOwnerList.size()) {
                            System.out.println("There is no matched advert...");
                            break;
                        }
                    }

                    System.out.print("Please enter advert no: ");
                    int mySecondADVERT_NO = sc.nextInt();

                    if (secondControl) {
                        for (AdvertOwner advertOwner : advertOwnerList) {
                            if (mySecondADVERT_NO == advertOwner.getADVERT_OWNER_ID()) {
                                advertOwner.advertise();
                            }
                        }
                    } else {
                        System.out.println("Advert not found...");
                    }
                    break;
                case 3:
                    System.out.println("Program terminating...");
                    t = false;
                    break;
                default:
                    System.out.println("Invalid entry...");
                    break;
            }
        }
    }
}

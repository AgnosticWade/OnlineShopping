public class Computer implements Advertisable {
    private int ramSize;
    private String operatingSystem;
    private String screenResolution;
    private int hardDriveSize;

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }
    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public int getRamSize() {
        return ramSize;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getScreenResolution() {
        return screenResolution;
    }
    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public Computer(int ramSize, String operatingSystem, String screenResolution, int hardDriveSize) {
        setRamSize(ramSize);
        setOperatingSystem(operatingSystem);
        setScreenResolution(screenResolution);
        setHardDriveSize(hardDriveSize);
    }
    @Override
    public void advertise() {
        System.out.println("\nRam Size: " + getRamSize());
        System.out.println("Operating System: " + getOperatingSystem());
        System.out.println("Screen Resolution: " + getScreenResolution());
        System.out.println("HardDrive Size: " + getHardDriveSize());
    }
}

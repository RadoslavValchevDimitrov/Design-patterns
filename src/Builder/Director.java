package Builder;

public class Director {

    private PhoneInterface phoneInterface;


    public void constructPhone(PhoneInterface phoneInterface){
        this.phoneInterface = phoneInterface;
        this.phoneInterface.buildDisplay();
        this.phoneInterface.buildBattery();
        this.phoneInterface.integrateOperatingSystem();
    }
}

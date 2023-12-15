package Bridge;

public class IOS implements SystemInterface{
    @Override
    public void integratingSystem(String operatingSystem) {
        System.out.println("Iphone integrating " + operatingSystem);
    }
}

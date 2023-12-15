package Bridge;

public class Android implements SystemInterface{
    @Override
    public void integratingSystem(String operatingSystem) {
        System.out.println("Samsung phone Integrating " + operatingSystem);
    }
}

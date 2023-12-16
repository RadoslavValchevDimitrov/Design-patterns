package Decorator.subdecorator;

public class Client {
    public static void main(String[] args) {

        Car bmw = new BMW();

        StartSystem system = new StartSystem(bmw,7);

        System.out.println("Old start");
        bmw.startEngine();
        System.out.println("New start");
        Car mercedes = new StartSystem(new Mercedes(),2);
        mercedes.startEngine();


    }
}

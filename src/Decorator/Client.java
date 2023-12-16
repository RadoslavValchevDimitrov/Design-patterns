package Decorator;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Samsung();

        Phone decoratedPhone = new PhoneCameraFunction(new Samsung());
        Phone decoratedPhone2 = new PhoneCameraFunction(new Xiaomi());
        System.out.println("Phone with single function");
        phone.call();

        System.out.println("Phone with decorator");
        decoratedPhone.call();
        decoratedPhone2.call();
    }
}

package Factory.Method;

public class Client {
    public static void main(String[] args) {

        PhoneFactory factory = new PhoneFactory();
          Phone phone = factory.phoneFactory("IPHONE");
        Phone phone1 = factory.phoneFactory("Samsung");
        Phone phone2 = factory.phoneFactory("xiaomi");
        phone.ring();
        phone1.ring();
        phone2.ring();
        Phone phone3= StaticFactory.phoneFactory("Iphone");
        phone3.ring();
    }
}

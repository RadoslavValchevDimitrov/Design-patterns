package Bridge;

public class Client {

    public static void main(String[] args) {
        //Integrating Android
        Android android = new Android();
        SamsungPhone samsungPhone = new SamsungPhone(android);
        samsungPhone.startPhone("button");
        samsungPhone.call("Nikoleta",896595265);

        // Integrating IOS

        IOS ios = new IOS();
        Iphone iphone = new Iphone(ios);
        iphone.startPhone("Face ID");
        iphone.call("Radoslav",882266920);

    }
}

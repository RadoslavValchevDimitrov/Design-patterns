package Builder;

public class Client {

    public static void main(String[] args) {


        Director director = new Director();
        PhoneInterface samsung = new Samsung();
        PhoneInterface iphone = new Iphone();
        director.constructPhone(samsung);
        director.constructPhone(iphone);
        Product p1 = samsung.getProduct();
        Product p2 = iphone.getProduct();
        p1.showProduct();
        p2.showProduct();

    }
}

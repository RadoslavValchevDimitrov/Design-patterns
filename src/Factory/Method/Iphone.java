package Factory.Method;

public class Iphone implements Phone{
    @Override
    public void ring() {
        System.out.println("Iphone ringing");
    }
}

package Decorator;

public class Samsung implements Phone{
    @Override
    public void call() {
        System.out.println("Calling with Samsung");
    }
}

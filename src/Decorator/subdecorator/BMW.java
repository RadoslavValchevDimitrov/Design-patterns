package Decorator.subdecorator;

public class BMW implements Car{

    @Override
    public void startEngine(){
        System.out.println("start...BMW is warming up");
    }
}

package Adapter;

public class Client {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        CalculatorInterface adapter = new CalculatorAdapter(circle);
        System.out.println("Area of circle is ");
        System.out.println(adapter.getArea(null));
    }
}

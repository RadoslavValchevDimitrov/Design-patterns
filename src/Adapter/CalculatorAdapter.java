package Adapter;

public class CalculatorAdapter implements CalculatorInterface {

    Calculator calculator;
    Circle circle;

    CalculatorAdapter(Circle c){
        circle =c;
    }
    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();
        Rectangle r = new Rectangle();

        r.length = circle.radius * circle.radius;
        r.width = Math.PI;
        return calculator.getArea(r);

    }
}

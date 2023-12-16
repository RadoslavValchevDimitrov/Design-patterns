package Decorator.subdecorator;

public class StartSystem extends CarDecorator{

    Car decoratedCar;

    private int temperature;

    public StartSystem(Car car,int temperature) {
        super(car);
        this.temperature= temperature;
    }


    @Override
    public void startEngine(){
        heatingSparkPlug(car);
        car.startEngine();

    }

    private void heatingSparkPlug(Car car){
        if(temperature<5){
            System.out.println("Heating spark plug for smooth start ");
        }else{
            System.out.println("Smooth start with new carDecorator technology");
        }
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

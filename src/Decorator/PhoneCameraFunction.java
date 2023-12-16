package Decorator;

public class PhoneCameraFunction extends PhoneDecorator{
    public PhoneCameraFunction(Phone decoratedPhone) {
        super(decoratedPhone);
    }

    @Override
    public void call(){
        decoratedPhone.call();
        takePicture(decoratedPhone);
    }

    private void takePicture(Phone decoratedPhone){
        System.out.println("Now we can take picture with phone CLICK CLICK");
    }
}

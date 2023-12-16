package Decorator;

public abstract class PhoneDecorator implements Phone{

    Phone decoratedPhone;

    public PhoneDecorator(Phone decoratedPhone){
        this.decoratedPhone = decoratedPhone;}

    public void call(){
        decoratedPhone.call();
    }
}

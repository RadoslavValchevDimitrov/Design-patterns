package Bridge;

public class SamsungPhone extends Phone{

    protected SamsungPhone(SystemInterface c){
        super(c);
    }


    //Implementor specific method
    @Override
    void startPhone(String button) {
        System.out.println("Pressing the button to start " + button);
        systemInterface.integratingSystem("Android");

    }

    //abstraction specific method
    @Override
    void call(String contact, long number) {
        System.out.println("Now we are calling to  " +  contact + " with number " + number);
        startPhone(" BUTTON PRESSED");
    }
}

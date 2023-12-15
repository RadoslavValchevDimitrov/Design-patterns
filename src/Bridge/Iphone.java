package Bridge;

public class Iphone extends Phone {

    protected Iphone(SystemInterface c){
        super(c);
    }


    //Implementor specific method
    @Override
    void startPhone(String button) {
        System.out.println(" Face scanning " + button);
        systemInterface.integratingSystem("IOS");

    }

    //abstraction specific method
    @Override
    void call(String contact, long number) {
        System.out.println(" Voice message to call  " +  contact + " with number " + number);
        startPhone(" FACE ID");
    }
}

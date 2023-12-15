package Bridge;

public abstract class Phone {

   protected SystemInterface systemInterface;

    protected Phone(SystemInterface s){
        this.systemInterface = s;
    }

    abstract void startPhone(String button);

    abstract void call(String contact, long number);
}

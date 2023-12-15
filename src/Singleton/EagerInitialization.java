package Singleton;

public class EagerInitialization {

    //With this approach we rely on JVM to create the unique instance
    //The JVM guarantees that the instance will be created before any thread access the static singleton variable

    //This approach will create instance even client does not need and might not be using it

    private static EagerInitialization singleton = new EagerInitialization();

    private EagerInitialization(){}

    public static EagerInitialization getInstance(){
        return singleton;
    }
}

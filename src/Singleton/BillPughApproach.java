package Singleton;

public class BillPughApproach {

    private BillPughApproach(){}



    private static class Singleton{
        //Nested class is referenced after getInstance() is called

        private static final BillPughApproach singleton = new BillPughApproach();

        //WHEN BILLPUGHAPPROACH CLASS IS LOADED, THE SINGLETON CLASS IS NOT LOADED INTO MEMORY
        //ONLY WHEN SOMEONE CALLS THE GET INSTANCE METHOD
        // THIS CLASS WILL THEN LOADED AND CREATE THE SINGLETON CLASS INSTANCE
    }



    public static BillPughApproach getInstance(){
        return Singleton.singleton;

    }
}

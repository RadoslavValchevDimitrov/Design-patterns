package Command;

public class Stock {

    private String shirt =  "New Balance Shirt";
    private int quantity =50;

    public void buy(){
        System.out.println("You are buying  " + quantity + " " + shirt);
    }

    public void sell(){
        System.out.println("You are selling  " + quantity + " " + shirt);
    }

}

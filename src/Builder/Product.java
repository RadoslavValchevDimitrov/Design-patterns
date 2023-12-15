package Builder;

import java.util.LinkedList;

public class Product {

    private LinkedList<String> partsList;


    public Product(){
        partsList = new LinkedList<String>();
    }

    public void addPartToPhone(String part){

        partsList.addLast(part);
    }

    public void showProduct (){
        for(var p:partsList){
            System.out.println(p);
        }
    }
}

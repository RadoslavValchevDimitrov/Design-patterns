package Command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private Order order;

    private List<Order> orderList = new ArrayList<>();



    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrder(){
        for(var o:orderList){
            o.execute();
        }
        //orderList.clear();
    }


}

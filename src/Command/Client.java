package Command;

public class Client {

    public static void main(String[]args){


        Stock stock = new Stock();
        BuyStock buy = new BuyStock(stock);
        SellStock sell = new SellStock(stock);

        Broker b = new Broker();
        b.takeOrder(buy);
        b.takeOrder(sell);
        b.placeOrder();
    }
}

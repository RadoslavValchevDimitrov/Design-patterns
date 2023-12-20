package Command;

public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock myStock){
        stock = myStock;
    }
    @Override
    public void execute() {
        stock.buy();
    }
}

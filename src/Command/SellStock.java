package Command;

public class SellStock implements Order{

    private Stock stock;

    public SellStock(Stock myStock){
        stock = myStock;
    }


    @Override
    public void execute() {
        stock.sell();
    }
}

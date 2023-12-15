package Builder;

public class Iphone implements PhoneInterface{

    private Product product = new Product();
    @Override
    public void buildDisplay() {
        product.addPartToPhone("Super strong display");
    }

    @Override
    public void buildBattery() {
        product.addPartToPhone("Battery for 1 day");
    }

    @Override
    public void integrateOperatingSystem() {
        product.addPartToPhone("IOS System");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

package Builder;

public class Samsung implements PhoneInterface{

    Product product = new Product();
    @Override
    public void buildDisplay() {
     product.addPartToPhone("Super Modern Display");
    }

    @Override
    public void buildBattery() {
        product.addPartToPhone("Battery for 7 days");
    }

    @Override
    public void integrateOperatingSystem() {
        product.addPartToPhone("Android System");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

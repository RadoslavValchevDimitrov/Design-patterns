package Proxy;

public class Internet implements InternetInterface{
    @Override
    public void connectTo(String serverHost) throws Exception{
        System.out.println("Connecting to " +  serverHost);
    }
}

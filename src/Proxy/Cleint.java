package Proxy;

public class Cleint {

    public static void main(String[] args) throws Exception {
        InternetInterface proxy = new ProxyInternet();

        try {

            proxy.connectTo("www.fashiondays.com");
            proxy.connectTo("www.capital.bg");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

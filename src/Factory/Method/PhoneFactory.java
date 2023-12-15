package Factory.Method;

public class PhoneFactory {

    public Phone phoneFactory(String phoneBrand){
        if(phoneBrand==null){
            return null;
        }else if(phoneBrand.equalsIgnoreCase("iphone")){
            return new Iphone();
        }else if(phoneBrand.equalsIgnoreCase("SAMSUNG")){
            return new Samsung();
        }else if(phoneBrand.equalsIgnoreCase("XiaomI")){
            return new Xiaomi();
        }
        return null;
    }
}

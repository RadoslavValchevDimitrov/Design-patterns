package Prototype;

import java.util.HashMap;
import java.util.Map;

public class PhoneCache {

    private static Map<Integer,Phone> hashmap = new HashMap<>();

    public static Phone getPhone(Integer id ){
        Phone cachedPhone = hashmap.get(id);
        return (Phone) cachedPhone.clone();
    }


    public static void loadData(){
        Iphone iphone = new Iphone();
        iphone.setId(1);
        hashmap.put(iphone.getId(),iphone);
        Samsung samsung = new Samsung();
        samsung.setId(2);
        hashmap.put(samsung.getId(),samsung);
        Xiaomi xiaomi = new Xiaomi();
        xiaomi.setId(3);
        hashmap.put(xiaomi.getId(),xiaomi);
    }


}

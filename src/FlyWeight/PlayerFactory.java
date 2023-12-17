package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static Map<String,Player> hm = new HashMap<>();

    public static Player getPlayer(String type){
        Player p = null;
        if(hm.containsKey(type)){
         p = hm.get(type);
        }else{
            switch(type){
                case "Forward":
                    System.out.println("Forward is created");
                    p = new Forward();
                    break;
                case "Midfielder":
                    System.out.println("Midfielder is created");
                    p = new Midfielder();
                    break;
                case "Defender":
                    System.out.println("Defender is created");
                    p = new Defender();
            }
            hm.put(type,p);
        }
      return p;
    }
}

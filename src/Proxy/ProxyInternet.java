package Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements InternetInterface{

    Internet internet = new Internet();

    private static List<String>bannedSites;

    static{
        bannedSites = new ArrayList<>();
        bannedSites.add("www.sportal.bg");
        bannedSites.add("www.capital.bg");
        bannedSites.add("www.petel.bg");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {

        if(bannedSites.contains(serverHost.toLowerCase())){
            throw  new Exception("Access denied");
        }
        internet.connectTo(serverHost);
        }
    }


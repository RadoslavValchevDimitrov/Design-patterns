package FlyWeight;

import java.util.Random;

public class Client {

    private static String[] playerType={"Forward","Midfielder","Defender"};

    private static String[] teams = {"Lazio","Inter","Juventus","Roma","Bologna","Milan","Fiorentina","Napoli"};


    private static String getRandomPlayerType(){
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return  playerType[randInt];
    }

    private static String getRandomTeam(){
        Random r = new Random();
        int randInt = r.nextInt(teams.length);
        return teams[randInt];
    }

    public static void main(String[] args) {

        for(int i =0;i<10;i++){
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());
            p.assignTeam(getRandomTeam());
            p.responsibility();
        }

    }
}

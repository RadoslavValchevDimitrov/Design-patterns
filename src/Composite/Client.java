package Composite;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        Owner owner = new Owner("Claudio","Lotito","Owner");
        Owner director = new Owner("Igli","Tare","Director");
        Owner scout = new Owner("Fabrizio","Ravanelli","Scout");
        Owner coach = new Owner("Maurizio","Sari","HeadCoach");
        Owner coachAssistent = new Owner("Simone","Inzaghi","Coach Assistent");

        Player player = new Player("Immobile",17,"Forward");
        Player player1 = new Player("Alberto",10,"Midfielder");
        Player player2 = new Player("Hisaj",3,"Deffender");
        Player player3 = new Player("Provedel",1,"Goalkeeper");

        owner.addPlayerToTeam(director);

        director.addPlayerToTeam(coach);


        coach.addPlayerToTeam(coachAssistent);
        coach.addPlayerToTeam(player);
        coach.addPlayerToTeam(player1);
        coach.addPlayerToTeam(player2);
        coach.addPlayerToTeam(player3);

        List<Team> ownerList= owner.getTeamList();
        System.out.println("<<<OWNER>>>");
       for(var t:ownerList){
           System.out.println(t.getDetails());
       }
        System.out.println("<<<DIRECTOR>>");
        List<Team> directorTeamList= director.getTeamList();

        for(var t:directorTeamList){
            System.out.println(t.getDetails());
        }
        System.out.println("<<<COACH>>>");
        List<Team> coachList= coach.getTeamList();

        for(var t:coachList){
            System.out.println(t.getDetails());
        }



    }
}

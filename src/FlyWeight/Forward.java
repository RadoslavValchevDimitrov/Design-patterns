package FlyWeight;

public class Forward implements Player{

    private final String response;

    private String team;

    public Forward() {
        this.response = "SCORE GOAL";
    }

    @Override
    public void assignTeam(String team) {
      this.team = team;
    }

    @Override
    public void responsibility() {
        System.out.println("Forward from " +  team + " is responsible for " + response);
    }
}

package FlyWeight;

public class Midfielder implements Player{

    private final String response;

    private String team;

    public Midfielder() {
        this.response = "BUILDING ATTACKS";
    }

    @Override
    public void assignTeam(String team) {
        this.team = team;
    }

    @Override
    public void responsibility() {
        System.out.println("Midfielder from " +  team + " is responsible for " + response);
    }
}

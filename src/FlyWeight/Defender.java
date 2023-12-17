package FlyWeight;

public class Defender implements Player {
    private final String response;

    private String team;

    public Defender() {
        this.response = "PROTECT THE GOALKEEPER";
    }

    @Override
    public void assignTeam(String team) {
        this.team = team;
    }

    @Override
    public void responsibility() {
        System.out.println("Defender from " +  team + " is responsible for " + response);
    }
}

package Composite;

public class Player implements Team{

    private String firstName;
    private int shirtNumber;
    private String position;

    public Player(String firstName, int shirtNumber, String position) {
        this.firstName = firstName;
        this.shirtNumber = shirtNumber;
        this.position = position;
    }

    @Override
    public String getDetails() {
        return "Player " + firstName + " with number " + shirtNumber + " in the position " + position;
    }
}

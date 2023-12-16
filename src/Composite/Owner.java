package Composite;

import java.util.ArrayList;
import java.util.List;

public class Owner implements Team{

    private String firstName;
    private String lastName;
    private String jobTitle;

    private List<Team>teamList;

    public Owner(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        teamList = new ArrayList<>();
    }

    public void addPlayerToTeam(Team player){
        teamList.add(player);
    }

    public void removePlayerFromTeam(Team player){
        teamList.remove(player);
    }


    @Override
    public String getDetails() {
        return "Name:  " + firstName + " " + lastName + " is the  " + jobTitle + " of the club";
    }

    public List<Team> getTeamList() {
        return teamList;
    }
}

import java.util.*;

public class League {

    private List<Team> teams = Arrays.asList(
            new Team("Chelsea", 5),
            new Team("Manchester City", 4),
            new Team("Arsenal", 3),
            new Team("Manchester United", 13),
            new Team("Tottenham Hotspur", 0),
            new Team("Blackburn Rovers", 1),
            new Team("Leicester City", 1)
    );

    public List<Team> getTeams() {
        return teams;
    }

    public List<Team> teamsSortedByVictories() {
        Collections.sort(teams);
        return teams;
    }
}

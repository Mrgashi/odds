
public class Team extends Methods implements Comparable<Team> {

    private String name;
    private int victories;

    public Team(String name, int victories) {
        this.name = name;
        this.victories = victories;
    }

    public String info() {
        this.name = name;
        this.getVictories();

        if (victories <= 0) {
            return name + " has never won Premier League.";
        } else if (victories == 4) {
            return name + " has won Premier League more than ";
        } else if (victories == 1) {
            return name + " has won Premier League once.";
        }
        return name + " has won Premier League " + victories + " times.";
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }


    @Override
    public int compareTo(Team team) {
        if (team.getVictories() > this.victories) {
            return 1;
        } else if (team.victories < this.victories) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class Methods {


    public static String mostWins(Team teamOne, Team teamTwo) {

        if (teamOne.getVictories() < teamTwo.getVictories()) {
            return teamOne.getName() + " has won Premier League less than " + teamTwo.getName();
        } else if (teamTwo.getVictories() < teamOne.getVictories()) {
            return teamOne.getName() + " has won Premier League more than " + teamTwo.getName();
        } return "null";
    }

    public static int calculatePayoutOrProfit(int wagetAmount, int odds, boolean calculateNetProfit) {
        int result = wagetAmount * odds;
        if (calculateNetProfit) {
            return result - wagetAmount;
        }
        return result;
    }

    public static int numberOfMatchesPrTeam(int numberOfTeamsInLeague) {
        return (int) (numberOfTeamsInLeague * 1.9);
    }

    public static int numberOfMatchesTotalInASeason(int numberOfTeamsInLeague) {

        return numberOfTeamsInLeague * numberOfMatchesPrTeam((int) (numberOfTeamsInLeague / 1.9));
    }

    public static int calculatePoints(int wins, int draws, int losses) {

        float points = 3 * wins + draws + (losses / 4);
        return (int) points;

    }

    public static int calculatePlayersLeft(int players, int amountOfRedCards) {
        return players - amountOfRedCards;
    }

}

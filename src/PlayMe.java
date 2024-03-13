public class PlayMe extends physicalGame {
    protected Boolean jabberWocky;

    public PlayMe(String title, double cost, double time, double rating, String physicalType, int playerCount, boolean jabberWocky) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.jabberWocky = jabberWocky;

    }
}

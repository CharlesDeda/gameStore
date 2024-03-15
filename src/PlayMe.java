public class PlayMe extends digitalGame {
    //The Constructor: PlayMe pm = new PlayMe("Play Me", 40.00, "10 Minutes", 5.6, "Board Game", 6, True)
    //Dice game where players choose one of six characters with abilities and try to assemble their dice first. During the game, the Jabberwocky can awaken.
    private Boolean jabberWocky;
    // Game contains Jabberwocky Fucntionality

    public PlayMe(String title, double cost, String time, double rating, String digitalType, int playerCount, boolean jabberWocky) {
        super(title, cost, time, rating, digitalType, playerCount);
        this.jabberWocky = jabberWocky;

    }
    //Accessors and Mutators
    public boolean getJabberWocky() {return jabberWocky;}
    public void setJabberWocky(boolean jabberWocky2) {this.jabberWocky = jabberWocky2;}
    //String Method
    public String toString() {
        return super.toString() + String.format("JabberWocky: %-10b",
                getJabberWocky()
        );
    }
}

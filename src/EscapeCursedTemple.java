public class EscapeCursedTemple extends physicalGame {
    //The Constructor: EscapeCursedTemple ect = new EscapeCursedTemple("Escape: The Curse of the Temple", 150.00, "11 Minutes", 7.2, "Board Game", 5, 2)
    //Board game
    private int soundtrack;
    // Game has two separate music tracks that can be used for the game. Oddly enough, neither track contains Wonderwall.

    public EscapeCursedTemple(String title, double cost, double time, double rating, String physicalType, int playerCount, int Soundtrack) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.soundtrack = Soundtrack;

    }
    //Accessors and Mutators
    public int getSoundtrack() {return soundtrack;}
    public void setSoundtrack(int Soundtrack) {this.soundtrack = Soundtrack;}
    //String Method
    public String toString() {
        return super.toString() + String.format("%s%d%s",
                "Game comes with ",getSoundtrack(), " music tracks for use with the game!(Note - Does not contain Wonderwall)"
        );
    }
}

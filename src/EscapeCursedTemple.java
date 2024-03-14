public class EscapeCursedTemple extends physicalGame {
    //The Constructor: EscapeCursedTemple ect = new EscapeCursedTemple("Escape: The Curse of the Temple", 150.00, "11 Minutes", 7.2, "Board Game", 5, 2)
    //Board game
    private String soundtrack;
    // Game has two separate music tracks that can be used for the game. Oddly enough, neither track contains Wonderwall.

    public EscapeCursedTemple(String title, double cost, String time, double rating, String physicalType, int playerCount, String Soundtrack) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.soundtrack = Soundtrack;

    }
    //Accessors and Mutators
    public String getSoundtrack() {return soundtrack;}
    public void setSoundtrack(String Soundtrack) {this.soundtrack = Soundtrack;}
    //String Method
    public String toString() {
        return super.toString() + String.format("%-10s",
                getSoundtrack()
        );
    }
}

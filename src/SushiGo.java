public class SushiGo extends physicalGame{
    //This is a card game much like spoons, where you try to get the best combination of cards before your opponents but there is a point system.
    private int hand;
    //Type of cards or amount in starting hand? (7)
    //private String cards

    public SushiGo(String title, double cost, double time, double rating, String physicalType, int playerCount) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.hand = hand;
    }

    public int getHand() {return hand;}
    public int setHand(int hand) { return this.hand=hand;}
}

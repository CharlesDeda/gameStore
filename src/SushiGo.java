public class SushiGo extends physicalGame{
    //This is a card game much like spoons, where you try to get the best combination of cards before your opponents but there is a point system.
    private String hand;
    //Type of cards or amount in starting hand? (7)
    //private String cards

    public SushiGo(String title, double cost, String time, double rating, String physicalType, int playerCount, String hand) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.hand = hand;
    }

    public String getHand() {return hand;}
    public void setHand(String hand) { this.hand=hand;}
    public String toString() {
        return super.toString() + String.format("Hand: %-7s",
                getHand()
        );
    }
}

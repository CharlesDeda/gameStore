public class SushiGo extends physicalGame{
    /**
     * This is a card game much like spoons, where you try to get the best combination of cards
     * before your opponents but there is a point system.
     */

    //Variable
    private int hand;
    //Type of cards or amount in starting hand? (7)

    //Constructor
    public SushiGo(String title, double cost, double time, double rating, String physicalType, int playerCount) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.hand = hand;
    }

    //Getter and Setter
    public int getHand() {return hand;}
    public void setHand(int hand) {this.hand=hand;}

    //Display
    public String toString() {
        return super.toString() + String.format("%-7d",
                getHand()
        );
    }
}

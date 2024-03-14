/*
@Description: Poetry for neanderthals is a board game that gives players cards, the goal of the game is to make the players guess whats on the card only using sounds
@Param card: Card is the String that the players are trying to guess
 */
public class PoetryForNeanderthals extends physicalGame {
    private String card;
    public PoetryForNeanderthals(String title, double cost, String time, double rating, String physicalType, int playerCount, String card) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.card = card;
    }

    //Getters and Setters
    private String getCard() {return card;}
    public void setCard(String card) {this.card = card;}

    public String toString() {
        return super.toString() + String.format("%-10s",
                getCard()
        );
    }
}

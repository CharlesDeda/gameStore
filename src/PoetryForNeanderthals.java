public class PoetryForNeanderthals extends physicalGame {
    private String card;
    public PoetryForNeanderthals(String title, double cost, double time, double rating, String physicalType, int playerCount, String card) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.card = card;
    }
    private String getCard() {return card;}
    public void setCard(String card) {this.card = card;}

    public String toString() {
        return super.toString() + String.format("%-10s",
                getCard()
        );
    }
}

/**
 *
 * @desc Creates the BetrayalAtHouseOnTheHill game class and it also adds a
 * Betrayer variable which allows you to input who the Betrayer is
 */
public class BetrayalAtHouseOnTheHill extends physicalGame {
    private String Betrayer;

    // the BetrayalAtHouseOnTheHill constructor using the super class constructor as well
    public BetrayalAtHouseOnTheHill(String title, double cost, String time, double rating, String physicalType,
                                    int playerCount, String Betrayer) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.Betrayer = Betrayer;
    }
    // getters and setters
    private String getBetrayer() {return Betrayer;}
    public void setBetrayer(String Betrayer) {this.Betrayer = Betrayer;}

    // toString method
    public String toString() {
        return super.toString() + String.format("Betrayer: %-10s",
                getBetrayer());
    }
}

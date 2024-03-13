/**
 *
 * @desc Creates the Loonacy game class and it also adds a
 * FreeForAll variable which allows you to set the game as a free for all
 */
public class Loonacy extends physicalGame {
    private Boolean FreeForAll;

    // the Loonacy constructor using the super class constructor as well
    public Loonacy(String title, double cost, double time, double rating, String physicalType,
                 int playerCount, Boolean FreeForAll) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.FreeForAll = FreeForAll;
    }
    // getters and setters
    private Boolean getFreeForAll() {return FreeForAll;}
    public void setFreeForAll(Boolean FreeForAll) {this.FreeForAll = FreeForAll;}

    // toString method
    public String toString() {
        return super.toString() + String.format("%-10b",
                getFreeForAll());
    }
}



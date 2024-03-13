/**
 *
 * @desc Creates the Fluxx game class and it also adds a
 * version variable which allows you to input what version of
 * the game you are playing
 */
public class Fluxx extends physicalGame {
    private String version;

    // the fluxx constructor using the super class constructor as well
    public Fluxx(String title, double cost, double time, double rating, String physicalType,
                 int playerCount, String version) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.version = version;
    }
    // getters and setters
    private String getVersion() {return version;}
    public void setVersion(String version) {this.version = version;}

    // toString method
    public String toString() {
        return super.toString() + String.format("%-10s",
                getVersion());
    }
}


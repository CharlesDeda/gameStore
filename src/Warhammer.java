public class Warhammer extends physicalGame{
    /**
     * Tabletop game with little figures, like Dungeouns and Dragons
     */

    //Variable
    public String minifigure;

    //Constructor
    public Warhammer(String title, double cost, double time, double rating, String physicalType, int playerCount) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.minifigure = minifigure;
    }

    //Setter and Getter
    public String getMinifigure() {return minifigure;}
    public void setMinifigure(String minifigure) {this.minifigure=minifigure;}

    //Display
    public String toString () {
        return super.toString() + String.format("%-20s",
                getMinifigure()
        );
    }
}

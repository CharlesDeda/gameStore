public class Warhammer extends physicalGame{
    //Tabletop game with little figures
    public String minifigure;

    public Warhammer(String title, double cost, String time, double rating, String physicalType, int playerCount, String minifigure) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.minifigure = minifigure;
    }
    public String getMinifigure() {return minifigure;}
    public String setMinifigure(String minifigure) { return this.minifigure=minifigure;}
    public String toString () {
        return super.toString() + String.format("MiniFigure: %-20s",
                getMinifigure()
        );
    }
}

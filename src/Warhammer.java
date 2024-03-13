public class Warhammer extends physicalGame{
    //Tabletop game with little figures
    public String minifigure;

    public Warhammer(String title, double cost, double time, double rating, String physicalType, int playerCount) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.minifigure = minifigure;
    }
    public String getMinifigure() {return minifigure;}
    public String setMinifigure(String minifigure) { return this.minifigure=minifigure;}
}

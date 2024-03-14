public class Tetris extends digitalGame {
    //The Constructor: Tetris ts = new Tetris("Tetris", 5.00, "15 Minutes", 9.5, "Puzzler", 2, "T's, Z's, L's, J's, S', Square, The I")
    //The Classic puzzle game - what even needs to be said? Other than every copy I play is hacked and way harder than when my brother decides to play.
    private String shapes;
    // The tools that you must use to battle the inevitability of life - but you will not go quietly into that dark.

    public Tetris(String title, double cost, double time, double rating, String physicalType, int playerCount, String shapes) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.shapes = shapes;

    }
    //Accessors and Mutators
    public String getShapes() {return shapes;}
    public void setShapes(String Shapes) {this.shapes = Shapes;}
    //String Method
    public String toString() {
        return super.toString() + String.format("%s%s",
                "Shapes Used: ", getShapes()
        );
    }
}

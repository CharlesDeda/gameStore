public class Tetris extends digitalGame {
    //The Constructor: Tetris ts = new Tetris("Tetris", 5.00, "15 Minutes", 9.5, "Puzzler", 2, "T's, Z's, L's, J's, S', Square, The I")
    //The Classic puzzle game - what even needs to be said? Other than every copy I play is hacked and way harder than when my brother decides to play.
    private String shapes;
    // The tools that you must use to battle the inevitability of life - but you will not go quietly into that dark.

    public Tetris(String title, double cost, String time, double rating, String digitalType, int playerCount, String shapes) {
        super(title, cost, time, rating, digitalType, playerCount);
        this.shapes = shapes;

    }
    //Accessors and Mutators
    public String getShapes() {return shapes;}
    public void setShapes(String Shapes) {this.shapes = Shapes;}
    //String Method
    public String toString() {
        return super.toString() + String.format("Shapes: %-10s",
                getShapes()
        );
    }
}

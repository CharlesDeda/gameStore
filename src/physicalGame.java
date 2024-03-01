public class physicalGame extends Games {
    protected String physicalType;
    public physicalGame(String title, double cost, int playerCount, double time, double rating, String physicalType) {
        super(title, cost, playerCount, time, rating);
        this.physicalType = physicalType;
    }
    private String getPhysicalType() {return physicalType;}
    public String setPhysicalType(String physicalType) {return this.physicalType = physicalType;}
}

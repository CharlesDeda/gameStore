public class physicalGame extends Games {
    protected String physicalType;
    protected int playerCount;
    public physicalGame(String title, double cost, double time, double rating, String physicalType, int playerCount) {
        super(title, cost, time, rating);
        this.physicalType = physicalType;
        this.playerCount = playerCount;
    }
    private String getPhysicalType() {return physicalType;}

    private int getplayerCount() {return playerCount;}

    public void setPlayerCount(int playerCount) {this.playerCount = playerCount;}
    public void setPhysicalType(String physicalType) {this.physicalType = physicalType;}
}

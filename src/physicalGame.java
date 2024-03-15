public class physicalGame extends Games {
    protected String physicalType;
    protected int playerCount;
    public physicalGame(String title, double cost, String time, double rating, String physicalType, int playerCount) {
        super(title, cost, time, rating);
        this.physicalType = physicalType;
        this.playerCount = playerCount;
    }
    protected String getPhysicalType() {return physicalType;}

    protected int getplayerCount() {return playerCount;}

    public void setPlayerCount(int playerCount) {this.playerCount = playerCount;}
    public void setPhysicalType(String physicalType) {this.physicalType = physicalType;}
    public String toString() {
        return super.toString() + String.format("Type: %-15s Player Count: %-10d",
                getPhysicalType(),
                getplayerCount()
        );

    }
}

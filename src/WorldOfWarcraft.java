public class WorldOfWarcraft extends digitalGame {
    private String race;
    public WorldOfWarcraft(String title, double cost, double time, double rating, String physicalType, int party, String race) {
        super(title, cost, time, rating, physicalType, party);
        this.race = race;
    }
    private String getRace() {return race;}
    public void setRace(String race) {this.race = race;}


    public String toString() {
        return super.toString() + String.format("%-10s",
                getRace()
        );
    }
}

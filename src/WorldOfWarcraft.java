public class WorldOfWarcraft extends digitalGame {
    private String race;
    private String class;
    public WorldOfWarcraft(String title, double cost, double time, double rating, String physicalType, int party, String race, String class) {
        super(title, cost, time, rating, physicalType, party);
        this.race = race;
        this.class = class
    }
}

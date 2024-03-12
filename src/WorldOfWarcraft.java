public class WorldOfWarcraft extends digitalGame {
    private String race;
    private String wowClass;
    public WorldOfWarcraft(String title, double cost, double time, double rating, String physicalType, int party, String race, String wowClass) {
        super(title, cost, time, rating, physicalType, party);
        this.race = race;
        this.wowClass = wowClass;
    }
    private String getRace() {return race;}
    private String getwowClass() {return wowClass;}
    public void setWowClass(String wowClass) {this.wowClass = wowClass;}
    public void setRace(String race) {this.race = race;}


    public String toString() {
        return super.toString() + String.format("%-10s %-10s",
                getRace(),
                getwowClass()
        );
    }
}

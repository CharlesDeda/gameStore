/*
@Description World of Warcraft is a massive multiplayer online game that allows users to select a class and race and participate in quests and stories
@Param race: String that depicts race of character
@Param class: String that depicts class of character
 */
public class WorldOfWarcraft extends digitalGame {
    private String race;
    private String wowClass;
    public WorldOfWarcraft(String title, double cost, double time, double rating, String physicalType, int party, String race, String wowClass) {
        super(title, cost, time, rating, physicalType, party);
        this.race = race;
        this.wowClass = wowClass;
    }
    //Getters and Setters
    private String getRace() {return race;}
    public void setRace(String race) {this.race = race;}

    private String getWowClass() {return wowClass;}
    public void setWowClass(String wowClass) {this.wowClass = wowClass;}

    public String toString() {
        return super.toString() + String.format("%-10s",
                getRace(),
                getWowClass()
        );
    }
}

public class MarioKart extends digitalGame{
    //I am going to be referencing the WII game version for easy of use
    private String character;
    private String kart;
    private String format;
    //The format for this would be a two or three option question. Battle(VS), or race(GrandPre). (can be more specific)
    private String track;
    //which track/map is to be played on

    public MarioKart(String title, double cost, double time, double rating, String physicalType, int party) {
        super(title, cost, time, rating, physicalType, party);
        this.character = character;
        this.kart = kart;
        this.format = format;
        this.track = track;
    }
    public String getCharacter() {return character;}
    public String getKart() {return kart;}
    public String getFormat() {return format;}
    public String getTrack() {return track;}
    public String setCharacter(String character) {return this.character=character;}
    public String setKart(String kart) { return this.kart=kart;}
    public String setFormat(String format) { return this.format=format;}
    public String setTrack(String track) { return this.track= track;}
    public String toString() {
        return super.toString() + String.format("%-12s%-16s%-10s%-20s",
                getCharacter(),
                getKart(),
                getFormat(),
                getTrack()
        );
    }
}

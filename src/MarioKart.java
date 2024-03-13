public class MarioKart extends digitalGame{
    /**
     * There are multiple versions of this game, so I went with one that I am most familiar with (wii version).
     * In Mario Kart, players will choose what gamemode they want to play, then they will choose a character
     * and kart, and lastly choose which track they want to play on. The goal changes depending on the gamemode,
     * for battle, you want to be the team with most points, for Grand Prix, you want to get closest to first to win
     */

    //Variables for class
    private String character;
    private String kart;
    private String format;
    //The format for this would be a two or three option question. Battle(VS), or race(GrandPrix). (can be more specific)
    private String track;
    //which track/map is to be played on

    //Constructor
    public MarioKart(String title, double cost, double time, double rating, String physicalType, int party) {
        super(title, cost, time, rating, physicalType, party);
        this.character = character;
        this.kart = kart;
        this.format = format;
        this.track = track;
    }

    //Gettes and Setters
    public String getCharacter() {return character;}
    public String getKart() {return kart;}
    public String getFormat() {return format;}
    public String getTrack() {return track;}
    public void setCharacter(String character) {this.character=character;}
    public void setKart(String kart) {this.kart=kart;}
    public void setFormat(String format) {this.format=format;}
    public void setTrack(String track) {this.track= track;}

    //Display
    public String toString() {
        return super.toString() + String.format("%-12s%-16s%-10s%-20s",
                getCharacter(),
                getKart(),
                getFormat(),
                getTrack()
        );
    }
}

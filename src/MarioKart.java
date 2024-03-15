public class MarioKart extends digitalGame{
    //I am going to be referencing the WII game version for easy of use
    private String character;
    private String kart;
    private String track;
    //which track/map is to be played on

    public MarioKart(String title, double cost, String time, double rating, String digitalType, int party, String character, String kart, String track) {
        super(title, cost, time, rating, digitalType, party);
        this.character = character;
        this.kart = kart;
        this.track = track;
    }
    public String getCharacter() {return character;}
    public String getKart() {return kart;}

    public String getTrack() {return track;}
    public String setCharacter(String character) {return this.character=character;}
    public String setKart(String kart) { return this.kart=kart;}
    public String setTrack(String track) { return this.track= track;}
    public String toString() {
        return super.toString() + String.format("Character: %-25s Kart: %-10s Track: %10s",
                getCharacter(),
                getKart(),
                getTrack()
        );
    }
}

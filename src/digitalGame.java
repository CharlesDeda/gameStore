public class digitalGame extends Games {
    protected String digitalType;
    protected int party;

    public digitalGame(String title, double cost, double time, double rating, String physicalType, int party) {
        super(title, cost, time, rating);
        this.digitalType = digitalType;
        this.party = party;

    }
    private String getDigitalType() {return digitalType;}
    private int getParty() {return party;}

    public void setParty(int party) {this.party = party;}
    public void setDigitalType(String digitalType) {this.digitalType = digitalType;}
}

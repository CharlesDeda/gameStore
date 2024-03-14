public class digitalGame extends Games {
    protected String digitalType;
    protected int party;

    public digitalGame(String title, double cost, String time, double rating, String digitalType, int party) {
        super(title, cost, time, rating);
        this.digitalType = digitalType;
        this.party = party;

    }
    protected String getDigitalType() {return digitalType;}
    protected int getParty() {return party;}
    public void setDigitalType(String digitalType) {this.digitalType = digitalType;}
    public void setParty(int party) {this.party = party;}

    public String toString() {
        return super.toString() + String.format("%-15s %-10d",
                getDigitalType(),
                getParty()
        );

    }
}

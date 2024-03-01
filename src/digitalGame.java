public class digitalGame extends Games {
    protected String digitalType;

    public digitalGame(String title, double cost, int playerCount, double time, double rating, String physicalType) {
        super(title, cost, playerCount, time, rating);
        this.digitalType = digitalType;
    }
    private String getDigitalType() {return digitalType;}
    public String setDigitalType(String digitalType) {return this.digitalType = digitalType;}
}

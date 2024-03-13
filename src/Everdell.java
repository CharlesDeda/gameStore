public class Everdell extends physicalGame {
    private String worker;
    public Everdell(String title, double cost, double time, double rating, String physicalType, int playerCount, String worker) {
        super(title, cost, time, rating, physicalType, playerCount);
        this.worker = worker;
    }
    //Getters and Setters
    private String getWorker() {return worker;}
    public void setWorker(String worker) {this.worker = worker;}
    public String toString() {
        return super.toString() + String.format("%-10s",
                getWorker()
                );
    }

}

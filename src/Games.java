public class Games {
    protected String title;
    protected double cost;
    protected int playerCount;

    protected double time;
    protected double rating;

    public Games(String title, double cost, int playerCount, double time, double rating) {
        this.title = title;
        this.cost = cost;
        this.playerCount = playerCount;
        this.time = time;
        this.rating = rating;
    }

    protected String getTitle() {
        return title;
    }

    protected double getCost() {
        return cost;
    }
    protected int getPlayerCount() {
        return playerCount;
    }
    protected double getTime() {
        return time;
    }
    protected double getRating() {
        return rating;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public double setCost(double cost) {
        return this.cost = cost;
    }
    public int setPlayerCount(String title) {
        return this.playerCount = playerCount;
    }
    public double setTime(double time) {
        return this.time = time;
    }
    public double setRating(double rating) {
        return this.rating = rating;
    }
}

public class Games {
    private String title;
    private double cost;
    private int playerCount;

    private double time;
    private double rating;

    public Games(String title, double cost, int playerCount, double time, double rating) {
        this.title = title;
        this.cost = cost;
        this.playerCount = playerCount;
        this.time = time;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }
    public int getPlayerCount() {
        return playerCount;
    }
    public double getTime() {
        return time;
    }
    public double getRating() {
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

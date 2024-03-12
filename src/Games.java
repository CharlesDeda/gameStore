public class Games {
    protected String title;
    protected double cost;

    protected double time;
    protected double rating;

    public Games(String title, double cost, double time, double rating) {
        this.title = title;
        this.cost = cost;
        this.time = time;
        this.rating = rating;
    }

    protected String getTitle() {
        return title;
    }

    protected double getCost() {
        return cost;
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
    public double setTime(double time) {
        return this.time = time;
    }
    public double setRating(double rating) {
        return this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10.2f %-10.1f %-10.2f",
                getTitle(),
                getCost(),
                getTime(),
                getRating()
        );
    }
}

public class Games {
    protected String title;
    protected double cost;

    protected String time;
    protected double rating;

    public Games(String title, double cost, String time, double rating) {
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
    protected String getTime() {
        return time;
    }
    protected double getRating() {
        return rating;
    }

    public void setTitle(String title) {
         this.title = title;
    }

    public void setCost(double cost) {
         this.cost = cost;
    }
    public void setTime(String time) {
         this.time = time;
    }
    public void setRating(double rating) {
         this.rating = rating;
    }
    public double totalCost(double numCopies, double price) {
        return numCopies * price;
    }
    @Override
    public String toString() {
        return String.format("Title: %-25s Cost: $%-10.2f Time: %-10.1s Rating: %-10.2f",
                getTitle(),
                getCost(),
                getTime(),
                getRating()
        );
    }
}

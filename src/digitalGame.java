public class digitalGame extends Games {
    protected String genre;

    public digitalGame(String title, double cost, int playerCount, double time, double rating, String genre) {
        super(title, cost, playerCount, time, rating);
        this.genre = genre;
    }
    private String getGenre() {return genre;}
    public String setGenre(String genre) {return this.genre = genre;}
}

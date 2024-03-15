import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorldOfWarcraft w1 = new WorldOfWarcraft("World of Warcraft", 60, "2707h", 8.5, "MMO", 4, "Race", "Class");
        Everdell e1 = new Everdell("Everdell", 20.00, "60m", 8.5, "Boardgame", 4, "Construction");
        PoetryForNeanderthals p1 = new PoetryForNeanderthals("Poetry For Neanderthals", 30.00, "45m", 7.3, "Boardgame", 3, "NewCard");
        BetrayalAtHouseOnTheHill b1 = new BetrayalAtHouseOnTheHill("Betrayal at House on The Hill",
                40.00, "45m", 9, "Boardgame", 6, "Player 1");
        Fluxx f1 = new Fluxx("Fluxx", 20.00, "20m", 7, "Cardgame", 6, "Cthulu Fluxx");
        Loonacy l1 = new Loonacy("Loonacy", 20.00, "8m", 10, "Cardgame", 5, true);
        MarioKart m1 = new MarioKart("Mario Kart", 50, "10m", 9.0, "Racing Game", 4, "Nintendo Characters",
                "Karts", "Tracks");
        PlayMe pm1 = new PlayMe("PlayMe", 28, "15m", 7.4, "Mobile Game", 1, true);
        SushiGo s1 = new SushiGo("Sushi Go", 12, "20m", 7.6, "Board Game", 5, "Card Hand");
        Warhammer wh1 = new Warhammer("Warhammer", 200, "3h", 8.5, "Board Game", 2, "Minifigures");
        EscapeCursedTemple ect1 = new EscapeCursedTemple("EscapeCursedTemple", 100, "10m", 7.3, "Board Game", 8, "Soundtracks");
        Tetris t1 = new Tetris("Tetris", 30, "5m", 9.1, "VideoGame", 1, "Blocks");

        digitalGame[] digitalGames = new digitalGame[] {w1,t1, m1, pm1};
        physicalGame[] physicalGames = new physicalGame[] {f1,e1,p1,b1,l1,s1,wh1,ect1};


        System.out.println("What kind of game do you want to play? (Digital or Physical Game)");
        Scanner input = new Scanner(System.in);
        String gameType = input.nextLine();

        if(gameType.equals("Digital Game")) {
            System.out.println("Which game would you like to play?");
            System.out.printf("%s %-30s %-15s %-15s %-15s %-15s","0", "Title", "Cost", "Players", "Average Time", "Rating");
            System.out.println();

            for(int i = 0; i<4; i++) {
                System.out.printf("%s %-30s %-15.2f %-15d %-15s %-15.2f\n", (i+1), digitalGames[i].getTitle(), digitalGames[i].getCost(), digitalGames[i].getParty(), digitalGames[i].getTime(),
                digitalGames[i].getRating());
            }
            int gameChosen = input.nextInt();
            if(gameChosen == 1) {
                System.out.print(w1);
            } else if (gameChosen == 2) {
                System.out.print(t1);
            } else if(gameChosen == 3) {
                System.out.print(m1);
            } else if(gameChosen == 4) {
                System.out.print(pm1);
            }

            System.out.println();
            System.out.println("Please say yes if this is the game you want to play.");
            input.nextLine();
            String verification = input.nextLine();

            if(verification.equals("Yes")) {
                System.out.println("How many copies do you want to purchase?");
                int totalCopies = input.nextInt();
                double gameCost = digitalGames[gameChosen-1].getCost();
                double totalCost = digitalGames[gameChosen-1].totalCost(totalCopies, gameCost);
                System.out.println("Total Cost is  $" + totalCost);
            } else { System.out.println("Sorry, maybe we can find you something else?"); }
        }

        if(gameType.equals("Physical Game")) {
            System.out.println("Which game would you like to play?");
            System.out.printf("%s %-30s %-15s %-15s %-15s %-15s", "0", "Title", "Cost", "Players", "Average Time", "Rating");
            System.out.println();

            for(int i = 0; i<8; i++) {
                System.out.printf("%s %-30s %-15.2f %-15d %-15s %-15.2f\n", (i+1), physicalGames[i].getTitle(), physicalGames[i].getCost(), physicalGames[i].getplayerCount(), physicalGames[i].getTime(),
                        physicalGames[i].getRating());
            }

            int gameChosen = input.nextInt();
            if(gameChosen == 1) {
                System.out.print(f1);
            } else if (gameChosen == 2) {
                System.out.print(e1);
            } else if(gameChosen == 3) {
                System.out.print(p1);
            } else if(gameChosen == 4) {
                System.out.print(b1);
            } else if(gameChosen == 5) {
                System.out.print(l1);
            } else if(gameChosen == 6) {
                System.out.print(s1);
            } else if(gameChosen == 7) {
                System.out.print(wh1);
            } else if(gameChosen == 8) {
                System.out.print(ect1);
            }
            System.out.println();
            System.out.println("Please say yes if this is the game you want to play.");
            input.nextLine();
            String verification = input.nextLine();

            if(verification.equals("Yes")) {
                System.out.println("How many copies do you want to purchase?");
                int totalCopies = input.nextInt();
                double gameCost = physicalGames[gameChosen-1].getCost();
                double totalCost = physicalGames[gameChosen-1].totalCost(totalCopies, gameCost);
                System.out.println("Total Cost is  $" + totalCost);
            } else { System.out.println("Sorry, maybe we can find you something else?"); }
        }
        }
    }


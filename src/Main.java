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

        System.out.println("Digital Games");
        for(int i = 0; i<4; i++) {
            System.out.println(digitalGames[i]);
        }
        System.out.println("Physical Games");
        for(int i = 0; i<8; i++) {
            System.out.println(physicalGames[i]);
        }

//        System.out.println("What kind of game do you want to play?");
//        Scanner input = new Scanner();
//        String gameType = input.nextLine();
//        if(gameType == "Digital Game") {
//            System.out.println();
//        }
//        System.out.println("Which game do you want to play?");
//        String selectedGame = input.nextLine();
//
//        System.out.println("How many copies would you like to purchase?");
//        int copies = input.nextInt();



    }
}

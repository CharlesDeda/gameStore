import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        digitalGame[] digitalGames = new digitalGame[] {new WorldOfWarcraft()};
\
        physicalGame[] physicalGames = new physicalGame[] {new Everdell(), new PoetryForNeanderthals()}

        System.out.println("What kind of game do you want to play?");
        Scanner input = new Scanner();
        String answer = input.nextLine();
        if(answer == "Digital Game") {
            System.out.println()
        }


//        WorldOfWarcraft w1 = new WorldOfWarcraft("World of Warcraft", 50, 2707,
//                10, "MMO", 4, "Panda");
//        System.out.println(w1);
//        Everdell e1 = new Everdell("Everdell", 20, 2707, 8.5, "Boardgame", 4, "Construction");
//        System.out.println(e1);
//        PoetryForNeanderthals p1 = new PoetryForNeanderthals("Poetry For Neanderthals", 30, 45, 7.3, "Boardgame", 3, "NewCard");
//        System.out.println(p1);
    }
}

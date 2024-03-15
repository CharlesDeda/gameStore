/**
 * Ask user what type of game they want ot play, display all the option, ask the user to select a game,
 * display all the information on that game, ask the user to verify this is the game they want, ask how
 * many copies they would like and display the total cost
 */

import java.util.Scanner;
public class GamesDedaPalmeriBasdenGalindo {
    public static void main(String[] args) {
        // iniitalizing variable
        double completeCost = 0.0;
        WorldOfWarcraft w1 = new WorldOfWarcraft("World of Warcraft", 60, "2707h", 8.5, "MMO", 4, "Orcs", "Hunter");
        Everdell e1 = new Everdell("Everdell", 20.00, "60m", 8.5, "Boardgame", 4, "Construction");
        PoetryForNeanderthals p1 = new PoetryForNeanderthals("Poetry For Neanderthals", 30.00, "45m", 7.3, "Boardgame", 3, "NewCard");
        BetrayalAtHouseOnTheHill b1 = new BetrayalAtHouseOnTheHill("Betrayal at House on The Hill",
                40.00, "45m", 9, "Boardgame", 6, "Player 1");
        Fluxx f1 = new Fluxx("Fluxx", 20.00, "20m", 7, "Cardgame", 6, "Cthulu Fluxx");
        Loonacy l1 = new Loonacy("Loonacy", 20.00, "8m", 10, "Cardgame", 5, true);
        MarioKart m1 = new MarioKart("Mario Kart", 50, "10m", 9.0, "Racing Game", 4, "Time Bones",
                "Yoshi Bike", "Rainbow Road");
        PlayMe pm1 = new PlayMe("PlayMe", 28, "15m", 7.4, "Mobile Game", 1, true);
        SushiGo s1 = new SushiGo("Sushi Go", 12, "20m", 7.6, "Board Game", 5, "Card Hand");
        Warhammer wh1 = new Warhammer("Warhammer", 200, "3h", 8.5, "Board Game", 2, "Ciaphas Cain");
        EscapeCursedTemple ect1 = new EscapeCursedTemple("EscapeCursedTemple", 100, "10m", 7.3, "Board Game", 8, "ECT OST");
        Tetris t1 = new Tetris("Tetris", 30, "5m", 9.1, "VideoGame", 1, "L Block");

        //Initializing lists and strings
        digitalGame[] digitalGames = new digitalGame[]{w1, t1, m1, pm1};
        physicalGame[] physicalGames = new physicalGame[]{f1, e1, p1, b1, l1, s1, wh1, ect1};

        String again;

        //Run through the entire thing once and ask if they would like to choose a game,
        // if they would like to play again keep playing till they've fulfilled their hearts desires
        do {
            completeCost = PlayAgain(completeCost, digitalGames, physicalGames);
            System.out.println("\nWould you like to choose another game?");
            Scanner input = new Scanner(System.in);
            again = input.nextLine();
            while (!again.startsWith("y") && !again.startsWith("n")){
                System.out.println("Please enter a valid option (Y or N)");
                again = input.nextLine().toLowerCase();
            }
        }
        while (again.equals("y"));

        //Keeps track of overall total cost and prints it at the end
        System.out.printf("Your complete cost is $%.2f", completeCost);
    }

    /**
     * asks the user for input and verifies game
     * @return game type desired
     */
    public static String askUser() {
        System.out.println("What kind of game do you want to play? (Digital or Physical Game)");
        Scanner input = new Scanner(System.in);
        String gameType = input.nextLine().toLowerCase();
        while (!gameType.startsWith("digital") && !gameType.startsWith("physical")) {
            System.out.println("Please enter a valid option (Physical or Digital)");
            gameType = input.nextLine().toLowerCase();
        }
        return gameType;
    }

    /**
     * digitalSelection selects the digital game the user would like to play
     * @param digitalGames array of digital games to choose from
     * @return digital game of choice
     */
    public static digitalGame digitalSelection(digitalGame[] digitalGames){
        Scanner input = new Scanner(System.in);

        System.out.println("Which game would you like to play?");
        System.out.printf("%s %-30s %-15s %-15s %-15s %-15s","0", "Title", "Cost", "Players", "Average Time", "Rating");
        System.out.println();
        for(int i = 0; i<4; i++) {
            System.out.printf("%s %-30s %-15.2f %-15d %-15s %-15.2f\n", (i+1), digitalGames[i].getTitle(), digitalGames[i].getCost(), digitalGames[i].getParty(), digitalGames[i].getTime(),
                    digitalGames[i].getRating());
        }

        int gameChosen = input.nextInt();
        while (gameChosen > 4 || gameChosen < 1){
            System.out.println("Please enter a valid number (1-4)");
            gameChosen = input.nextInt();
        }
        if(gameChosen == 1) {
            System.out.print(digitalGames[0]);
        } else if (gameChosen == 2) {
            System.out.print(digitalGames[1]);
        } else if(gameChosen == 3) {
            System.out.print(digitalGames[2]);
        } else if(gameChosen == 4) {
            System.out.print(digitalGames[3]);
        }

        return digitalGames[gameChosen-1];
    }

    /**
     * physicalGames selects the physical game the user would like to play
     * @param physicalGames array of physical games to choose from
     * @return physical game of choice
     */
    public static physicalGame physicalSelection(physicalGame[] physicalGames) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which game would you like to play?");
        System.out.printf("%s %-30s %-15s %-15s %-15s %-15s", "0", "Title", "Cost", "Players", "Average Time", "Rating");
        System.out.println();

        for(int i = 0; i<8; i++) {
            System.out.printf("%s %-30s %-15.2f %-15d %-15s %-15.2f\n", (i+1), physicalGames[i].getTitle(), physicalGames[i].getCost(), physicalGames[i].getplayerCount(), physicalGames[i].getTime(),
                    physicalGames[i].getRating());
        }

        int gameChosen = input.nextInt();
        while (gameChosen > 8 || gameChosen < 1){
            System.out.println("Please enter a valid number (1-8)");
            gameChosen = input.nextInt();
        }
        if(gameChosen == 1) {
            System.out.print(physicalGames[0]);
        } else if (gameChosen == 2) {
            System.out.print(physicalGames[1]);
        } else if(gameChosen == 3) {
            System.out.print(physicalGames[2]);
        } else if(gameChosen == 4) {
            System.out.print(physicalGames[3]);
        } else if(gameChosen == 5) {
            System.out.print(physicalGames[4]);
        } else if(gameChosen == 6) {
            System.out.print(physicalGames[5]);
        } else if(gameChosen == 7) {
            System.out.print(physicalGames[6]);
        } else if(gameChosen == 8) {
            System.out.print(physicalGames[7]);
        }

        return physicalGames[gameChosen-1];
    }

    /**
     * verifies information
     * @return string starting with y or n
     */
    public static String Verify(){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Please say yes if this is the game you want to play.");
        String verification = input.nextLine().toLowerCase();
        while (!verification.startsWith("y") && !verification.startsWith("n")){
            System.out.println("Please enter a valid option (Y or N)");
            verification = input.nextLine().toLowerCase();
        }
        return verification;
    }

    /**
     * calculates total cost of game
     * @param game game of choice
     * @return cost of all the copies of the games
     */
    public static double Costs(Games game){
        Scanner input = new Scanner(System.in);
        System.out.println("How many copies do you want to purchase?");
        int totalCopies = input.nextInt();
        while (totalCopies <= 0){
            System.out.println("Please enter a number greater than 0");
            totalCopies = input.nextInt();
        }
        return game.totalCost(totalCopies, game.getCost());
    }

    /**
     * main rerunable code section to choose a game and it to the overall running cost
     * @param completeCost overall running cost so far
     * @param digitalGames array of digital games to choose from
     * @param physicalGames array of physical games to choose from
     * @return
     */
    public static double PlayAgain(double completeCost, digitalGame[] digitalGames, physicalGame[] physicalGames){
        String gameType = askUser();
        if (gameType.startsWith("digital")){
            digitalGame chosenGame = digitalSelection(digitalGames);
            String answer = Verify();
            if (answer.startsWith("y")){
                double totalCost = Costs(chosenGame);
                completeCost += totalCost;
                System.out.printf("%s%.2f", "Total Cost is  $", totalCost);
            }
        }
        else {
            physicalGame chosenGame = physicalSelection(physicalGames);
            String answer = Verify();
            if (answer.startsWith("y")){
                double totalCost = Costs(chosenGame);
                completeCost += totalCost;
                System.out.printf("%s%.2f", "Total Cost is  $", totalCost);
            }
        }

        return completeCost;
    }
}

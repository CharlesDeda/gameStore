import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RandomGame {
    public static void main(String[] args) {
        String[] games = {
                "Betrayal at House on the Hill", "Crokinole", "Cthulu Dice", "Doom",
                "Dungeons & Dragons", "Escape: Curse of the Temple",
                "Everdell", "Fluxx", "Hollow Knight", "Loonacy", "Love Letter", "Mario Kart",
                "Mysterium", "Night Cage", "Pathfinder", "Play Me", "Poetry for Neanderthals", "Roll for It", "Root",
                "Stardew Valley", "Sushi Go", "Tetris", "Ticket To Ride", "Warhammer", "World of Warcraft", "Zombie Dice"
        };
        boolean[] alreadyChosen = new boolean[games.length];
        int count = 0;
        while(count < 12) {
            Random r = new Random();
            int randomNumber= r.nextInt(0, games.length);
            if (alreadyChosen[randomNumber]) {
                randomNumber = r.nextInt(0,games.length);
            } else if(!alreadyChosen[randomNumber]) {
                alreadyChosen[randomNumber] = true;
                System.out.println(games[randomNumber]);
                count += 1;
            }
        }
    }
}
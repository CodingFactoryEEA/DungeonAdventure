import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(new InputStreamReader(System.in));

    //TODO: Put into the readme file that command line args give the nb of Rooms
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}

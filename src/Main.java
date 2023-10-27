import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(new InputStreamReader(System.in));

    //TODO: Put into the readme file that command line args give the nb of Rooms
    public static void main(String[] args) {
//        Game game = new Game();
//        game.startGame();

        System.out.println("Bienvenue dans Dungeon Adventure");
        String endGame = "";
        do {
            playGame();

            System.out.println("Fin de jeu : Appuyer 'y' pour continuer ou 'n' pour quitter");

            endGame = scanner.next();

            while (!endGame.equals("y") && !endGame.equals("n")) {

                System.out.println("veuillez entrer y pour oui ou n pour non");
                endGame = scanner.next();
            }
            if (endGame.equals("y")) continue;

            System.out.println("Merci pour votre visite");
            System.exit(0);
        } while (endGame.equals("n"));
    }

    private static void playGame() {
        Hero hero = new Hero();
        Dungeon dungeon = new Dungeon();
        System.out.println("Vous entrez dans le Donjon...!");
        dungeon.greetHeros(hero);
        if (!hero.isalive()) {
            System.out.println("Bravo vous avez gagner !!");
        }
    }
}

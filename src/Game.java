import java.util.Scanner;

public class Game {
    public Hero hero;
    Dungeon dungeon;
    public static boolean isGameOver;
    Game(){
        isGameOver = false;
        this.hero = new Hero(20);
        this.dungeon = new Dungeon();

    }

    //__________________________________________________________________________________________________________________
    //BEGIN Interaction Init Game

    public void startGame(){
        dungeon.greetHeros(hero);
        gameOver(isGameOver);
    }
    //END Interaction Init Game
    //__________________________________________________________________________________________________________________
    //TODO alt if hero still alive and monster dead

    //__________________________________________________________________________________________________________________
    //BEGIN Interaction End Game
    public void gameOver(boolean isGameOver){
        System.out.println("PERDU ! Voulez vous rejouer ? Y pour oui N pour non");

        Scanner scanner = new Scanner(System.in);
        if (scanner.next()=="Y"){
            //TODO MAJOR RESET VALUES & While implementation
            startGame();
        }else{
            System.out.println("Au moins vous êtes sorti du donjon en vie... Pas comme nous X'D T.T XPTDR");
            System.exit(0);
        }
    }
    //END Interaction End Game
    //__________________________________________________________________________________________________________________

    //__________________________________________________________________________________________________________________
    //BEGIN if heros is alive and monster dead
    //TODO ? To move inside enterRoom() function ?
    //END alt if heros is alive and monster dead
    //__________________________________________________________________________________________________________________

}

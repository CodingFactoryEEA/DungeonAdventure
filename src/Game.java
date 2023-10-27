import java.util.Scanner;

public class Game {
    public Hero hero;
    Dungeon dungeon;
    Game(){
        Hero hero = new Hero(20);
        Dungeon dungeon = new Dungeon();
    }

    //__________________________________________________________________________________________________________________
    //BEGIN Interaction Init Game

    public void startGame(){
        dungeon.greetHeros(hero);
    }
    //END Interaction Init Game
    //__________________________________________________________________________________________________________________
    //TODO alt if hero still alive and monster dead

    //__________________________________________________________________________________________________________________
    //BEGIN Interaction End Game
    public void endGame(){
        dungeon.greetHeros(hero);
    }
    //END Interaction End Game
    //__________________________________________________________________________________________________________________

    //__________________________________________________________________________________________________________________
    //BEGIN if heros is alive and monster dead
    //TODO ? To move inside enterRoom() function ?
    //END alt if heros is alive and monster dead
    //__________________________________________________________________________________________________________________
    //    ENDGAME
    public static void gameOver(){
        System.out.println("PERDU ! Voulez vous rejouer ? Y pour oui N pour non");

        Scanner scanner = new Scanner(System.in);
        if (scanner.next()=="Y"){
            //TODO MAJOR RESET VALUES & While implementation
            this.startGame();
        }else{
            System.out.println("Au moins vous êtes sorti du donjon en vie... Pas comme nous X'D T.T XPTDR");
            System.exit(0);
        }
    }
}

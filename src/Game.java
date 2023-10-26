public class Game {
    Game(){

    }

    //__________________________________________________________________________________________________________________
    //BEGIN Interaction Init Game
    Hero hero = new Hero(20);
    Dungeon dungeon = new Dungeon();
    public void startGame(){
        dungeon.greetHeros(hero);
    }
    //END Interaction Init Game
    //__________________________________________________________________________________________________________________
    //TODO alt if hero still alive and monster dead

    //__________________________________________________________________________________________________________________
    //BEGIN Interaction End Game
    public void startGame(){
        dungeon.greetHeros(hero);
    }
    //END Interaction End Game
    //__________________________________________________________________________________________________________________


}

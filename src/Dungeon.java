import java.util.ArrayList;

public class Dungeon {
    ArrayList<Room> rooms;
    public Dungeon() {
        rooms = new ArrayList<>();
        for (int i = 0; i < ConfigParams.NBROOM; i++ ){
            this.rooms.add(new Room(i));
        }
    }
    //This class will contain Rooms through which the
    //Hero will go through


    //Between 5 and 25 Rooms up to the difficulty targeted by the project team
    //TODO: Implements functions, parameter p_iIndex (and Loop ?)
    public Room getRoom(int p_iRoomIndex){
        return new Room(1);
    }

    //TODO: Implements functions, parameter p_iIndex (and Loop ?)
    public void greetHeros(Hero p_Hero){
        rooms.forEach( room -> {
            //TODO MAJOR : implements boolean monster dead
            boolean monsterDead = true;
            while (p_Hero.isalive() && monsterDead){

            }
        });
    }

    //TODO: Implements functions, parameter p_iIndex (and Loop ?)
    public ArrayList<Monster> getAllMonstersFromDungeon(){
        ArrayList<Monster> monstersArray = new ArrayList<>();
        return monstersArray;
    }
}

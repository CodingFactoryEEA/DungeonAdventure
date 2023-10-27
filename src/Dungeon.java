import java.util.ArrayList;

public class Dungeon {
    private ArrayList<Room> rooms = new ArrayList<>();
    public Dungeon() {
        for (int i = 0; i < ConfigParams.NBROOM; i++ ){
            this.rooms.add(new Room(i));
        }
    }
    //This class will contain Rooms through which the
    //Hero will go through


    /**
     *
     * @param p_iRoomIndex
     * @return
     */
    //Between 5 and 25 Rooms up to the difficulty targeted by the project team
    //TODO: Implements functions, parameter p_iIndex (and Loop ?)
    public Room getRoom(int p_iRoomIndex){
        return new Room(1);
    }

    //TODO: Implements functions, parameter p_iIndex (and Loop ?)
    public void greetHeros(Hero p_Hero){
//        rooms.forEach( room -> {
//            room.enterRoom(p_Hero);
//            if (!p_Hero.isalive())
//                Game.isGameOver = true;
//            //TODO MAJOR : Monstre mort passer à une autre chambre automatiquement fonctionne OU Search Item version complète ? OU ENDGAME trésor trouvé
//        });

      for (Room room : this.rooms) {
          if(room != null)
            room.enterRoom(p_Hero);
           if (!p_Hero.isalive()) break;
        }

    }

    //TODO: Implements functions, parameter p_iIndex (and Loop ?)
    public ArrayList<Monster> getAllMonstersFromDungeon(){
        ArrayList<Monster> monstersArray = new ArrayList<>();
        return monstersArray;
    }
}

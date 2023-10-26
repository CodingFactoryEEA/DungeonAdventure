import java.util.ArrayList;
import java.util.List;

public class Main {

    //TODO: Put into the readme file that command line args give the nb of Rooms
    public static void main(String[] args) {
	// write your code here
        int p_nbRoom = 5;
        //TODO: p_nbRoom = args[0]; ?
        //TODO: Pattern Generator ?
        List<Room> rooms = new ArrayList<Room>();
        for(int i = 0; i<5; i++){
            Room room = new Room(i);
            rooms.add(room);
        }
    }
}

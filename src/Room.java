import java.util.ArrayList;

public class Room {

    private Monster monsterRoom;
    private ArrayList<Item> m_Items;
    MonsterFactory monsterFactory;

    public Room(int p_iIndex) {
        m_Items = new ArrayList<>();
        monsterFactory = new MonsterFactory();
        //TODO Nombre de monstres par room
        if (p_iIndex % 4 == 0 && p_iIndex % 3 == 0) {
            //Create a Barbarian
            monsterRoom = monsterFactory.createMonster(MonsterType.BARBARIAN);
        } else if (p_iIndex % 4 == 0) {
            //Create a Thief
            monsterRoom = monsterFactory.createMonster(MonsterType.THIEF);
        } else if (p_iIndex % 3 == 0) {
            //Create a Troll
            monsterRoom = monsterFactory.createMonster(MonsterType.TROLL);
        } else if (isPrime(p_iIndex)) {
            //Create a Sorcerer
            monsterRoom = monsterFactory.createMonster(MonsterType.SORCERER);
        } else {
            //Create a Zombie
            monsterRoom = monsterFactory.createMonster(MonsterType.ZOMBIE);
        }

        if (p_iIndex % 7 == 0){
            m_Items.add(new HealthPotion());
        }
            //Make the room contains a HealthPotion
        if (p_iIndex % 4 == 0){
            m_Items.add(new StrengthPotion());
        }
        //Make the room contains a  StrengthPotion()
    }

    private boolean isPrime(int p_iIndex) {
        if (p_iIndex == 2)
            return true;
        if (p_iIndex % 2 == 0 || p_iIndex < 3)
            return false;
        for (int i = 3; i <= Math.pow(p_iIndex, 0.5) + 1; i += 2) {
            if (p_iIndex % i == 0) return false;
        }
        return true;
    }

    public Monster getMonster(){
        //TODO : Implements methods
        return monsterRoom;
    }

    /**
     * Notre Hero entre dans la salle
     * @param p_Hero
     */
    public void enterRoom(Hero p_Hero){
        //TODO : Implements methods => Voir interaction Room fighting management
        System.out.println("\nVous entrez dans une pièce");
        //TODO MAJOR Implementer un manger d'inputs/outputs

        while(monsterRoom.isalive() && p_Hero.isalive()){
            p_Hero.discoverEnnemy(monsterRoom);
            monsterRoom.attack(p_Hero);
            if (p_Hero.isalive()){
                p_Hero.attack(monsterRoom);
            }
        }
        if(p_Hero.isalive() && !monsterRoom.isalive()){
            //TODO MAJOR : Passer à une autre Room en version simple de l'application, sinon chercher la pièce en version BONUS
            System.out.println("Vous avez vaincu le monstre !");
        }

    }

//    public void enterRoom(Hero p_Hero){
//        //TODO : Implements methods
//
//        // a vérifier mais je pense que c'est ok ;)
//        p_Hero.discoverEnnemy(this.monsterRoom);
//
//        while (this.monsterRoom.isalive() && p_Hero.isalive()) {
//            this.monsterRoom.attack(p_Hero);
//            if (!p_Hero.isalive()) break;
//            p_Hero.attack(this.monsterRoom);
//        }
//    }
}

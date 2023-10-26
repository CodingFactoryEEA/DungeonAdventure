public class Room {

    private Monster monsterRoom;
    MonsterFactory monsterFactory;

    public Room(int p_iIndex) {
        monsterFactory = new MonsterFactory();
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

        }
            //Make the room contains a HealthPotion
        if (p_iIndex % 4 == 0){

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
}

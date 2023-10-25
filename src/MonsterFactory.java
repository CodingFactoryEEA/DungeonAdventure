import java.util.Random;

public class MonsterFactory {

    static Random random = new Random();

    public static Monster CreatMonster(MonsterType type){
        switch (type){
            case BARBARIAN -> {
                return new Barbarian();
            }
            case SORCERER -> {
                return new Sorcerer();
            }
            case ZOMBIE -> {
                return new Zombie();
            }
            case THIEF -> {
                return new Thief();
            }
            case TROLL -> {
                return new Troll();
            }
        }
        return new Monster();
    }
}

public class MonsterFactory extends Factory{

    /**
     * Cette méthode permet de créer des monsters en fonction du type demandé
     * @param type
     * @return MonsterType
     */
    @Override
    public Monster createMonster(MonsterType type) {
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
            default -> {
                return null;
            }
        }
    }

}


/**
 *
 */
public class Monster extends Character implements Searchable {
    protected static int s_iNbZombieInstances = 0;
    protected static int s_iNbThiefInstances = 0;
    protected static int s_iNbSorcerInstances = 0;
    protected static int s_iNbBarbarianInstances = 0;
    protected static int s_iNbTrollInstances = 0;


    /**
     * @return
     */
    @Override
    public Item search() {
        return null;
    }

    @Override
    public void attack(Character p_TargetCharacter) {

    }
    public boolean isWeaponEfficient(Weapon p_Weapon){
        //TODO Implements method
        return true;
    }
}
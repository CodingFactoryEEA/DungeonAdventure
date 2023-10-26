import java.io.FileWriter;

/**
 *
 */
public class Monster extends Character implements Searchable {
    protected static int s_iNbZombieInstances = 0;
    protected static int s_iNbThiefInstances = 0;
    protected static int s_iNbSorcerInstances = 0;
    protected static int s_iNbBarbarianInstances = 0;
    protected static int s_iNbTrollInstances = 0;
    public String m_sEffectiveWeaponType;
    private boolean m_bSearchDone;
    protected Item m_Item;


    /**
     * @return
     */
    @Override
    public Item search() {
        return null;
    }

    /**
     * Cette méthode permet de recupérer l'arme éfficace.
     * @return m_sEffectiveWeaponType
     */
    public String getEffectiveWeaponType() {
        return m_sEffectiveWeaponType;
    }

    @Override
    public void attack(Character p_TargetCharacter) {
            // TODO: 26/10/2023
    }

    /**
     * Cette méthode permet d'indiquer si l'arme est efficace contre le monstre.
     * @param p_Weapon
     * @return
     */
    public boolean isWeaponEfficient(Weapon p_Weapon){
        return CheckWeapon(p_Weapon);
    }

    /**
     * Cette méthode
     * @param p_Power
     * @return
     */
    public void hitByPower(ReduceLifePower p_Power){
        // TODO: 26/10/2023
    }


    private boolean CheckWeapon(Weapon p_Weapon) {
        if (this instanceof Barbarian && p_Weapon instanceof Sword){
            return true;
        }
        if (this instanceof Sorcerer && p_Weapon instanceof WaterFlask){
            return true;
        }
        if (this instanceof Thief && p_Weapon instanceof Arrow){
            return true;
        }
        if (this instanceof Troll && p_Weapon instanceof Spear){
            return true;
        }
        return this instanceof Zombie && p_Weapon instanceof FireArrow;
    }

}
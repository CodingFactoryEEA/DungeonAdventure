
/**
 *
 */
public class Monster extends Character implements Searchable {
    protected static int s_iNbZombieInstances = 0;
    protected static int s_iNbThiefInstances = 0;
    protected static int s_iNbSorcerInstances = 0;
    protected static int s_iNbBarbarianInstances = 0;
    protected static int s_iNbTrollInstances = 0;

    private String m_sEffectiveWeaponType;

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

    }

    /**
     * Cette méthode permet d'indiquer si l'arme est efficace contre le monstre.
     * @param p_Weapon
     * @return
     */
    public boolean isWeaponEfficient(Weapon p_Weapon){
        return this.m_Weapon.equals(p_Weapon);
    }
}
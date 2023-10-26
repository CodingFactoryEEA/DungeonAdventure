/**
 * 
 */
public class Sorcerer extends Monster {

    /**
     * Default constructor
     */
    public Sorcerer() {
        m_iLifePoints = ConfigParams.m_iLifePointsSorcerer;
        super.m_sEffectiveWeaponType = Lightning.class.getName();
        super.m_Weapon = new Lightning();
        if(Monster.s_iNbSorcerInstances%3 == 0  ){
            //create a health potion
            super.m_Item = new HealthPotion();
        }
    }

}
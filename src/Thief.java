/**
 * 
 */
public class Thief extends Monster {

    /**
     * Default constructor
     */
    public Thief() {
        m_iLifePoints = ConfigParams.m_iLifePointsThief;
        super.m_sEffectiveWeaponType = Dagger.class.getName();
        super.m_Weapon = new Dagger();
        if(Monster.s_iNbThiefInstances%6 == 1  ){
            //create a health potion
            super.m_Item = new HealthPotion();
        }
    }

}
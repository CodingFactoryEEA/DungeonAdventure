/**
 *
 */
public class Troll extends Monster {

    /**
     * Default constructor
     */
    public Troll() {
        m_iLifePoints = ConfigParams.m_iLifePointsTroll;
        super.m_sEffectiveWeaponType = Club.class.getName();
        super.m_Weapon = new Club();
        if (Monster.s_iNbTrollInstances % 4 == 3) {
            //create a Strength Potion
            super.m_Item = new StrengthPotion();
        }
    }

}
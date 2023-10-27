/**
 *
 */
public class Troll extends Monster {

    /**
     * Default constructor
     */
    public Troll() {
        super.m_sEffectiveWeaponType = Spear.class.getName();
        super.m_Weapon = new Club();
        if (Monster.s_iNbTrollInstances % 4 == 3) {
            //create a Strength Potion
            super.m_Item = new StrengthPotion();
        }
    }

}
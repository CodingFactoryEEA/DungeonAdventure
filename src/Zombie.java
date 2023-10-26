/**
 *
 */
public class Zombie extends Monster {

    /**
     * Default constructor
     */
    public Zombie() {
        m_iLifePoints = ConfigParams.LIFE_POINTS_ZOMBIE;
        super.m_sEffectiveWeaponType = Bite.class.getName();
        super.m_Weapon = new Bite();
        if (Monster.s_iNbZombieInstances % 5 == 1) {
            //create a Strength Potion
            super.m_Item = new StrengthPotion();
        }
    }

}
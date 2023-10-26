/**
 *
 */
public class Zombie extends Monster {

    /**
     * Default constructor
     */
    public Zombie() {
        super.m_sEffectiveWeaponType = Bite.class.getName();
        super.m_Weapon = new Bite();
        if (Monster.s_iNbZombieInstances % 5 == 1) {
            //create a Strength Potion
        }
    }

}
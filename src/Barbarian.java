/**
 *
 */
public class Barbarian extends Monster{


    /**
     * Default constructor
     */
    public Barbarian() {
        super.m_sEffectiveWeaponType = Axe.class.getName();
        super.m_Weapon = new Axe();
        if(Monster.s_iNbBarbarianInstances%2 == 0 ){
            //create a health potion
        }
        else{
            //create a StrengthPotion
        }

    }
}
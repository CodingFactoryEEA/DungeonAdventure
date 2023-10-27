/**
 *
 */
public class Barbarian extends Monster{


    /**
     * Default constructor
     */
    public Barbarian() {
        super.m_sEffectiveWeaponType = Sword.class.getName();
        super.m_Weapon = new Axe();
        s_iNbBarbarianInstances++;
        if(Monster.s_iNbBarbarianInstances%2 == 0 ){
            super.m_Item = new HealthPotion();
        }
        else{
            super.m_Item = new StrengthPotion();
        }

    }
}
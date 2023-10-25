/**
 * 
 */
public class Character {

    private int m_iLifePoints;

    /**
     * Default constructor
     */
    public Character() {
    }

    public void attack(Character p_TargetCharacter){

    }

    public int getM_iLifePoints() {
        return m_iLifePoints;
    }

    public void receiveDamages(int p_iDamages){
        m_iLifePoints -= p_iDamages;
    }

    public boolean isalive(){
        return m_iLifePoints > 0 ;
    }
}
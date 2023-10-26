/**
 * 
 */
public class Character {

    //Les point de vie du personnage
    protected int m_iLifePoints;
    //L'arme du personnage
    protected Weapon m_Weapon;


    /**
     * Default constructor
     */
    public Character() {
    }


    /**
     * Cette Méthode permet d'attaquer
     * @param p_TargetCharacter
     */
    public void attack(Character p_TargetCharacter){
        m_Weapon.inflictDamage(p_TargetCharacter);
    }

    /**
     * Cette méthode permet de retourné les point de vie du personnage.
     * @return m_iLifePoints
     */
    public int getNbLifePoints() {
        return m_iLifePoints;
    }

    /**
     * Cette Méthode permet de recevoir les dommage caussé par le Héro/Monstre par le paramètre
     * @param p_iDamages
     * est d'actualisé les points de vie du personnage.
     */
    public void receiveDamages(int p_iDamages){
        m_iLifePoints -= p_iDamages;
    }

    /**
     * Cette méthode permet de savoir si le personnage est en vie/Mort.
     * @return isalive
     */
    public boolean isalive(){
        return m_iLifePoints > 0 ;
    }
}
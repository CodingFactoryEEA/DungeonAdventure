/**
 * 
 */
public class Weapon {


    /**
     *
     */
    protected int m_iAttackPoints;
    /**
     * Default constructor
     * initialisation des point d'attaques.
     */
    public Weapon() {
        m_iAttackPoints = 10;
    }

    /**
     * Cette méthode permet d'infligé des dégât auu personnage en passant les point d'attaque à l méthode
     * recevoir dommage de la classe Character
     * @param p_TargetCharacter
     */
    public void inflictDamage(Character p_TargetCharacter) {
        p_TargetCharacter.receiveDamages(m_iAttackPoints);
    }

}
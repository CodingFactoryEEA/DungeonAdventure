/**
 * 
 */
public class HeroWeapons extends Weapon implements Searchable {

    /**
     * Bonus d'attaque
     * @ m_iAttackBonus
     */
    private int m_iAttackBonus;

    public HeroWeapons(int m_iAttackBonus) {
        this.m_iAttackBonus = m_iAttackBonus;
    }

    /**
     * Surcharge de la méthode infléger les dommages de la classe mère.
     * @param p_TargetCharacter
     */
    @Override
    public void inflictDamage(Character p_TargetCharacter) {
        super.inflictDamage(p_TargetCharacter);
        // TODO: 25/10/2023
    }

    /**
     * Cette méthode permet de mettre à jours le bonus d'attaque en ajoutant le bonus
     * @param p_iBonus
     */
    public void setAttackBonus(int p_iBonus){
        m_iAttackBonus += p_iBonus;
    }

}
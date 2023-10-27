/**
 * 
 */
public class HeroWeapons extends Weapon implements Searchable {
    //TODO: Implements method
    @Override
    public Item search() {
        return null;
    }
    /**
     * Bonus d'attaque
     * @ m_iAttackBonus
     */
    private int m_iAttackBonus;

    public HeroWeapons() {
        this.m_iAttackBonus = 0;
    }

    /**
     * Surcharge de la méthode infléger les dommages de la classe mère afin d'ajouter la force du héro aux coups <3 enfin !!!
     * @param p_TargetCharacter
     */
    @Override
    public void inflictDamage(Character p_TargetCharacter) {
        p_TargetCharacter.receiveDamages(m_iAttackPoints+ConfigParams.STRENGTH_HERO+m_iAttackBonus);
    }

    /**
     * Cette méthode permet de mettre à jours le bonus d'attaque en ajoutant le bonus
     * @param p_iBonus
     */
    public void setAttackBonus(int p_iBonus){
        //TODO FAIRE LA LOGIQUE METIER !!!

        m_iAttackBonus += p_iBonus;
    }
}
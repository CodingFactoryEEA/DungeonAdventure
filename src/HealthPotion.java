/**
 * 
 */
public class HealthPotion extends Item {

    /**
     * Default constructor
     */
    public HealthPotion() {
        m_iEffectValue = ConfigParams.EFFECT_VALUE_HEALTH_POTION;
    }


    /**
     * @param p_Hero
     * @return
     */
    @Override
    public int applyEffect(Hero p_Hero) {
        return 0;
    }
}
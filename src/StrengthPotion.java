/**
 * 
 */
public class StrengthPotion extends Item {

    public StrengthPotion() {
        m_iEffectValue = ConfigParams.EFFECT_VALUE_STRENGTH_POTION ;
    }

    @Override
    public int applyEffect(Hero p_Hero) {
        return 0;
    }
}
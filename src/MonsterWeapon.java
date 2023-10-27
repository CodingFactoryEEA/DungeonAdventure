/**
 * 
 */
public class MonsterWeapon extends Weapon {

    private int m_iCriticalCountDown;
    private static final int s_iMaxRoundBeforeCritical = 5;

    public MonsterWeapon() {
    }

    @Override
    public void inflictDamage(Character p_TargetCharacter) {

        super.inflictDamage(p_TargetCharacter);
        // TODO: 25/10/2023
    }

    public int getM_iCriticalCountDown() {
        return m_iCriticalCountDown;
    }

    public static int getS_iMaxRoundBeforeCritical() {
        return s_iMaxRoundBeforeCritical;
    }

    public void setM_iCriticalCountDown(int m_iCriticalCountDown) {
        this.m_iCriticalCountDown = m_iCriticalCountDown;
    }

}
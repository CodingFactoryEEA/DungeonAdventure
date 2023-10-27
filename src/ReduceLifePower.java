public class ReduceLifePower {
//TODO Damage change value
    public void dischargeOnTarget(Barbarian p_Barbarian) {
            p_Barbarian.receiveDamages(ConfigParams.REDUCE_LIFE_POWER_BARBARIAN);

    }

    public void dischargeOnTarget(Thief p_Thief) {
        p_Thief.receiveDamages(ConfigParams.REDUCE_LIFE_POWER_THIEF);

    }

    public void dischargeOnTarget(Sorcerer p_Sorcerer) {
        p_Sorcerer.receiveDamages(ConfigParams.REDUCE_LIFE_POWER_SORCERER);

    }

    public void dischargeOnTarget(Troll p_Troll) {
        p_Troll.receiveDamages(ConfigParams.REDUCE_LIFE_POWER_TROLL);

    }

    public void dischargeOnTarget(Zombie p_Zombie) {
        p_Zombie.receiveDamages(ConfigParams.REDUCE_LIFE_POWER_ZOMBIE);

    }
}

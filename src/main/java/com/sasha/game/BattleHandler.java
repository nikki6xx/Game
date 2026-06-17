package com.sasha.game;

import java.util.concurrent.ThreadLocalRandom;

public class BattleHandler {

    private static final int BASE_HIT_CHANCE = 50;
    private static final int PERCEPTION_MULTIPLIER = 4;
    private static final int LUCK_MULTIPLIER = 3;
    private static final int MIN_HIT_CHANCE = 5;
    private static final int MAX_HIT_CHANCE = 95;

    public static void math(BattleStep step) {
        int perception = step.getAttackerPerception();
        int luck = step.getDefenderLuck();
        boolean defending = step.isDefenderIsDefending();

        int effectiveLuck = defending ? luck * 2 : luck;
        int hitChance = BASE_HIT_CHANCE
                + (perception * PERCEPTION_MULTIPLIER)
                - (effectiveLuck * LUCK_MULTIPLIER);

        hitChance = Math.max(MIN_HIT_CHANCE, Math.min(MAX_HIT_CHANCE, hitChance));
        step.setHitChance(hitChance);

        int roll = ThreadLocalRandom.current().nextInt(1, 101);

        if (roll <= hitChance) {
            step.setHit(true);
            int rawDamage = step.getAttackerDamage();
            int blocked = step.getDefenderArmor();
            int finalDamage = Math.max(1, rawDamage - blocked);
            step.setFinalDamage(finalDamage);
        } else {
            step.setHit(false);
            step.setFinalDamage(0);
        }
    }
}

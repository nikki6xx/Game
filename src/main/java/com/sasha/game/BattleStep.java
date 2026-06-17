package com.sasha.game;

public class BattleStep {

    private int attackerPerception;
    private int defenderLuck;
    private int attackerDamage;
    private int defenderArmor;
    private boolean defenderIsDefending;
    private int hitChance;
    private boolean isHit;
    private int finalDamage;

    public BattleStep(int attackerPerception,
                      int defenderLuck,
                      int attackerDamage,
                      int defenderArmor,
                      boolean defenderIsDefending) {
        this.attackerPerception = attackerPerception;
        this.defenderLuck = defenderLuck;
        this.attackerDamage = attackerDamage;
        this.defenderArmor = defenderArmor;
        this.defenderIsDefending = defenderIsDefending;
    }

    public int getAttackerPerception() {
        return attackerPerception;
    }

    public int getDefenderLuck() {
        return defenderLuck;
    }

    public int getAttackerDamage() {
        return attackerDamage;
    }

    public int getDefenderArmor() {
        return defenderArmor;
    }

    public boolean isDefenderIsDefending() {
        return defenderIsDefending;
    }

    public int getHitChance() {
        return hitChance;
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public int getFinalDamage() {
        return finalDamage;
    }

    public void setFinalDamage(int finalDamage) {
        this.finalDamage = finalDamage;
    }

}

package com.sasha.domain.parameters;

public final class Attributes {

    private final int strength;

    private final int perception;

    private final int endurance;

    private final int charisma;

    private final int intelligent;

    private final int luck;

    public Attributes(int strength, int perception, int endurance, int charisma, int intelligent, int luck) {
        this.strength = strength;
        this.perception = perception;
        this.endurance = endurance;
        this.charisma = charisma;
        this.intelligent = intelligent;
        this.luck = luck;
    }

    public int getPerception() {
        return perception;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public int getLuck() {
        return luck;
    }

    public int getStrength() {
        return strength;
    }

}

package com.sasha.domain.parameters;

public final class ItemAttributes {

    private int strength;
    private int intelligent;
    private int sleight;



    public ItemAttributes(int strength, int intelligent, int sleight) {
        this.strength = strength;
        this.intelligent = intelligent;
        this.sleight = sleight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligent() {
        return intelligent;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    public int getSleight() {
        return sleight;
    }

    public void setSleight(int sleight) {
        this.sleight = sleight;
    }

}

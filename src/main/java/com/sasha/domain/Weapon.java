package com.sasha.domain;

import com.sasha.domain.parameters.ItemAttributes;

public class Weapon extends Item{

    private int damage;

    public Weapon(String name, int itemLife, ItemAttributes attribute, int damage) {
        super(name, itemLife, attribute);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

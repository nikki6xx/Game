package com.sasha.domain;

import java.util.List;

public class Inventory {

    private Weapon weapon;

    private Armor armor;

    private List<Item> bag;

    public Inventory(Weapon weapon, Armor armor, List<Item> bag) {
        this.weapon = weapon;
        this.armor = armor;
        this.bag = bag;
    }

    public Inventory(Weapon weapon) {
        this.weapon = weapon;
    }

    public Inventory(Armor armor) {
        this.armor = armor;
    }

    public Inventory(List<Item> bag) {
        this.bag = bag;
    }

    public Inventory() {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public List<Item> getBag() {
        return bag;
    }

    public void setBag(List<Item> bag) {
        this.bag = bag;
    }
}

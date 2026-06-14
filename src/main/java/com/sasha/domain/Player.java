package com.sasha.domain;

import com.sasha.domain.parameters.Attributes;
import com.sasha.domain.parameters.Experience;
import com.sasha.domain.parameters.ItemAttributes;

import java.util.ArrayList;
import java.util.List;

public class Player extends Character {

    private Inventory inventory;

    private Experience experience;


    public Player(String name, Attributes attributes, Inventory inventory) {
        super(name, attributes);

        this.inventory = new Inventory(setDefaultItems());

        this.experience = new Experience();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    private List<Item> setDefaultItems() {

        List<Item> bag = new ArrayList<>();

        Armor armor = new Armor(
                "Плащ",
                100,
                new ItemAttributes(2, 0, 0),
                1
        );
        Weapon weapon = new Weapon(
                "Палка",
                100,
                new ItemAttributes(1, 0, 0),
                2
        );

        bag.add(armor);
        bag.add(weapon);

        return bag;

    }

    // сделать стартовый инвентарь


}

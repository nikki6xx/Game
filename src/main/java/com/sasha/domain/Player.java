package com.sasha.domain;

import com.sasha.domain.parameters.Attributes;
import com.sasha.domain.parameters.Experience;
import com.sasha.domain.parameters.Health;

public class Player extends Character {

    private Inventory inventory;

    private Experience experience;


    public Player(String name, Attributes attributes, Inventory inventory) {
        super(name, attributes);
        this.inventory = inventory;
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

    // сделать стартовый инвентарь


}

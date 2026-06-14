package com.sasha.domain;

import com.sasha.domain.parameters.ItemAttributes;

public class Armor extends Item {

    private int strong;


    public Armor(String name, int itemLife, ItemAttributes attribute, int strong) {
        super(name, itemLife, attribute);
        this.strong = strong;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }
}

package com.sasha.domain;

import com.sasha.domain.parameters.ItemAttributes;

public class Item {
    private String name;

    private int itemLife;

    private ItemAttributes attribute;

    public Item(String name, int itemLife, ItemAttributes attribute) {
        this.name = name;
        this.itemLife = itemLife;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemLife() {
        return itemLife;
    }

    public void setItemLife(int itemLife) {
        this.itemLife = itemLife;
    }

    public ItemAttributes getAttribute() {
        return attribute;
    }

    public void setAttribute(ItemAttributes attribute) {
        this.attribute = attribute;
    }
}

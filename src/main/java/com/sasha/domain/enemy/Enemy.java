package com.sasha.domain.enemy;

import com.sasha.domain.parameters.Attributes;

public abstract class Enemy {

    private final Attributes attributes;

    protected Enemy(Attributes attributes) {
        this.attributes = attributes;
    }
}

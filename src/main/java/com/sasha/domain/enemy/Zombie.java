package com.sasha.domain.enemy;

import com.sasha.domain.parameters.Attributes;

public class Zombie extends Enemy {

    public Zombie(Attributes attributes) {
        super("Зомби", attributes, 1);
    }

    public Zombie(String name, Attributes attributes, int level) {
        super(name, attributes, level);
    }
}

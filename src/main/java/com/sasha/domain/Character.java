package com.sasha.domain;

import com.sasha.domain.parameters.Attributes;
import com.sasha.domain.parameters.Experience;
import com.sasha.domain.parameters.Health;

public class Character {

    private String name;

    private int defaultDamage;

    private Health health;

    private int level = 1;


    private Attributes attributes;

    public Character(String name,
                     Attributes attributes) {

        this.name = name;
        this.attributes = attributes;
        setStartHp();
        setStartDamage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefaultDamage() {
        return defaultDamage;
    }

    public void setDefaultDamage(int defaultDamage) {
        this.defaultDamage = defaultDamage;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public boolean isAlive() {
        return health != null && health.getCurrentHealth() > 0;
    }

    private void setStartHp() {

        int endurance = getAttributes().getEndurance() * 2;

        int health = getAttributes().getStrength() + 5;

        int lucky = getAttributes().getLuck() * 10;

        int increaseHealth = (endurance + health + lucky) + (getLevel() * 2);

        Health newHealth = new Health(increaseHealth, increaseHealth);

        setHealth(newHealth);

    }

    private void setStartDamage() {

        int intelg = getAttributes().getIntelligent() + 5;

        int strength = getAttributes().getStrength() * 2;

        int luck = getAttributes().getLuck() + 2;

        int increaseDamage = intelg + strength + luck + (getLevel() * 2);

        setDefaultDamage(increaseDamage);

    }
}

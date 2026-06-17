package com.sasha.domain.enemy;

import com.sasha.domain.parameters.Attributes;
import com.sasha.domain.parameters.Health;

public abstract class Enemy  {

    private final String name;
    private final Attributes attributes;
    private Health health;
    private int damage;
    private int level;

    protected Enemy(String name, Attributes attributes, int level) {
        this.name = name;
        this.attributes = attributes;
        this.level = level;
        calculateHp();
        calculateDamage();
    }

    public String getName() {
        return name;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return health != null && health.getCurrentHealth() > 0;
    }

    public void takeDamage(int amount) {
        if (health != null) {
            int newHp = Math.max(0, health.getCurrentHealth() - amount);
            health.setCurrentHealth(newHp);
        }
    }

    private void calculateHp() {
        int endurance = attributes.getEndurance() * 2;
        int strength = attributes.getStrength() + 5;
        int luck = attributes.getLuck() * 10;
        int totalHp = (endurance + strength + luck) + (level * 2);
        this.health = new Health(totalHp, totalHp);
    }

    private void calculateDamage() {
        int intelligent = attributes.getIntelligent() + 5;
        int strength = attributes.getStrength() * 2;
        int luck = attributes.getLuck() + 2;
        this.damage = intelligent + strength + luck + (level * 2);
    }
}

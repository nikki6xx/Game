package com.sasha.domain.dictionary;

public enum Environment {

    DARKNESS("Тьма", -2, 0, 0, 0, 0, 0),
    MIST("Туман", -3, 0, 0, 0, 0, 0),
    MAGICAL_GLOW("Магическое свечение", 0, 0, 0, 0, +2, 0),
    CURSED_GROUND("Проклятая земля", 0, 0, -2, 0, 0, -1);

    private final String displayName;
    private final int strengthMod;
    private final int perceptionMod;
    private final int enduranceMod;
    private final int charismaMod;
    private final int intelligentMod;
    private final int luckMod;

    Environment(String displayName,
                int strengthMod,
                int perceptionMod,
                int enduranceMod,
                int charismaMod,
                int intelligentMod,
                int luckMod) {
        this.displayName = displayName;
        this.strengthMod = strengthMod;
        this.perceptionMod = perceptionMod;
        this.enduranceMod = enduranceMod;
        this.charismaMod = charismaMod;
        this.intelligentMod = intelligentMod;
        this.luckMod = luckMod;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getStrengthMod() {
        return strengthMod;
    }

    public int getPerceptionMod() {
        return perceptionMod;
    }

    public int getEnduranceMod() {
        return enduranceMod;
    }

    public int getCharismaMod() {
        return charismaMod;
    }

    public int getIntelligentMod() {
        return intelligentMod;
    }

    public int getLuckMod() {
        return luckMod;
    }
}

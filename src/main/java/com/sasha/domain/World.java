package com.sasha.domain;

import java.util.Map;

public class World {

    public static final World INSTANCE = new World();

    private Player player;

    private Map<Coordinates, Room> map;

    private World() {
    }

    public void init() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map<Coordinates, Room> getMap() {
        return map;
    }

    public void setMap(Map<Coordinates, Room> map) {
        this.map = map;
    }
}

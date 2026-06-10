package com.sasha.domain;

import com.sasha.domain.dictionary.Environment;
import com.sasha.domain.enemy.Enemy;

public class Room {


    private int roomLevel;

    private Enemy enemy;

    private Chest chest;

    private Environment environments;

    private Room nextLeftRoom;

    private Room nextRightRoom;

    private Room prevRoom;

    public Room(
            int roomLevel,
            Enemy enemy,
            Chest chest,
            Environment environments
    ) {

        this.roomLevel = roomLevel;
        this.enemy = enemy;
        this.chest = chest;
        this.environments = environments;
    }


    public int getRoomLevel() {
        return roomLevel;
    }

    public void setRoomLevel(int roomLevel) {
        this.roomLevel = roomLevel;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public Environment getEnvironments() {
        return environments;
    }

    public void setEnvironments(Environment environments) {
        this.environments = environments;
    }

    public Room getNextLeftRoom() {
        return nextLeftRoom;
    }

    public void setNextLeftRoom(Room nextLeftRoom) {
        this.nextLeftRoom = nextLeftRoom;
    }

    public Room getNextRightRoom() {
        return nextRightRoom;
    }

    public void setNextRightRoom(Room nextRightRoom) {
        this.nextRightRoom = nextRightRoom;
    }

    public Room getPrevRoom() {
        return prevRoom;
    }

    public void setPrevRoom(Room prevRoom) {
        this.prevRoom = prevRoom;
    }
}


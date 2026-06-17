package com.sasha.game;

import com.sasha.domain.World;

public class GameLoop {

    private boolean isRun = true;

    public void startGame() {

        World.INSTANCE.init();



        while (isRun) {


        }


    }

}

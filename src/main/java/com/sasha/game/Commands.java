package com.sasha.game;

import com.sasha.domain.dictionary.MenuCommand;

public enum Commands {

    CREATE_PLAYER(new CreatePlayer()),
    START_BATTLE(new Battle());

    private final RunProcess runProcess;

    public RunProcess getRunProcess() {
        return runProcess;
    }

    Commands(RunProcess runProcess) {
        this.runProcess = runProcess;
    }
}

package com.sasha.game;

import com.sasha.domain.Attributes;

public enum Commands {

    STARTED(new CreatePlayer()),
    START_BATTLE(new Battle());

    private RunProcess runProcess;

    public RunProcess getRunProcess() {
        return runProcess;
    }

    Commands(RunProcess runProcess) {
        this.runProcess = runProcess;
    }
}

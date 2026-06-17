package com.sasha;

import com.sasha.domain.dictionary.MenuCommand;
import com.sasha.game.Commands;
import com.sasha.util.InputCommand;

public class Main {
    public static void main(String[] args) {


        InputCommand inputCommand = new InputCommand();

        int choice = inputCommand.getChoice(MenuCommand.PERSONAGE);




        MenuCommand.PERSONAGE.getCommands().get(choice - 1).getRunProcess().run();

        // 1. Составить и породить меню на ближайшие шаги


    }
}
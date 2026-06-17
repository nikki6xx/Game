package com.sasha.domain.dictionary;

import com.sasha.game.Commands;

import java.util.List;

public enum MenuCommand {

    START_MENU(
            """
            Добро пожаловать в игру, выберите пункт!
            1. Персонаж
            2. Выход
            """,
            2,
            List.of(

            )
    ),

    PERSONAGE(
            """
                  Вы в меню персонажа
                  1. Создать персонажа
                  2. Загрузить
                  3. Назад
                  """,
            3,
            List.of(

                    Commands.CREATE_PLAYER,
                    Commands.LOAD_PLAYER,
                    Commands.BACK

            )


    );


    private final String menu;

    private final int countPoint;

    private final List<Commands> commands;

    MenuCommand(String menu, int countPoint, List<Commands> commands) {
        this.menu = menu;
        this.countPoint = countPoint;
        this.commands = commands;
    }

    public String getMenu() {
        return menu;
    }

    public int getCountPoint() {
        return countPoint;
    }

    public List<Commands> getCommands() {
        return commands;
    }

    // подумать над своей логикой
}

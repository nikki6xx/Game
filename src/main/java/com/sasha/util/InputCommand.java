package com.sasha.util;

import com.sasha.domain.dictionary.MenuCommand;

import java.util.Scanner;

public class InputCommand {

    private final Scanner scanner = new Scanner(System.in);

    private final ConsoleSender consoleSender = new ConsoleSender();

    public int getChoice(MenuCommand menuCommand)  {

        consoleSender.send(menuCommand.getMenu());

        int choice = scanner.nextInt();


        if (choice <=0 || choice > menuCommand.getCountPoint()){
            consoleSender.send("Вы ввели невалидный пункт!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return getChoice(menuCommand);
        }



        return choice;
    }


    /*



        1. Персонаж
        2. Выход

            1.1 Создать нового
            1.2 Загрузить
            1.3 Назад


     */

}

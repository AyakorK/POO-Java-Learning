package com.CodingFactory.FightingGame;

import java.util.*;

public class Menu {

    public Menu() {

        System.out.println("Application has started ");

        Scanner start = new Scanner(System.in);
        System.out.println("Hello user, what do you want to do ?\n" + "1 - Leave\n" + "2 - Start a fight");
        String option = start.nextLine();

        if (Objects.equals(option, "1")) {
            System.exit(0);
        } else if (Objects.equals(option, "2")) {
            Scanner charMenu = new Scanner(System.in);
            System.out.println("Let's start a fight, would you create or select your characters ??\n" + "1 - Create new character\n" + "2 - Choose characters that exists\n" + "3 - Return to principal menu");
            String characterSelection = charMenu.nextLine();


            if (Objects.equals(characterSelection, "1")) {
                System.out.println("Let's create your new character !");
                Characters newCharacter = new Characters(0, 0, 0, "");
                newCharacter.setName(newCharacter.getName());
                newCharacter.setHealth(newCharacter.getHealth());
                newCharacter.setAttack(newCharacter.getAttack());
                newCharacter.setInitiative(newCharacter.getInitiative());


                Scanner createChar = new Scanner(System.in);
                System.out.println("Now select his archetype \n" + "1 - Classical\n" + "2 - Warrior\n" + "3 - Sorcerer\n" + "4 - Thief");
                String characterCreation = createChar.nextLine();



                if (Objects.equals(characterCreation, "1")) {



                } else if (Objects.equals(characterCreation, "2")) {
                } else if (Objects.equals(characterCreation, "3")) {
                } else if (Objects.equals(characterCreation, "4")) {}

            } else if (Objects.equals(characterSelection, "2")) {

            } else if (Objects.equals(characterSelection, "3")) {
                new Menu();

            }
        }
    }
}

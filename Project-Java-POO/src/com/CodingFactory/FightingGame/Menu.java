package com.CodingFactory.FightingGame;

import java.util.*;


public class Menu {

    CharacterController characterController = new CharacterController();

    public Menu() {
        startApplication();
    }

    public void startApplication() {
        System.out.println("Application has started ");

        Scanner start = new Scanner(System.in);
        System.out.println("Hello user, what do you want to do ?\n" + "1 - Create a new character\n" + "2 - Start a fight\n" + "3 - Leave" );
        String option = start.nextLine();

        if (Objects.equals(option, "1")) {

            System.out.println("Let's create your new character !");
            Characters newCharacter = new Characters(0, 0, 0, "", "");
            newCharacter.setName(newCharacter.getName());
            newCharacter.setHealth(newCharacter.getHealth());
            newCharacter.setAttack(newCharacter.getAttack());
            newCharacter.setInitiative(newCharacter.getInitiative());


            Scanner createChar = new Scanner(System.in);
            System.out.println("Now select his archetype \n" + "1 - Classical\n" + "2 - Warrior\n" + "3 - Sorcerer\n" + "4 - Thief");
            String characterCreation = createChar.nextLine();



            if (Objects.equals(characterCreation, "1")) {
                newCharacter.role = "none";
                characterController.saveCharacter(newCharacter);
                startApplication();
            } else if (Objects.equals(characterCreation, "2")) {
                Warrior newWarrior = new Warrior(newCharacter.health, newCharacter.attack, newCharacter.attack, newCharacter.name , 0, "");
                newWarrior.setShield(newWarrior.getShield());
                newWarrior.role = "warrior";
                characterController.saveCharacter(newWarrior);
                startApplication();
            } else if (Objects.equals(characterCreation, "3")) {
                Sorcerer newSorcerer = new Sorcerer(newCharacter.health, newCharacter.attack, newCharacter.attack, newCharacter.name ,"", 0);
                newSorcerer.setMagic(newSorcerer.getMagic());
                newSorcerer.role = "sorcerer";
                characterController.saveCharacter(newSorcerer);
                startApplication();

            } else if (Objects.equals(characterCreation, "4")) {
                Thief newThief = new Thief(newCharacter.health, newCharacter.attack, newCharacter.attack, newCharacter.name , "");
                newThief.role = "thief";
                characterController.saveCharacter(newThief);
                startApplication();
            }

        } else if (Objects.equals(option, "2")) {

            if (characterController.getCharacters().size() < 2) {
                System.out.println("Please create at least two characters\n" + "\n" );
                startApplication();
            } else {
                Scanner charMenu = new Scanner(System.in);
                System.out.println("Let's start a fight, would you create or select your characters ??\n" + "1 - Choose characters that exists\n" + "2 - Return to principal menu");
                String characterSelection = charMenu.nextLine();

                if (Objects.equals(characterSelection, "1")) {
                    ArrayList<Characters> infos = characterController.getCharacters();
                    for (int i = 0; i < infos.size(); i++) {
                        System.out.println("Personnage " + i + " - " + infos.get(i).toString());
                    }

                    Scanner char1Select = new Scanner(System.in);
                    System.out.println("Please select Character 1");
                    int char1Selected = char1Select.nextInt();

                    for (int i = 0; i < infos.size(); i++) {
                        if (char1Selected == i) {
                            Characters.getP1();
                            System.out.println("Ce personnage est p1");
                            infos.remove(i);
                        }
                    }


                    for (int i = 0; i < infos.size(); i++) {
                        System.out.println("Personnage " + i + " - " + infos.get(i).toString());
                    }

                        Scanner char2Select = new Scanner(System.in);
                        System.out.println("Please select Character 2");
                        int char2Selected = char2Select.nextInt();
                    for (int i = 0; i < infos.size(); i++) {


                        if (char2Selected == i) {
                            Characters.getP2();
                            System.out.println("Ce personnage est p2");
                            //startBattle();
                        }
                    }




                } else if (Objects.equals(characterSelection, "2")) {
                    startApplication();


                } else if (Objects.equals(option, "3")) {
                    System.exit(0);
                }
            }
        }
    }
}


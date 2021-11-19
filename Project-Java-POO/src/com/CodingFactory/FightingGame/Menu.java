package com.CodingFactory.FightingGame;

import java.util.*;


public class Menu {

    // Initialize a new array with a class.

    CharacterController characterController = new CharacterController();

    // Let our constructor be a function that permits us to launch our application

    public Menu() {
        Characters classicalChar = new Characters(300, 15, 4, "Gilbert", "none", 0, 0);
        Warrior classicalWarrior = new Warrior (500, 10, 3, "Gromash", "warrior", 8, 0);
        Sorcerer classicalSorcerer = new Sorcerer (200, 5, 5, "Nicolas", "sorcerer", 0, 60);
        Thief classicalThief = new Thief(300, 15, 8, "Sylvanas", "thief", 0,0 );
        characterController.saveCharacter(classicalChar);
        characterController.saveCharacter(classicalWarrior);
        characterController.saveCharacter(classicalSorcerer);
        characterController.saveCharacter(classicalThief);


    }

    // Initialize the function that will permit us to launch the app

    public void startApplication() {

        // Print us that it started well

        System.out.println("Application has started ");

        // Print a message in the console that shows us different options.

        System.out.println("""
                Hello user, what do you want to do ?
                1 - Create a new character
                2 - Start a fight
                3 - Delete a character
                4 - Leave""");

        // Initialize our first scanner to make the user do his first choice

        Scanner start = new Scanner(System.in);
        String option = start.nextLine();

        // First of all if user types "1" in his console so to create a new character

        if (Objects.equals(option, "1")) {

            // Print a message to create a new character

            System.out.println("Let's create your new character !");

            // Create it by placing defaults values

            Characters newCharacter = new Characters(0, 0, 0, "", "",0,0);

            // Ask to the infos the name and save them

            newCharacter.setName(newCharacter.getName());
            newCharacter.setHealth(newCharacter.getHealth());
            newCharacter.setAttack(newCharacter.getAttack());
            newCharacter.setInitiative(newCharacter.getInitiative());



            // After placing all the stats, ask for what achetype does the user want for his character

            System.out.println("""
                    Now select his archetype\s
                    1 - Classical
                    2 - Warrior
                    3 - Sorcerer
                    4 - Thief""");
            Scanner createChar = new Scanner(System.in);
            String characterCreation = createChar.nextLine();

            //---------------------------------//
            // If he asks for a Classical Character

            if (Objects.equals(characterCreation, "1")) {

                // Save a new role in Character's value

                newCharacter.role = "none";

                // Save our character's statistics in the array

                characterController.saveCharacter(newCharacter);

                // Go back to the principal menu

                startApplication();

                //---------------------------------//
                // If the user chose to create a Warrior

            } else if (Objects.equals(characterCreation, "2")) {

                // Create a new Warrior that has the properties that the user typed + a default shield and magical points

                Warrior newWarrior = new Warrior(newCharacter.health, newCharacter.attack, newCharacter.initiative, newCharacter.name , "", 0, 0);

                // Ask to the user for the shield and save it

                newWarrior.setShield(newWarrior.getShield());

                // Put a new role "warrior" to our Warrior

                newWarrior.role = "warrior";

                // Save in our array our character.

                characterController.saveCharacter(newWarrior);

                // Go back to the menu

                startApplication();

                //---------------------------------//
                // If the user wants to create a sorcerer

            } else if (Objects.equals(characterCreation, "3")) {

                // Create a new Sorcerer that has the same properties that the user typed initially + a default magic

                Sorcerer newSorcerer = new Sorcerer(newCharacter.health, newCharacter.attack, newCharacter.initiative, newCharacter.name ,"", 0, 0 );

                // Ask to the user to set MagicalPoints for our Sorcerer then save it

                newSorcerer.setMagic(newSorcerer.getMagic());

                // Add a new role to our Sorcerer

                newSorcerer.role = "sorcerer";

                // Save our Sorcerer in the array

                characterController.saveCharacter(newSorcerer);

                // Go back to the menu

                startApplication();

                //---------------------------------//
                // If the user choose to create a Thief

            } else if (Objects.equals(characterCreation, "4")) {

                // Initialize a new Thief that has the same properties that was user typed plus default magic points and shield points

                Thief newThief = new Thief(newCharacter.health, newCharacter.attack, newCharacter.initiative, newCharacter.name , "",0,0);

                // Add the new role thief to our Thief

                newThief.role = "thief";

                // Save our thief in the array

                characterController.saveCharacter(newThief);

                // Go back to the menu

                startApplication();
            }

  //---------------------------------//
            // If our user wants to start a fight

        } else if (Objects.equals(option, "2")) {

            // Check if our array has more than two elements

            if (characterController.getCharacters().size() < 2) {

                // If not , ask to the user to create at least two characters and return him to the menu

                System.out.println("""
                        Please create at least two characters

                        """);
                startApplication();
            } else {

                // In the case we have more than two elements in the array, Ask for an other choice
                System.out.println("""
                        Let's start a fight, would you create or select your characters ??
                        1 - Choose characters that exists
                        2 - Return to principal menu""");
                Scanner charMenu = new Scanner(System.in);
                String characterSelection = charMenu.nextLine();


                // If he wants to fight, choose characters that exists to fight themselves

                if (Objects.equals(characterSelection, "1")) {

                    // Initialize a new array infos that get our characters.

                    ArrayList infos = characterController.getCharacters();

                    // Make a loop that will print our Characters

                    for (int i = 0; i < infos.size(); i++) {
                        System.out.println("Character " + i + " - " + infos.get(i).toString());

                    }

                    // Ask to our User to select the first Character to fight

                    Scanner char1Select = new Scanner(System.in);
                    System.out.println("Please select Character 1\n");
                    int char1Selected = char1Select.nextInt();

                    // Search on the list on which he typed

                    for (int i = 0; i < infos.size(); i++) {

                        // Select the character thas has the same ID than what user typed

                        if (char1Selected == i) {

                            // Take the stats of our Player 1

                            characterController.setPlayer1(infos.get(i));

                            // Save it in an array


                            //System.out.println(characterController.getCharacters().get(i));
                            System.out.println(characterController.getCharacters().get(i) + " is p1\n");
                            infos.remove(i);
                        }
                    }


                    for (int i = 0; i < infos.size(); i++) {

                        // Print the new list without the character we deleted

                        System.out.println("Personnage " + i + " - " + infos.get(i).toString());

                    }

                    // Ask to our User to select the second Character to fight

                    Scanner char2Select = new Scanner(System.in);
                    System.out.println("Please select Character 2\n");
                    int char2Selected = char2Select.nextInt();

                    // Select the character thas has the same ID than what user typed

                    for (int i = 0; i < infos.size(); i++) {

                        // Search on the list on which number he typed

                        if (char2Selected == i) {

                            // Take the stats of our Player 1

                            characterController.setPlayer2(infos.get(i));


                            //System.out.println(characterController.getPlayer2());
                            System.out.println(characterController.getCharacters().get(i) +" is p2\n");

                            // When the two characters are taken, start a new Battle

                            Battle fight = new Battle();
                            fight.startBattle(characterController.getPlayer1(), characterController.getPlayer2());
                        }
                    }
                    //---------------------------------//
                    // If he choose to return to the menu

                } else if (Objects.equals(characterSelection, "2")) {

                    // Call our function to go back to the menu

                    startApplication();
                }
            }

//---------------------------------//
            // If you chose to delete a character

            } else if (Objects.equals(option, "3")) {

            // Create a new list that stock all of our characters

                ArrayList infos = characterController.getCharacters();

                // If our array is empty , ask to create at least one character before deleting "void" and return him to main menu

                if (infos.size() == 0) {
                    System.out.println("Please create characters before deleting it");
                    startApplication();
                }

                // If the array isn't empty, Print our array with all of our characters name+role

                for (int i = 0; i < infos.size(); i++) {
                    System.out.println("Personnage " + i + " - " + infos.get(i).toString());
                }

                // Ask to delete a character

                System.out.println("Delete a character");

                // Make a scanner that will chose which character you want to delete

                Scanner charDelete = new Scanner(System.in);
                int charDeleted = charDelete.nextInt();



            // Select the character thas has the same ID than what user typed

            for (int i = 0; i < infos.size(); i++) {

                // Search on the list on which number he typed

                if (charDeleted == i) {

                    // Ask to the user if he really wants to suppress it

                    System.out.println("""
                            Are you sure about deleting it ?
                            1 - Yes
                            2 - No
                            """);
                        Scanner charConf = new Scanner(System.in);
                        int charConfirmed = charConf.nextInt();

                        // If he really wants

                        if (charConfirmed == 1) {

                            // Print that he has been deleted + remove him from the array and go back to the menu

                            System.out.println(infos.get(i).toString() + " has been deleted\n");
                            infos.remove(i);


                            // If he does not want

                        }  // Go back to the menu

                    startApplication();
//---------------------------------//

                    // If he wants to leave the application

                } else if (Objects.equals(option, "4")) {

                    // Just exit the system

                    System.exit(0);
                }
            }
        }
    }
}


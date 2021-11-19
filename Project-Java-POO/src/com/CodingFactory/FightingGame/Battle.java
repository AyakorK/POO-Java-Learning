package com.CodingFactory.FightingGame;

import java.util.*;



public class Battle {


    public Battle() {

    }


    public void startBattle(Characters p1, Characters p2) {


        Scanner start = new Scanner(System.in);
        System.out.println("Are your sure to launch that ?\n" + "1 - Launch the fight\n" + "2 - Leave the game");
        String option = start.nextLine();

        if (option.equals("1")) {

            // Start the fight by printing every infos of our player.

            System.out.println("Le combat commence \n");
            System.out.println("Name = " + p1.name + " - Role = " + p1.role + " - Health = " + p1.health + " - Attack = " + p1.attack + " - Initiative =" + p1.initiative + " - Magic " + p1.magic + " - Shield " + p1.shield + "\n");
            System.out.println("Name = " + p2.name + " - Role = " + p2.role + " - Health = " + p2.health + " - Attack = " + p2.attack + " - Initiative =" + p2.initiative + " - Magic " + p2.magic + " - Shield " + p2.shield + "\n");


            // Do the first loop that will permit us to do our fight

            for (int i = 0; i < 2; i++) {

                // While one of the character is alive repeat the loop

                while (p1.health > 0 && p2.health > 0) {

                    // If i is even and that p1 is faster than p2

                    if (i % 2 == 0 && p1.initiative >= p2.initiative) {

        //---------------------------------//

                        // If the Character is a sorcerer,

                        if (Objects.equals(p1.role, "sorcerer")) {

                            // Let the health of his opponent be reduced by his attack + his magicalDamages

                            if (Objects.equals(p2.role, "warrior")) {

                                // Block the hit

                                p2.block((p1.attack + p1.magic));

                                // Then if the attack is more powerful than the shield
                                if ((p1.attack + p1.magic) > p2.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                    // If the shield has more points than the attack

                                }  // But if attack is less powerful than the shield print than he totally blocked it with function

                            } else if (Objects.equals(p2.role, "thief")) {

                                p2.dodge(p1);

                            } else {

                                // If the character is something else than a warrior or a thief

                                p2.health -= (p1.attack + p1.magic);


                                System.out.println(p1.name + " made an attack of " + (p1.attack + p1.magic) + " damages " + "\n");
                            }

                            // Print the health of both characters

                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                            // Reduce the magic damages by 2 for the next turn

                            p1.magic /= 2;


        //---------------------------------//

                            // If the character is a Thief

                        } else if (Objects.equals(p1.role, "thief")) {

                            // Let the thief be capable of make a critical attack to his opponent

                            p1.critical(p1);

                            if (Objects.equals(p2.role, "warrior")) {

                                // Block the hit

                                p2.block((p1.attack + p1.magic));

                                // Then if the attack is more powerful than the shield
                                if ((p1.attack + p1.magic) > p2.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                    // If the shield has more points than the attack

                                }  // But if attack is less powerful than the shield print than he totally blocked it with function

                            } else if (Objects.equals(p2.role, "thief")) {

                                p2.dodge(p1);

                            } else {

                                // If the character is something else than a warrior or a thief

                                p2.health -= (p1.attack + p1.magic);


                                System.out.println(p1.name + " made an attack of " + (p1.attack + p1.magic) + " damages " + "\n");
                            }

                            // Print the health of both characters

                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

        //---------------------------------//

                            // If the character has no role or is a warrior

                        } else if (Objects.equals(p1.role, "none") || Objects.equals(p1.role, "warrior")) {

                            if (Objects.equals(p2.role, "warrior")) {

                                // Block the hit

                                p2.block((p1.attack + p1.magic));

                                // Then if the attack is more powerful than the shield
                                if ((p1.attack + p1.magic) > p2.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                    // If the shield has more points than the attack

                                }  // But if attack is less powerful than the shield print than he totally blocked it with function

                            } else {

                                // If the character is something else than a warrior

                                p2.health -= (p1.attack + p1.magic);


                                System.out.println(p1.name + " made an attack of " + (p1.attack + p1.magic) + " damages " + "\n");
                            }

                            // Print the health of both characters

                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                        }  else if (p2.role == "thief") {
                            p2.dodge(p1);
                        } else {

                            // If the character is something else than a warrior

                            p1.health -= (p2.attack + p2.magic);


                            System.out.println(p2.name + " made an attack of " + (p2.attack + p2.magic) + " damages " + "\n");
                        }

                        // Print the health of both characters

                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                    } else if (i % 2 == 0) {

                                // If the Character is a sorcerer,

                                if (Objects.equals(p2.role, "sorcerer")) {

                                    // Let the health of his opponent be reduced by his attack + his magicalDamages

                                    if (Objects.equals(p1.role, "warrior")) {

                                        // Block the hit

                                        p1.block((p2.attack + p2.magic));

                                        // Then if the attack is more powerful than the shield
                                        if ((p2.attack + p2.magic) > p1.shield) {

                                            // Print than the Warrior blocked the hit but took some damages

                                            System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");

                                            // If the shield has more points than the attack

                                        }  // But if attack is less powerful than the shield print than he totally blocked it with function
                                    }else if (p1.role == "thief") {
                                        p1.dodge(p2);

                                    } else {

                                        // If the character is something else than a warrior

                                        p1.health -= (p2.attack + p2.magic);


                                        System.out.println(p2.name + " made an attack of " + (p2.attack +p2.magic) + " damages " + "\n");
                                    }

                                    // Print the health of both characters

                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                    // Reduce the magic damages by 2 for the next turn

                                    p2.magic /= 2;



                                } else if (Objects.equals(p2.role, "thief")) {

                                    p2.critical(p2);
                                    {

                                        if (Objects.equals(p1.role, "warrior")) {

                                            // Block the hit

                                            p1.block((p2.attack + p2.magic));

                                            // Then if the attack is more powerful than the shield
                                            if ((p2.attack + p2.magic) > p1.shield) {

                                                // Print than the Warrior blocked the hit but took some damages

                                                System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");

                                                // If the shield has more points than the attack

                                            }  // But if attack is less powerful than the shield print than he totally blocked it with function
                                        } else if (p1.role == "thief") {
                                            p1.dodge(p2);

                                        } else {

                                            // If the character is something else than a warrior

                                            p1.health -= (p2.attack + p2.magic);


                                            System.out.println(p2.name + " made an attack of " + (p2.attack + p2.magic) + " damages " + "\n");
                                        }

                                        // Print the health of both characters

                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                    }


                                    } else if (Objects.equals(p2.role, "none") || Objects.equals(p2.role, "warrior")) {

                                    if (Objects.equals(p1.role, "warrior")) {

                                        // Block the hit

                                        p1.block((p2.attack + p2.magic));

                                        // Then if the attack is more powerful than the shield
                                        if ((p2.attack + p2.magic) > p1.shield) {

                                            // Print than the Warrior blocked the hit but took some damages

                                            System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");

                                            // If the shield has more points than the attack

                                        }  // But if attack is less powerful than the shield print than he totally blocked it with function
                                    } else if (p1.role == "thief") {
                                        p1.dodge(p2);

                                    } else {

                                        // If the character is something else than a warrior

                                        p1.health -= (p2.attack + p2.magic);


                                        System.out.println(p2.name + " made an attack of " + (p2.attack +p2.magic) + " damages " + "\n");
                                    }

                                    // Print the health of both characters

                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                            }

                            } else if (i % 2 == 1 && p1.initiative >= p2.initiative) {

                                    // If the Character is a sorcerer,

                                    if (Objects.equals(p2.role, "sorcerer")) {

                                        // Let the health of his opponent be reduced by his attack + his magicalDamages

                                        if (Objects.equals(p1.role, "warrior")) {

                                            // Block the hit

                                            p1.block((p2.attack + p2.magic));

                                            // Then if the attack is more powerful than the shield
                                            if ((p2.attack + p2.magic) > p1.shield) {

                                                // Print than the Warrior blocked the hit but took some damages

                                                System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");

                                                // If the shield has more points than the attack

                                            }  // But if attack is less powerful than the shield print than he totally blocked it with function
                                        }else if (p1.role == "thief") {
                                            p1.dodge(p2);
                                        } else {

                                            // If the character is something else than a warrior

                                            p1.health -= (p2.attack + p2.magic);


                                            System.out.println(p2.name + " made an attack of " + (p2.attack +p2.magic) + " damages " + "\n");
                                        }

                                        // Print the health of both characters

                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                        // Reduce the magic damages by 2 for the next turn

                                        p2.magic /= 2;

                                } else if (Objects.equals(p2.role, "thief")) {

                                        p2.critical(p2);
                                        {

                                            if (Objects.equals(p1.role, "warrior")) {

                                                // Block the hit

                                                p1.block((p2.attack + p2.magic));

                                                // Then if the attack is more powerful than the shield
                                                if ((p2.attack + p2.magic) > p1.shield) {

                                                    // Print than the Warrior blocked the hit but took some damages

                                                    System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");

                                                    // If the shield has more points than the attack

                                                }  // But if attack is less powerful than the shield print than he totally blocked it with function
                                            } else if (p1.role == "thief") {
                                                p1.dodge(p2);

                                            } else {

                                                // If the character is something else than a warrior

                                                p1.health -= (p2.attack + p2.magic);


                                                System.out.println(p2.name + " made an attack of " + (p2.attack + p2.magic) + " damages " + "\n");
                                            }

                                            // Print the health of both characters

                                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                        }

                                        } else if (Objects.equals(p2.role, "none") || Objects.equals(p2.role, "warrior")) {

                                        if (Objects.equals(p1.role, "warrior")) {

                                            // Block the hit

                                            p1.block((p2.attack + p2.magic));

                                            // Then if the attack is more powerful than the shield
                                            if ((p2.attack + p2.magic) > p1.shield) {

                                                // Print than the Warrior blocked the hit but took some damages

                                                System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");

                                                // If the shield has more points than the attack

                                            }  // But if attack is less powerful than the shield print than he totally blocked it with function
                                        } else if (p1.role == "thief") {
                                            p1.dodge(p2);

                                        } else {

                                            // If the character is something else than a warrior

                                            p1.health -= (p2.attack + p2.magic);


                                            System.out.println(p2.name + " made an attack of " + (p2.attack +p2.magic) + " damages " + "\n");
                                        }

                                        // Print the health of both characters

                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                    }

                    } else if (i % 2 == 1) {

                                    // If the Character is a warrior,

                        if (Objects.equals(p1.role, "sorcerer")) {

                            // Let the health of his opponent be reduced by his attack + his magicalDamages

                            if (Objects.equals(p2.role, "warrior")) {

                                // Block the hit

                                p2.block((p1.attack + p1.magic));

                                // Then if the attack is more powerful than the shield
                                if ((p1.attack + p1.magic) > p2.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                    // If the shield has more points than the attack

                                }  // But if attack is less powerful than the shield print than he totally blocked it with function

                            } else if (Objects.equals(p2.role, "thief")) {

                                p2.dodge(p1);

                            } else {

                                // If the character is something else than a warrior or a thief

                                p2.health -= (p1.attack + p1.magic);


                                System.out.println(p1.name + " made an attack of " + (p1.attack + p1.magic) + " damages " + "\n");
                            }

                            // Print the health of both characters

                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                            // Reduce the magic damages by 2 for the next turn

                            p1.magic /= 2;


                        } else if (Objects.equals(p1.role, "thief")) {
                            p1.critical(p1);
                            if (Objects.equals(p2.role, "warrior")) {

                                // Block the hit

                                p2.block((p1.attack + p1.magic));

                                // Then if the attack is more powerful than the shield
                                if ((p1.attack + p1.magic) > p2.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                    // If the shield has more points than the attack

                                }  // But if attack is less powerful than the shield print than he totally blocked it with function

                            } else if (Objects.equals(p2.role, "thief")) {

                                p2.dodge(p1);

                            } else {

                                // If the character is something else than a warrior or a thief

                                p2.health -= (p1.attack + p1.magic);


                                System.out.println(p1.name + " made an attack of " + (p1.attack + p1.magic) + " damages " + "\n");
                            }

                            // Print the health of both characters

                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                        } else if (Objects.equals(p1.role, "none") || Objects.equals(p1.role, "warrior")) {

                            if (Objects.equals(p2.role, "warrior")) {

                                // Block the hit

                                p2.block((p1.attack + p1.magic));

                                // Then if the attack is more powerful than the shield
                                if ((p1.attack + p1.magic) > p2.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                    // If the shield has more points than the attack

                                }  // But if attack is less powerful than the shield print than he totally blocked it with function
                            }  else if (p2.role == "thief") {
                                p2.dodge(p1);
                            } else {

                                // If the character is something else than a warrior

                                p2.health -= (p1.attack + p1.magic);


                                System.out.println(p1.name + " made an attack of " + (p1.attack + p1.magic) + " damages " + "\n");
                            }



                        } else {

                            // If the character is something else than a warrior

                            p1.health -= (p2.attack + p2.magic);


                            System.out.println(p2.name + " made an attack of " + (p2.attack + p2.magic) + " damages " + "\n");
                        }

                        // Print the health of both characters

                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                }
                                i++;
                            }
                        }

            // At the end of the battle, if player 1 is alive

                        if (p1.health > 0) {

                            // Print that he won

                            System.out.println(p1.name + " is the winner !");

                            // If P2 is alive

                        } else if (p2.health > 0) {

                            // Print that he won

                            System.out.println(p2.name + " is the winner !");

                            // But if both players are dead

                        } else if (p1.health == 0 && p2.health == 0) {

                            // Print that it's a draw

                            System.out.println("Draw !");
                        }

                        // If the user wants to leave

                    } else if (option.equals("2")) {

                        // Shut the system off

                        System.exit(0);
                    }
                }
            }






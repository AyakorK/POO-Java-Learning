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
            System.out.println("Name = " + p1.name + " - Role = " + p1.role + " - Health = " + p1.health + " - Attack = " + p1.attack + " - Initiative =" + p1.initiative + "\n");
            System.out.println("Name = " + p2.name + " - Role = " + p2.role + " - Health = " + p2.health + " - Attack = " + p2.attack + " - Initiative =" + p2.initiative + "\n");


            // Do the first loop that will permit us to do our fight

            for (int i = 0; i < 300; i++) {

                // While one of the character is alive repeat the loop

                while (p1.health > 0 && p2.health > 0) {
                     i++;

                    // If i is even and that p1 is faster than p2

                    if (i % 2 == 0 && p1.initiative >= p2.initiative) {

                        // If the Character is a warrior,

                        if (Objects.equals(p2.role, "warrior")) {

                            // Block the hit

                            p2.block((p1.attack + p1.magic));

                            // Then if the attack is more powerful than the shield
                            if ((p1.attack + p1.magic) > p2.shield) {

                                // Print than the Warrior blocked the hit but took some damages

                                System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                // If the shield has more points than the attack
                                i++;
                            } else {

                                // Print than he totally blocked it

                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                i++;
                            }

                        } else if (Objects.equals(p2.role, "sorcerer")) {
                            p2.health -= (p1.attack + p1.magic);
                            p1.magic /= 2;

                            System.out.println(p1.name + " attaque de " + p1.attack + " dégâts " + "\n");
                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                            i++;
                        } else if (p2.role == "thief") {
                            p2.critical(p1.attack);

                            System.out.println(p1.name + " attaque de " + p1.attack + " dégâts " + "\n");
                            System.out.println(p1.name + " " + p1.health +" || " + p2.name + " " + p2.health + "\n");
                            i++;
                        } else if (Objects.equals(p2.role, "none")) {

                            // If he has no role just attack p2 and reduce his health by p1.attack

                            p2.health -= p1.attack;

                            // Print the result of the attack and both of the health point of players

                            System.out.println(p1.name + " made an attack of " + p1.attack + " damages " + "\n");
                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                            i++;
                        }
                        } else if (i % 2 == 0) {

                            // If the Character is a warrior,

                            if (Objects.equals(p1.role, "warrior")) {

                                // Block the hit

                                p1.block((p2.attack + p2.magic));

                                // Then if the attack is more powerful than the shield

                                if ((p2.attack + p2.magic) > p1.shield) {

                                    // Print than the Warrior blocked the hit but took some damages

                                    System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");
                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");


                                    // If the shield has more points than the attack

                                } else {

                                    // Print than he totally blocked it

                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                }
                                i++;

                                // If the Character is a sorcerer

                            } else if (Objects.equals(p1.role, "sorcerer")) {

                                //
                                p1.health -= (p2.attack + p2.magic);
                                p2.magic /= 2;

                                System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                i++;
                            } else if (Objects.equals(p1.role, "thief")) {

                                p1.critical(p2.attack);
                                p1.dodge(p1.attack);

                                System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                i++;
                            } else if (Objects.equals(p1.role, "none")) {

                                // If he has no role just attack p2 and reduce his health by p1.attack

                                p2.health -= p1.attack;

                                // Print the result of the attack and both of the health point of players

                                System.out.println(p1.name + " made an attack of " + p1.attack + " damages " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                i++;
                            }

                            } else if (i % 2 == 1 && p1.initiative >= p2.initiative) {

                                // If the Character is a warrior,

                                if (Objects.equals(p1.role, "warrior")) {

                                    // Block the hit

                                    p1.block((p2.attack + p2.magic));

                                    // Then if the attack is more powerful than the shield

                                    if ((p2.attack + p2.magic) > p1.shield) {

                                        // Print than the Warrior blocked the hit but took some damages

                                        System.out.println(p2.name + " made an attack of " + ((p2.attack + p2.magic) - p1.shield) + " damages " + "\n");
                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");


                                        // If the shield has more points than the attack

                                    } else {

                                        // Print than he totally blocked it

                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                    }
                                    i++;
                                } else if (Objects.equals(p1.role, "sorcerer")) {

                                    p1.health -= (p2.attack + p2.magic);
                                    p2.magic /= 2;

                                    System.out.println(p2.name + " attaque de " + (p2.attack + p2.magic) + " dégâts " + "\n");
                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                                    i++;
                                } else if (Objects.equals(p1.role, "thief")) {

                                    p1.critical(p2.attack);
                                    p1.dodge(p2.attack);
                                    //double critical = p1.critical;

                                    System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                    i++;
                                } else if (Objects.equals(p1.role, "none")) {

                                    // If he has no role just attack p2 and reduce his health by p1.attack

                                    p2.health -= p1.attack;

                                    // Print the result of the attack and both of the health point of players

                                    System.out.println(p1.name + " made an attack of " + p1.attack + " damages " + "\n");
                                    System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                    i++;
                                }
                                } else if (i % 2 == 1) {

                                    // If the Character is a warrior,

                                    if (p2.role == "warrior") {

                                        // Block the hit

                                        p2.block((p1.attack + p1.magic));

                                        // Then if the attack is more powerful than the shield

                                        if ((p1.attack + p1.magic) > p2.shield) {

                                            // Print than the Warrior blocked the hit but took some damages

                                            System.out.println(p1.name + " made an attack of " + ((p1.attack + p1.magic) - p2.shield) + " damages " + "\n");

                                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");


                                            // If the shield has more points than the attack

                                        } else {

                                            // Print than he totally blocked it

                                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                        }
                                        i++;
                                    } else if (Objects.equals(p2.role, "sorcerer")) {
                                        p2.health -= (p1.attack + p1.magic);
                                        p1.magic /= 2;

                                        System.out.println(p1.name + " made an attack of " + p1.attack + " damages " + "\n");
                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                        i++;
                                    } else if (Objects.equals(p2.role, "thief")) {
                                        p2.critical(p1.attack);
                                        p2.dodge(p1.attack);
                                        //double critical = p1.critical;

                                        System.out.println(p1.name + " made an attack of " + p1.attack + " damages " + "\n");
                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                        i++;
                                    } else if (p2.role == "none") {

                                        // If he has no role just attack p2 and reduce his health by p1.attack

                                        p2.health -= p1.attack;

                                        // Print the result of the attack and both of the health point of players

                                        System.out.println(p1.name + " made an attack of " + p1.attack + " damages " + "\n");
                                        System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                                        i++;
                                    }
                                }
                            }
                        }

                        if (p1.health > 0) {
                            System.out.println(p1.name + " is the winner !");
                        } else if (p2.health > 0) {
                            System.out.println(p2.name + " is the winner !");
                        } else if (p1.health == 0 && p2.health == 0) {
                            System.out.println("Draw !");
                        }
                    } else if (option.equals("2")) {
                        System.exit(0);
                    }
                }
            }






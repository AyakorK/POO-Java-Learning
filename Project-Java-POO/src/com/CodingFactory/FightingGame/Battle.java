package com.CodingFactory.FightingGame;
import java.util.*;



public class Battle{


    public Battle() {

    }

    public static void main(String[] args) {



        Sorcerer p1 = new Sorcerer (100, 10, 2, "Sorcerer1", "sorcerer",30, 20);
        Sorcerer p2 = new Sorcerer (150, 10, 4, "Sorcerer2", "sorcerer",30, 15);


        Scanner start = new Scanner(System.in);
        System.out.println("Hello user, what do you want to do ?\n" + "1 - Leave\n" + "2 - Start a fight");
        String option = start.nextLine();

        if(option.equals("2")){

            System.out.println("Le combat commence \n" );
            System.out.println("Name = " + p1.name + " - Role = " + p1.role + " - Health = " + p1.health + " - Attack = " + p1.attack + " - Initiative =" + p1.initiative + " - Magic " + p1.magic + "\n");
            System.out.println("Name = " + p2.name + " - Role = " + p2.role + " - Health = " + p2.health + " - Attack = " + p2.attack + " - Initiative =" + p2.initiative + "\n");


            for (int i = 0; i < 2; i++) {
                while (p1.health > 0 && p2.health > 0) {
                    if (i%2 == 0 && p1.initiative >= p2.initiative) {

                        if(p1.role == "sorcerer") {
                            p2.health -= (p1.attack + p1.magic);
                            p1.magic /= 2;

                            System.out.println(p1.name + " attaque de " + p1.attack + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || P2 health " + p2.health + "\n");



                        } else {
                            p2.health -= p1.attack;
                            System.out.println(p1.name + " attaque de " + p1.attack + " dégâts " + "\n");
                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                        }
                        i++;
                    } else if (i%2 == 0 && p2.initiative >= p1.initiative) {
                        if(p2.role == "sorcerer") {

                            p1.health -= (p2.attack+ p2.magic);
                            p2.magic /= 2;

                                System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");


                        } else {
                            p1.health -= p2.attack;
                            System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");

                        }
                        i++;
                    } else if (i%2 != 0 && p1.initiative >= p2.initiative) {
                        if(p2.role == "sorcerer") {
                            p1.health -= (p2.attack+ p2.magic);
                            p2.magic /= 2;

                                System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");


                        } else {
                            p1.health -= p2.attack;
                            System.out.println(p2.name + " attaque de " + p2.attack + " dégâts " + "\n");
                            System.out.println(p1.name + " " + p1.health + " || " + p2.name + " " + p2.health + "\n");
                        }
                        i++;
                    } else if (i%2 != 0 && p2.initiative >= p1.initiative) {
                        if(p1.role == "sorcerer") {
                            p2.health -= (p1.attack + p1.magic);
                            p1.magic /= 2;

                                System.out.println(p1.name + " attaque de " + p1.attack + " dégâts " + "\n");
                                System.out.println(p1.name + " " + p1.health + " || P2 health " + p2.health + "\n");

                            i++;

                        }

                    } else {
                        break;
                    }
                }





            }
        }
    }
}


package com.CodingFactory.FightingGame;
import java.util.*;

public class Characters {


    public Characters(double health, double attack, double initiative, String name) {
        this.health = health;
        this.attack = attack;
        this.initiative = initiative;
        this.name = name;


    }


    public double getHealth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many HP your character detains ?");
        double health = sc.nextDouble();


        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How strong is he ? (Attack points)");
        double attack = sc.nextDouble();


        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getInitiative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How fast is he ? (Initiative points)");
        double initiative = sc.nextDouble();

        return initiative;
    }

    public void setInitiative(double initiative) {
        this.initiative = initiative;
    }

    public String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est ton nom de personnage ?");
        String name = sc.nextLine();

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    double health;
    double attack;
    double initiative;
    String name;


}

class Warrior  extends Characters {
    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    int shield;

    public Warrior(double health, double attack, double initiative, String name, int shield) {
        super(health, attack, initiative, name);
        this.shield = shield;
    }

    public void block() {
        if (shield <= attack) {
            attack = 0;
        } else {
            health -= attack - shield;
        }

    }




}



package com.CodingFactory.FightingGame;
import java.util.*;

public class Player {
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est ton nom de personnage ? ");
        String name = sc.nextLine();

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuild() {
        return guild;
    }

    public void setGuild(String guild) {
        this.guild = guild;
    }

    double health;
    double attack;
    double speed;
    String name;
    String guild;

    public Player(double health, double attack, double speed, String name, String guild) {
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.name = name;
        this.guild = guild;

    }
}

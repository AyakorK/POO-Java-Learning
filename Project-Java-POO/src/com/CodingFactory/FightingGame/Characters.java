package com.CodingFactory.FightingGame;
import java.util.*;

public class Characters {

    private static String p1;
    private static String p2;

    public String toString() {
        return  "name=" + name +  " | " +
                "role=" + role ;
    }


    public Characters(double health, double attack, double initiative, String name, String role, int shield, double magic) {
        this.health = health;
        this.attack = attack;
        this.initiative = initiative;
        this.name = name;
        this.role = role;
        this.shield = shield;
        this.magic = magic;


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
        System.out.println("What is your character's name ?");
        this.name = sc.nextLine();

        return this.name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void attacked(double attack) {
        this.health =- attack;

    }

    public int getShield() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the value of your shield");
        int shield = sc.nextInt();

        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public double getMagic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How powerful is your sorcerer ? (Magic points)");
        double magic = sc.nextInt();

        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }


    double health;
    double attack;
    double initiative;
    int shield;
    double magic;
    String name;
    String role;


}

class Warrior  extends Characters {


    public Warrior(double health, double attack, double initiative, String name, String role, int shield, int magic) {
        super(health, attack, initiative, name, role, shield, magic);
    }

    public void block(double attack) {
        if (this.shield >= attack) {
            health -= (attack - attack);
            System.out.println(name + " a bloqué le coup !");
        } else {
            health -= attack - shield;
            System.out.println(name + " a bloqué " + shield + " de dégâts");
        }

    }

}

class Sorcerer extends Characters {

    public Sorcerer(double health, double attack, double initiative, String name, String role, int shield, double magic) {
        super(health, attack, initiative, name, role, shield, magic);

    }


    public double getDamageSorcerer() {
       damageSorcerer = attack + magic;
        return damageSorcerer;
    }

    public void setDamageSorcerer(double damageSorcerer) {
        this.damageSorcerer = damageSorcerer;
    }

    double magic;
    double damageSorcerer;
}

class Thief extends Characters {
    public double getDodge() {
        return dodge;
    }

    public void setDodge(double dodge) {
        this.dodge = dodge;

       /* if(new java.util.Random().nextInt(25)==1) {
            attack = attack0;
        }

        else {
            attack = attack1;
        }*/
    }

    public double getCriticalDamage() {
        return critical;
    }

    public void setCriticalDamage (double critical) {
        this.critical = critical;

       /* if(new java.util.Random().nextInt(25)==1) {
            attack = attack2;
        }

        else {
            attack = attack1;
        }*/
    }

    double dodge;
    double critical;

    public Thief (double health, double attack, double initiative, String name, String role, int shield, double magic ) {
        super(health, attack, initiative, name, role, shield , magic);
    }


}




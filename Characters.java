package com.CodingFactory.FightingGame;
import java.util.*;

public class Characters {


    // Creation of the constructor of our Characters by using default values and parameters

    public Characters(double health, double attack, double initiative, String name, String role, int shield, double magic) {

        // Apply every value to parameters of our constructor

        this.health = health;
        this.attack = attack;
        this.initiative = initiative;
        this.name = name;
        this.role = role;
        this.shield = shield;
        this.magic = magic;


    }

    // Create a getter for our health

    public double getHealth() {

        // Ask to the user how many HealthPoints he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("How many HP your character detains ?");

        // Return what typed the user into Character's "health"

        double health = sc.nextDouble();


        return health;
    }

    //Create a setter for our health

    public void setHealth(double health) {
        this.health = health;
    }

    //Create a getter for our attack

    public double getAttack() {

        // Ask to the user how many AttackPoints he wants for his character
        Scanner sc = new Scanner(System.in);
        System.out.println("How strong is he ? (Attack points)");

        // Return attack that the user typed but only if it's a double

        double attack = sc.nextDouble();


        return attack;
    }

    //Create a setter for our attack

    public void setAttack(double attack) {
        this.attack = attack;
    }

    //Create a getter for our Initiative

    public double getInitiative() {

        // Ask to the user how many InitiativePoints he wants for his character
        Scanner sc = new Scanner(System.in);
        System.out.println("How fast is he ? (Initiative points)");

        // Return initiative that user types to his Character's initiative
        double initiative = sc.nextDouble();

        return initiative;
    }

    // Create a setter for our initiative

    public void setInitiative(double initiative) {
        this.initiative = initiative;
    }

    // Create a getter for our name

    public String getName() {
        // Ask to the user what name does he want for his character
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your character's name ?");

        // Return name that user typed to his Character's name

        this.name = sc.nextLine();

        return this.name;
    }


    // Create a setter for our name

    public void setName(String name) {
        this.name = name;
    }

    // Create a getter for our shield for our warrior

    public int getShield() {

        // Ask to the user how many ShieldPoints he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the value of your shield");

        // Apply what user typed to Character's shield for our warrior

        int shield = sc.nextInt();

        return shield;
    }

    // Create a setter for our shield

    public void setShield(int shield) {
        this.shield = shield;
    }

    // Create a getter for our Magical Damages for our Wizards

    public double getMagic() {

        // Ask to the user how many MagicPoint he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("How powerful is your sorcerer ? (Magic points)");

        // Return what the user typed to our Character's Magical Damages
        double magic = sc.nextInt();

        return magic;
    }

    // Create a setter for our Magical Damages

    public void setMagic(double magic) {
        this.magic = magic;
    }

    // Initialize all of our variables to get and set them.

    double health;
    double attack;
    double initiative;
    int shield;
    double magic;
    String name;
    String role;

    public String toString() {

        // ToString is here to print into a String format Character's name + role when asked .

        return  "name=" + name +  " | " +
                "role=" + role ;

    }

    public double critical(double attack) {
        double Crits = (int) (Math.random() * 101);
        boolean Critical = false;
        if (Crits <= 10 && Critical == false) {
            System.out.println(Crits);
            health -= attack * 2;
            System.out.println("Thief inflicted critical damages");
            Critical = true;
        } else {
            System.out.println(Crits);
            health -= attack;
            Critical = false;
        }
        return attack;
    }

    public void block(double attack) {

        // If there are more ShieldPoints than opponent's AttackPoints

        if (this.shield >= attack) {

            // Heath does not reduce

            health -= (attack - attack);


            System.out.println(name + " blocked it !");

            // If there are more AttackPoints than ShieldPoints

        } else {

            // Reduce health points by opponent's attack minus our shield

            health -= attack - shield;
            System.out.println(name + " a bloqué " + shield + " de dégâts");
        }

    }

    public boolean dodge(double attack) {
        int Dodges = (int) (Math.random() * 101);
        boolean Dodge = false;
        if (Dodges <= 10 && !Dodge) {
            System.out.println(Dodges);
            health -= attack * 0;
            System.out.println("Le coup a été esquivé !");
            Dodge = true;
        } else {
            System.out.println(Dodges);
            health -= attack;
            Dodge = false;
        }
        return Dodge;
    }


}

// Create a warrior that has the same specifities that the Characters but adding some functionalities

class Warrior  extends Characters {

    // Create a constructor for our warrior that create a new Warrior with the same specifities that his parent (use of super) Characters

    public Warrior(double health, double attack, double initiative, String name, String role, int shield, int magic) {
        super(health, attack, initiative, name, role, shield, magic);
    }

    // Initialize a method that will permit us to block damages

}

// Create a sorcerer that has the same specifities that the Characters but adding some functionalities

class Sorcerer extends Characters {

    // Create a constructor for our sorcerer that creates a new Sorcerer that has the same specifities than the original Character

    public Sorcerer(double health, double attack, double initiative, String name, String role, int shield, double magic) {
        super(health, attack, initiative, name, role, shield, magic);
        this.magic = magic;
    }


    double magic;

}

// Create a thief that has the same specifities that the Characters but adding some functionalities especailly critical damages & dodge

class Thief extends Characters {

    public Thief(double health, double attack, double initiative, String name, String role, int shield, double magic) {
        super(health, attack, initiative, name, role, shield, magic);

    }
}
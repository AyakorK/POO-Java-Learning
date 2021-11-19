package com.CodingFactory.FightingGame;
import java.util.*;

public class Characters {


    // Creation of the Characters constructor by using default values and parameters

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

    // Create the health getter

    public double getHealth() {

        // Ask to the user how many HealthPoints he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("How many HP your character detains ?");

        // Return what typed the user into Character's "health"

        double health = sc.nextDouble();


        return health;
    }

    //Create the health setter

    public void setHealth(double health) {
        this.health = health;
    }

    //Create the attack getter

    public double getAttack() {

        // Ask to the user how many AttackPoints he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("How strong is he ? (Attack points)");

        // Return attack that the user typed but only if it's a double

        double attack = sc.nextDouble();


        return attack;
    }

    //Create the attack setter

    public void setAttack(double attack) {
        this.attack = attack;
    }

    //Create the initiative getter

    public double getInitiative() {

        // Ask to the user how many InitiativePoints he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("How fast is he ? (Initiative points)");

        // Return initiative that user types to his Character's initiative

        double initiative = sc.nextDouble();

        return initiative;
    }

    // Create the initiative setter

    public void setInitiative(double initiative) {
        this.initiative = initiative;
    }

    // Create the name getter

    public String getName() {

        // Ask to the user what name does he want for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your character's name ?");

        // Return name that user typed to his Character's name

        this.name = sc.nextLine();

        return this.name;
    }


    // Create the name setter

    public void setName(String name) {
        this.name = name;
    }

    // Create the warrior shields getter

    public int getShield() {

        // Ask to the user how many ShieldPoints he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the value of your shield");

        // Apply what user typed to Character's shield for our warrior

        int shield = sc.nextInt();

        return shield;
    }

    // Create the warrior shields setter

    public void setShield(int shield) {
        this.shield = shield;
    }

    // Create the wizard magical damages getter

    public double getMagic() {

        // Ask to the user how many MagicPoint he wants for his character

        Scanner sc = new Scanner(System.in);
        System.out.println("How powerful is your sorcerer ? (Magic points)");

        // Return what the user typed to our Character's Magical Damages

        double magic = sc.nextInt();

        return magic;
    }

    // Create the wizard magical damages setter

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

    // method for the thief crit with a condition

    public double critical(Characters player) {
        double Crits = (int) (Math.random() * 101);
        Critical();

        // if the probabilty to crit is right then print it else theres no crit and the inflicted base damage is printed

        if (Crits <= 20 && !Critical) {
            System.out.println(Crits);
            player.attack = attack * 2;
            System.out.println("Thief inflicted critical damages");
        } else {
            System.out.println(Crits);
            attack = criticalDamages(player);

        }
        return player.attack;

    }

    // if the thief hit a crit the round before then he cant crit again at the current round

    public double criticalDamages(Characters player) {
        if (Critical && (player.attack == (attack*2))) {
            player.attack /= 2;
        }
        return player.attack;
    }

    // condition verification with a boolean // true or false depends when you crit or not
    public boolean Critical() {
        double CritPercentile = (int) (Math.random() * 101);
        if ( CritPercentile <= 50 && !Critical) {

            Critical = true;
        } else {

            Critical = false;
        }
        return Critical;

    }

    boolean Critical;

    // method for the thief dodge with a condition

    public boolean dodge(Characters player) {
        int Dodges = (int) (Math.random() * 101);
        Dodge();

        // if the probabilty to dodge is right then print it else theres no dodge and we print it too

        if (Dodges <= 30 && !Dodge) {
            System.out.println(Dodges);
            health -= player.attack * 0;
            System.out.println("Le coup a été esquivé !");
        } else {
            System.out.println(Dodges);
            health -= player.attack;
            System.out.println(name + " took " + player.attack + " damages from " + player.name);
        }
        return Dodge;
    }

    // condition verification with a boolean true or false

    public boolean Dodge() {
        double DodgePercentile = (int) (Math.random() * 101);
        if ( DodgePercentile <= 20 && !Dodge) {

            Dodge = true;
        } else {

            Dodge = false;
        }
        return Dodge;

    }
    boolean Dodge;

    // method for the warrior block with a condition  // Initialize a method that will permit us to block damages

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


}

// Create a warrior that has the same specifities that the Characters but adding some functionalities over it

class Warrior  extends Characters {

    // Create a constructor for our warrior that create a new Warrior with the same specifities that his parent (use of super) Characters

    public Warrior(double health, double attack, double initiative, String name, String role, int shield, int magic) {
        super(health, attack, initiative, name, role, shield, magic);
    }

}

// Create a sorcerer that has the same specifities that the Characters but adding some functionalities over it

class Sorcerer extends Characters {

    // Create a constructor for our sorcerer that creates a new Sorcerer that has the same specifities than the original Character

    public Sorcerer(double health, double attack, double initiative, String name, String role, int shield, double magic) {
        super(health, attack, initiative, name, role, shield, magic);
        this.magic = magic;
    }


    double magic;

}

// Create a thief that has the same specifities that the Characters but adding some functionalities over it

class Thief extends Characters {

//  // Create a constructor for our sorcerer that creates a new Sorcerer that has the same specifities than the original Character

    public Thief(double health, double attack, double initiative, String name, String role, int shield, double magic) {
        super(health, attack, initiative, name, role, shield, magic);

    }
}
package com.CodingFactory.FightingGame;
import java.util.*;

public class SaveCharacter {

    List myCharacterStats = new ArrayList();
    List charactersPrint  = new ArrayList();
    List Characters = new ArrayList();
    ListIterator CharListIterator = Characters.listIterator();


    public SaveCharacter(double health, double attack, double initiative, String name, String role, double magic, int shield) {

            myCharacterStats.add(name);
            myCharacterStats.add(health);
            myCharacterStats.add(attack);
            myCharacterStats.add(initiative);
            myCharacterStats.add(role);
            myCharacterStats.add(magic);
            myCharacterStats.add(shield);
            Characters.add(myCharacterStats);
            System.out.println(myCharacterStats.get(0) + " - " + myCharacterStats.get(4));
            System.out.println(Characters);




        }
    }





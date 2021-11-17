package com.CodingFactory.FightingGame;

import java.util.*;

public class FightingGame {

    public static void main(String[] args) {
	 Player p1 = new Player(300, 20, 5, "", "CodingFactory");
     Player p2 = new Player(200, 30, 4, "", "ESIEE-IT");

     p1.setName(p1.getName());
     System.out.println(p1.name);
        p2.setName(p2.getName());
        System.out.println(p2.name);



    }
}

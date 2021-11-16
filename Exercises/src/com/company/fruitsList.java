package com.company;
import java.util.*;

public class fruitsList {
    public static void main(String[] args) {


        List<String> myFruits = new ArrayList<String>();
        myFruits.add("Pomme");
        myFruits.add("Banane");
        myFruits.add(1,"Fraise");
        myFruits.add("Kiwi");
        myFruits.remove(1);
        int myFruitsLength = myFruits.size();

        for (int i = 0; i < myFruitsLength; i++) {
            System.out.println(myFruits.get(i));
        }

    }
}

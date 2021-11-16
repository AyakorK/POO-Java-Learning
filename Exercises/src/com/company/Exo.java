package com.company;

public class Exo {
    public static void main(String[] args) {
        Compteur c1, c2, c3;
        c1 = new Compteur   (0);
        c1.increment();
        c2 = new Compteur(1);
        c3 = c1;
        
        if (c3 == c1) {
            System.out.println("c1 et c3 sont égaux");
        }else {
            System.out.println("c1 et c3 ne sont pas égaux");
        }
        if (c1.getValue() == c2.getValue()) {
            System.out.println("c1 et c2 ont la même valeur");
        }else {
            System.out.println("c1 et c2 n'ont pas la même valeur");
        }
        if (c1 == c2) {
            System.out.println("c1 et c2 sont égaux");
        }else {
            System.out.println("c1 et c2 ne sont pas égaux");
        }

        if (c1.getValue() == c1.increment().getValue()) {
            System.out.println("c1 et c1 incrémenté ont la même valeur");
        }else {
            System.out.println("c1 et c1 incrémenté n'ont pas la même valeur");
        }
        if (c1 == c1.increment()) {
            System.out.println("c1 et c1 incrémenté sont égaux");
        }else {
            System.out.println("c1 et c1 incrémenté ne sont pas égaux");
        }


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c1.increment());
        System.out.println(c1.getValue());
        System.out.println(c1.increment().getValue());
    }
}
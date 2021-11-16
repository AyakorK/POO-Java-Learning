package com.company;

public class Compteur {
    int x;

    Compteur (int n) {
         x = n;
    }

    Compteur increment() {
        x++;
        return this;
    }

    int getValue() {
        return x;
    }
}

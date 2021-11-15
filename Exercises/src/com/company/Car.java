package com.company;

public class Car {
    int speed;
    String model;
    String type;
    String color;

    public Car(int speed, String model, String type, String color) {
        this.speed = speed;
        this.model = model;
        this.type = type;
        this.color = color;
    }

    boolean isStopped() {
        if (this.speed == 0) {
            System.out.println("La voiture " + this.type + " est à l'arrêt");
            return true;
        } else {
            return false;
        }
    }

    int increaseSpeed(int increment) {
        if (this.speed < increment && increment < 0) {
            this.speed = 0;
            return this.speed;
        } else if (this.speed <= 0 && increment < 0) {
            this.speed = 0;
            return this.speed;
        } else {
            this.speed += increment;
            return this.speed;
        }

    }
    void showSpeed() {
        System.out.println("La vitesse de la " + this.type + " du modèle " + this.model +  " est de " + this.speed + " km/h");
    }

}



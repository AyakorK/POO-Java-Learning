package com.company;

public class CarTest {

    public static void main(String[] args) {

        Car voiture1 = new Car(0, "Tesla", "Tesla modèle 3", "Rouge");
        for (int i = 0; i < 5; i++){
            voiture1.isStopped();
            voiture1.increaseSpeed(20);
            voiture1.showSpeed();
    }
        for (int i = 0; i < 100; i++){
            if (voiture1.speed > 30) {
                voiture1.isStopped();
                voiture1.increaseSpeed(-30);
                voiture1.showSpeed();
            }else {
                voiture1.speed = 0;
                voiture1.showSpeed();
                voiture1.isStopped();
                break;
            }
        }


        Car voiture2 = new Car(0, "Citroen", "C4", "Bleue");
        for (int i = 0; i < 5; i++){
            voiture2.isStopped();
            voiture2.increaseSpeed(15);
            voiture2.showSpeed();
        }
        for (int i = 0; i < 100; i++){
            if (voiture2.speed > 20) {
                voiture2.isStopped();
                voiture2.increaseSpeed(-20);
                voiture2.showSpeed();
            } else {
                voiture2.speed = 0;
                voiture2.showSpeed();
                voiture2.isStopped();
                break;
            }
        }
    }
}

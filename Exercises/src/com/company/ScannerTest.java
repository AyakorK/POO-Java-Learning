package com.company;
import java.util.Scanner;



public class ScannerTest {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est ton nom ? ");
        String name = sc.nextLine();
        System.out.println("Quel est ton âge ? ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Tu as " + age + " ans et tu es mineur");
        } else if (age > 120) {
            System.out.println(name + ", tu as rentré un âge invalide");
        } else {
            System.out.println("Salut " + name + " tu as " + age + " ans et tu es majeur");
        }

    String[] fruits = new String[]{"Pomme", "Banane", "Kiwi"};

        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }


}

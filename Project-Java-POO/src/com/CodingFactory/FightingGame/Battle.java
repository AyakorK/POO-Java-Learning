package com.CodingFactory.FightingGame;
import java.util.*;

public class Battle {

    public Battle(double health, double attack, double initiative, String name) {
        //super(health, attack, initiative, name);
    }









    int endBattle;
    int startBattle;



    public int getStartBattle() {
        System.out.println("Battle start !");
        return startBattle;
    }


    public void setStartBattle(int startBattle) {
        this.startBattle = startBattle;
    }

    public int getEndBattle(Characters p1) {
        if(p1.health == 0){
            System.out.println("It's end game !");
        }
        return endBattle;
    }


    public void setEndBattle(int endBattle) {
        this.endBattle = endBattle;
    }



    String player1;
    String player2;
    int initiative;





    public static void main(String[] args) {

        Scanner start = new Scanner(System.in);
        System.out.println("Hello user, what do you want to do ?\n" + "1 - Leave\n" + "2 - Start a fight");
        String option = start.nextLine();

        if(option.equals("2")){
            System.out.println("Le combat commence");

        }


    }
}
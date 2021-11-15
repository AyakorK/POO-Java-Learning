package com.company;

public class Launcher {

    public static void main(String[] args) {
        PseudoRandomGenerator prng;
        double value = 0.0;
        prng = new PseudoRandomGenerator();
        for (int i = 0; i < 10; i++) {
            value = prng.random();
            //System.out.println(value);
        }

        long myTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            value = prng.random();
        }
        myTime = System.nanoTime() -myTime;
       // System.out.println("PRNG Execution time = " + Long.toString(myTime) + " nsec");

        long mathRandomTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            value = Math.random();
        }
        mathRandomTime = System.nanoTime() -mathRandomTime;
        //System.out.println("Math.random Execution time = " + Long.toString(mathRandomTime) + " nsec");
    }
}
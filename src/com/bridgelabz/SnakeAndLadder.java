package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random rand = new Random();
        int position1=0;
        int dieRoll = rand.nextInt(6)+1;
        System.out.println(dieRoll);

    }
}

package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random rand = new Random();
        int position1 = 0;
        int numRoll = 0;
        while (position1 < 100) {
            int dieRoll = rand.nextInt(6) + 1;
            System.out.println("Die roll is : " + dieRoll);
            position1 += dieRoll;
            numRoll++;

            System.out.println(numRoll+" times dice has been rolled.");
            if (position1>100){
                position1-=dieRoll;
                numRoll++;
                System.out.println("Player position is : "+position1);
                System.out.println(numRoll+" times dice has been rolled.");
            }
            System.out.println("Player position : " + position1);
            int option = rand.nextInt(3);
            if ( position1>=10 && position1<=85 ) {
                switch (option) {
                    case 0:
                        System.out.println("Condition : No play");
                        break;
                    case 1:
                        System.out.println("Hurray ! You got Ladder. ");
                        int bonusRoll = rand.nextInt(6) + 1;
                        System.out.println("Die roll is " + bonusRoll);
                        position1 += bonusRoll;
                        numRoll++;
                        System.out.println("Player position is : "+position1);
                        System.out.println(numRoll+" times dice has been rolled.");
                        break;
                    default:
                        System.out.println("OOPS!!You attacked by snake.");

                        position1 -= dieRoll;
                        System.out.println("Player position is : "+position1);

                }
            }

        }
    }
}

package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Random rand = new Random();
        int position1=0;
        int dieRoll = rand.nextInt(6)+1;
        System.out.println("Dieroll is : "+dieRoll);
        position1+=dieRoll;
        System.out.println("Player 1 : "+position1);
        int option = rand.nextInt(3);
       switch (option){
           case 0 :
               System.out.println("No play");
               break;
           case 1 :
               System.out.println("Hurray ! You got Ladder. ");
               int bonusRoll = rand.nextInt(6)+1;
               System.out.println("Dieroll is "+bonusRoll);
               position1+=bonusRoll;
               System.out.println(position1);
               break;
           default:
               System.out.println("OOPS!!You attacked by snake.");

               position1-=dieRoll;
               System.out.println(position1);
       }
    }
}

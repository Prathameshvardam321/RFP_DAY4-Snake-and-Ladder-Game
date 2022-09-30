package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder {

    public static void main(String[] args) {
        Random r = new Random();
        int v, j = 0;
        int p1 = 0;              // position player 1
        int p2 = 0;              // position player 2
        int numRoll_1=0;         // Number of times player1 rolled dice
        int numRoll_2=0;         // Number of times player2 rolled dice

        while ( p1 != 100 && p2 != 100 ) {
            int count = 0;
            // For starting the game the value of p1 must be 6.
            if ( p1 < 6 ) {

                v = (r.nextInt(6) + 1);        //For collecting die roll value
                p1 = p1 + v;
                numRoll_1++;             //Incrementing value of number of times dice rolled.
                System.out.println("value of p1 "+p1);

                if (p1<6){         //If value of p1 is other than 6 then we will take it 0 as we do in practical game.
                    p1=0;
                }
            }
            //For starting the game the value of p2 must be 6.
            if ( p2 < 6 ) {
                p2 = 0;
                j = (r.nextInt(6) + 1);
                p2 = p2 + j;
                numRoll_2++;
                System.out.println("value of p2 "+p2);
                if (p2<6){
                    p2=0;
                }
            }
            //These work will work on condition If p1 has got starting 6 value.
            if (p1>5) {
                v = (r.nextInt(6) + 1);
                p1 = p1 + v;
                numRoll_1++;
                if (p1%33==0 || p1==97 || p1==94 || p1%27==0) {
                    System.out.println("value of p1 " + p1);
                    p1 = p1 - (p1 / 3);
                    System.out.println("OOPs !!! P1 you attacked by snake ");
                }
                //For ladder
                for (int i =1 ;i<=60;i++){         //This logic is for p1 value under 60,the value will be incremented by logic implemented.
                    if (p1==i){
                        if (p1%12==0||p1%16==0||p1%30==0){
                            System.out.println("Value of p1 "+p1);
                            System.out.println("Hurray P1 !!! You got ladder ");
                            p1=p1+p1/2;
                        }
                    }
                }
                //This logic is for p1 value above 60,it will assign the player1 to new value.
                switch (p1){
                    case 28:System.out.println("Value of p1 "+p1);
                        p1=84;
                        System.out.println("Hurray P1 !!! You got ladder ");
                        break;
                    case 73:System.out.println("Value of p1 "+p1);
                        p1=92;
                        System.out.println("Hurray P2 !!! You got ladder ");
                        break;
                    case 83:System.out.println("Value of p1 "+p1);
                        p1=98;
                        System.out.println("Hurray P1 !!! You got ladder ");

                }
                //Checking if player1 goes beyond 100 then it will be back to its previous value.
                while (p1 > 100) {
                    p1 = p1 - v;
                    v = (r.nextInt(6) + 1);
                    p1 = p1 + v;
                }
                //This loop using for printing value single time.
                if (p1>6) {
                    System.out.println("Value of p1 " + p1);
                }

            }
            //If player completed 100 first then no need run program further to calculate player 2 value as in actual game we do.
            if (p1==100){
                break;
            }
            //These work will work on condition If p2 has got starting 6 value.
            if (p2>5){
                j = (r.nextInt(6) + 1);       //For collecting die roll value
                p2 = p2 + j;
                numRoll_2++;                         //Incrementing value of number of times dice rolled.
                if (p1%33==0 || p1==97 || p1==94 || p1%27==0){
                    System.out.println("value of p2 "+p2);
                    p2=p2-(p2-8);
                    System.out.println("OOPs !!! P2 you attacked by snake ");
                }
                //For ladder
                for (int i =1 ;i<=60;i++){        //This logic is for p2 value under 60,the value will be incremented by logic implemented.
                    if (p2==i){
                        if (p2%12==0||p2%16==0||p2%30==0){
                            System.out.println("Value of p2 "+p2);
                            System.out.println("Hurray P2 !!! You got ladder ");
                            p2=p2+p2/2;
                        }
                    }
                }
                switch (p2){               //This logic is for p1 value above 60,it will assign the player1 to new value.
                    case 28:System.out.println("Value of p2 "+p2);
                        p2=84;
                        System.out.println("Hurray P2 !!! You got ladder ");
                        break;
                    case 73:System.out.println("Value of p2 "+p2);
                        p2=92;
                        System.out.println("Hurray P2 !!! You got ladder ");
                        break;
                    case 83:System.out.println("Value of p2 "+p2);
                        p2=98;
                        System.out.println("Hurray P2 !!! You got ladder ");
                }
                //Checking if player2 goes beyond 100 then it will be back to its previous value.
                while ( p2 > 100 ) {
                    p2 = p2 - j;
                    j= (r.nextInt(6) + 1);
                    p2 = p2 + j;
                }
                //This loop using for printing value single time.
                if (p2>6) {
                    System.out.println("Value of p2 " + p2);
                }
            }

        }
        System.out.println(numRoll_1+" times Player 1 has rolled dice.");
        System.out.println(numRoll_2+" times Player 2 has rolled dice.");
        if ( p1 == 100 ){
            System.out.println(" P1 is winner ");
        }
        else
        {
            System.out.println("P2 is winner");
        }
    }


    }

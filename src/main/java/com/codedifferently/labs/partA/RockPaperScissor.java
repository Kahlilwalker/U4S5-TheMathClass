package com.codedifferently.labs.partA;

public class RockPaperScissor {

    public static void main(String[] args) {

        int number;
        number = (int) (Math.random() * 10);

        if (number <= 3) {
            System.out.println("I Play Rock!");
        }
        if (number <= 6 && number > 3) {
            System.out.println("I Play Paper!");

        }
        if (number <= 10 && number > 6) {
            System.out.println("I Play Scissors!");

        }
        System.out.println(number);
    }
}
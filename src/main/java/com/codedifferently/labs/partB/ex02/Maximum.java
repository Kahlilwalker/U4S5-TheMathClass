package com.codedifferently.labs.partB.ex02;
import java.util.Random;

public class Maximum {


    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        // Find the maximum of x and y
        int max = Math.max(x, y);

        System.out.println("The maximum value is: " + max); // Output: 20
    }
}


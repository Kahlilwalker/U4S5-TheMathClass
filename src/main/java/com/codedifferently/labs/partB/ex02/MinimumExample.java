package com.codedifferently.labs.partB.ex02;

public class MinimumExample {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        // Find the maximum of x and y
        int min = Math.min(x, y);

        System.out.println("The maximum value is: " + min); // Output: 20
    }
}


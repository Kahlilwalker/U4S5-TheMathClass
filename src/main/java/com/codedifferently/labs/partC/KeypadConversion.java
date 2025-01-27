
package com.codedifferently.labs.partC;
import java.util.Scanner;

public class KeypadConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toUpperCase();
        String output = "";

        for (char ch : input.toCharArray()) {
            output += getKeyPresses(ch);
        }

        System.out.println("Keypad sequence: " + output);
    }

    private static String getKeyPresses(char ch) {
        switch (ch) {
            case 'A': case 'B': case 'C': return "2";
            case 'D': case 'E': case 'F': return "3";
            case 'G': case 'H': case 'I': return "4";
            case 'J': case 'K': case 'L': return "5";
            case 'M': case 'N': case 'O': return "6";
            case 'P': case 'Q': case 'R': case 'S': return "7";
            case 'T': case 'U': case 'V': return "8";
            case 'W': case 'X': case 'Y': case 'Z': return "9";
            case ' ': return "0";
            default: return "";
        }
    }
}
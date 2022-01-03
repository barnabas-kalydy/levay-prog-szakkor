package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        int lifes = 6;
        String word = "alma";

        boolean[] guessed = new boolean[word.length()];
        char[] badLetters = new char[lifes + 1];

        while (lifes >= 0) {
            printHangman(lifes);
            printActualState(guessed, word);
            printBadLetters(badLetters);
            System.out.println("You got " + lifes + " lifes left.");
            char userInput = getUserInput();

            if (word.contains(Character.toString(userInput))) {
                for (int i = 0; i < word.length(); i++) {
                    if(word.charAt(i) == userInput) {
                        guessed[i] = true;
                    }
                }
            } else {
                lifes--;
                badLetters[5-lifes] = userInput;
            }
        }
    }

    public static void printHangman(int lives) {
        File file = new File("C:/Users/levaygimi/IdeaProjects/elso-projekt/src/main/java/org/example/ascii_art/"
                + Integer.toString(lives) + ".txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException e) {
            System.err.println("gebasz");
        }
    }

    public static char getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add a new character: ");
        char newChar = sc.nextLine().charAt(0);
        return newChar;
    }

    public static void printActualState(boolean[] guessed, String word) {
        for (int i = 0; i < word.length(); i++) {
            if(guessed[i]) {
                System.out.print(word.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public static void printBadLetters(char[] badLetters) {
        // TODO print all tryed letters
        StringBuilder sb = new StringBuilder("Already tryed letters: ");
        for (char c : badLetters) {
            sb.append(c + ", ");
        } 
        try {
            System.out.println(sb.toString());
        } catch(IndexOutOfBoundsException e) {
            System.out.println("valami");
        }
    }
    
}

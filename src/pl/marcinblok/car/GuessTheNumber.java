package pl.marcinblok.car;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int randomNumber;
    int maxRange;
    Scanner sc = new Scanner(System.in);


    public GuessTheNumber() {
        maxRange = 100;
        Random rand = new Random();
        randomNumber = Math.abs(rand.nextInt()) % (maxRange + 1);
    }

    public void guessTheNumber() {
        while (true) {
            int guess = sc.nextInt();
            if (guess > randomNumber) {
                System.out.println("Your number is too big.");
            } else if (guess < randomNumber) {
                System.out.println("Your number is too small.");
            } else {
                System.out.println("YOU GOT IT BRO!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        System.out.println("Welcome to my game. Try to guess my number." +
                " It's between 0 and " + game.maxRange + " inclusive." +
                " Just type a number to get started.");
        game.guessTheNumber();
    }
}

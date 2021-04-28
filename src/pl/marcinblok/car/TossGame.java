package pl.marcinblok.car;

import java.util.Random;

public class TossGame {

    public String play() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0) {
            return "HEADS";
        } else {
            return "TAILS";
        }
    }

    public static void main(String[] args) {
        TossGame game = new TossGame();
        System.out.println(game.play());
        System.out.println(game.play());
        System.out.println(game.play());
        System.out.println(game.play());
    }
}

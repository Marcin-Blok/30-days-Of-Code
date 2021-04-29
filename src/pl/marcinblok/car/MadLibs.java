package pl.marcinblok.car;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    private String name;
    private String story;
    private String adjective1;
    private String adjective2;
    private String noun1;
    private String noun2;
    private String noun3;
    private String adverb;
    private String randomNumbers;

    // Getters

    public String getName() {
        return name;
    }

    public String getStory() {
        return story;
    }

    public String getAdjective1() {
        return adjective1;
    }

    public String getAdjective2() {
        return adjective2;
    }

    public String getNoun1() {
        return noun1;
    }

    public String getNoun2() {
        return noun2;
    }

    public String getNoun3() {
        return noun3;
    }

    public String getAdverb() {
        return adverb;
    }

    public String getRandomNumbers() {
        return randomNumbers;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String verb) {
        this.adverb = verb;
    }

    public void setRandomNumbers() {
        int num = Math.abs(rand.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
       this.randomNumbers = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }

    // Print instructions for player
    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in words, " +
                "we will give you a story. Start by typing in a name.");
    }

    // Get data from player
    public void enterName() {
        setName(sc.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Give me a noun, please.");
        setNoun1(sc.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Give me another noun.");
        setNoun2(sc.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Give me last noun.");
        setNoun3(sc.nextLine());
    }

    public void enterAdjective1(){
        System.out.println("I need an adjective.");
        setAdjective1(sc.nextLine());
    }

    public void enterAdjective2(){
        System.out.println("I really need an alpaca...just kidding, " +
                "give me another adjective.");
        setAdjective2(sc.nextLine());
    }

    public void enterAdverb (){
        System.out.println("PLEASE, I really need an adverb!");
        setAdverb(sc.nextLine());
    }

    public void createStory(){
        String story;
        int num = Math.abs(rand.nextInt()) % 2;
        if (num == 0){
            story = "Jesse and her best frind " + getName() + " went to Disnay World today! " +
                    "They saw a " + getNoun1() + " in show at the Magic Kingdom " +
                    "and ate " + getAdjective1() + " feast for diner. The next day I" +
                    " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + "" +
                    " and then that night I gazed at the " + getRandomNumbers() + " " +
                    getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        }else{
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. " +
                    "They saw a huge " + getNoun1() + " and tiny little " + getNoun2() + ". " +
                    "That night they decided to climb " + getAdverb() + " into the " + getNoun3() + " to get closer look. " +
                    "The zoo was " + getAdjective1() + " at night, but they didn't care..." +
                    "until " + getRandomNumbers() + " " + getAdjective2() + " apes yelled in their faces, making" +
                    " Amanda and " + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }

    public void play(){
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNumbers();
        createStory();
        System.out.println(getStory());
    }


    public static void main(String[] args) {

        MadLibs game = new MadLibs();
        game.printInstructions();
        game.play();
    }
}

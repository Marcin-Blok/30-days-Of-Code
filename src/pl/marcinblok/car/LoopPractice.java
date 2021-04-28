package pl.marcinblok.car;

public class LoopPractice {

    public static void practiceWhileLoop() {
        int x = 0;
        while (x < 10) {
            System.out.println("The value of x is: " + x);
            x++;
        }
    }

    public static void practiceDoWhileLoop() {
        int x = 0;
        do {
            System.out.println("The value of x is: " + x);
            x++;
        } while (x < 10);
    }

    public static void practiceForLoop() {
        for (int i = 0; i < 20; i++) {
            System.out.println("The value of x is: " + i);
            if (i == 10) {
                break;
            }
        }
        System.out.println("This is the end");
    }

    public static void practiceForLoop2() {
        for (int i = 10; i > 0; i--) {
            System.out.println("The value of x is: " + i);
        }
        System.out.println("This is the end");
    }

    public static void practiceNestedForLoop() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        }
        System.out.println("This is the end");
    }

    public static void main(String[] args) {

        System.out.println("While loop:");
        practiceWhileLoop();
        System.out.println("\nDo-While loop:");
        practiceDoWhileLoop();
        System.out.println("\nFor loop:");
        practiceForLoop();
        System.out.println("\nDescending For loop:");
        practiceForLoop2();
        System.out.println("\nNested For loop:");
        practiceNestedForLoop();
    }
}

package pl.marcinblok.car;

import java.util.Scanner;

public class Recursion {
    /* f(f(f(a))) --- a = 20
       f(a) = 5 + a
       f(20) = 5 + 20 = 25

       f(f(f(20))) --- f(f(f(25)))
       f(25) = 5 + 25 = 30

       f(f(f(20))) --- f(f(f(30)))
       f(30) = 5 + 30 = 35

       f(f(f(20))) --- f(f(f(25))) --- f(f(f(30))) --- 35

       Summation -> np: 5+4+3+2+1=0; albo 7+6+5+4+3+2+1=0; albo 1; albo 2+1=0;
     */

    public static int Summation(int n) {
        // Base Case: WE ARE AT THE END
        if (n <= 0) {
            return 0;  // additive identity property  -  Przy dodawaniu ustawiam 0 ale przy mnożeniu ustawiam 1 bo np, 5 * 0 = 0!! a to byłby błąd! Patrz 2 przykład, poniżej.
            // Inaczej mówiąc, jak dostanę mój numer przy użyciu dodawania...np 5 + 0 = 5 :)
            // Recursive Case: KEEP GOING
        } else {
            // 3 + Summation(2);
            // 3 + 2 + Summation(1);
            // 3 + 2 + 1 + Summation(0);
            // 3 + 2 + 1 + 0 = 6
            return n + Summation(n - 1);
        }
    }


    // Factorial inaczej Silnia z liczby np: 5! -> 5 * 4 * 3 * 2 * 1; --- 5 * 4!
    //                                       4! -> 4 * 3 * 2 * 1;
    public static int Factorial(int n) {
        // Base Case:
        if (n <= 1) {   // multiplicative identity means that anything multiplying by this number czyli 1 = this number.
            // Inaczej mówiąc, jak dostanę mój numer przy użyciu mnożenia...np 5 * 1 = 5 :)
            return 1;
            // Recursive Case:
        } else {
            // Factorial(4) = 4 * Factorial(3);
            // 4 * 3 * Factorial(2);
            // 4 * 3 * 2 * Factorial(1);
            // 4 * 3 * 2 * 1

            return n * Factorial(n - 1);
        }
    }


    //Exponentiation - potęgowanie --- 5^3 --- 5 * 5 * 5
    //                                 5^3 = 5 * 5^2 = 5 * 5 * 5^1 = 5 * 5 * 5 * 5^0 = 5 * 5 * 5 * 1
    public static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) { // multiplicative identity means that anything multiplying by this number czyli 1 = this number. Każda liczba do potęgi 0 = 1!
            return 1;
            // Recursive Case:
        } else {
            // 5 * Exponentiation(5,2)
            // 5 * 5 * Exponentiation(5,1)
            // 5 * 5 * 5 * Exponentiation(5,0)
            // 5 * 5 * 5 * 1
            return n * Exponentiation(n, p - 1); // nie zmieniam n bo jak w linii 52 wartość którą mnożę jest zawsze ta sama!
        }

    }

    // Rekurancja z użyciem modulo
    public static int find_gcd(int a, int b) {
        if (b != 0) {
            return find_gcd(b, a % b);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println("Recursive " + Summation(3));
        System.out.println("Factorial " + Factorial(3));
        System.out.println("Exponentiation " + Exponentiation(5, 3));

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 2
        int b = sc.nextInt(); // 3

        int gcd = find_gcd(a, b);
        System.out.println(gcd);
    }
}

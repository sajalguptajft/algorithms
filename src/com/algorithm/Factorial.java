package com.algorithm;

import java.util.Scanner;

public class Factorial {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = scanner.nextInt();

        System.out.println("Recursive factorial : " + recursiveFactorial(num));
        System.out.println("Non-recursive factorial : " + nonRecursiveFactorial(num));

    }

    public static int recursiveFactorial (int num) {

//        1! = 1 * 0! = 1
//        2! = 2 * 1 = 2 * 1!
//        3! = 3 * 2 * 1 = 3 * 2!
//        4! = 4 * 3 * 2 * 1 = 4 * 3!
//        n! = n * (n - 1)!

        if (num == 0) return 1;

        return num * recursiveFactorial(num - 1);
    }

    public static int nonRecursiveFactorial (int num) {

        if (num == 0) return 1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

}

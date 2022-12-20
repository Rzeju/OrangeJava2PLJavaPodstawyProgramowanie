package zad7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Podaj liczbę naturalna n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int previous = 1;
        int current = 1;

        if (n > 2) {
            for (int i = 2; i < n; i++) {
                int next = current + previous;

                previous = current;
                current = next;
            }
        }

        System.out.printf("Element n = %d ciągu Fibonacciego wynosi -> %d", n, current);
    }

    public static int calculateFibonacciRecursion(int n) {
        if (n < 2) {
            return 1;
        } else {
            return calculateFibonacciRecursion(n - 1) + calculateFibonacciRecursion(n - 2);
        }
    }
}

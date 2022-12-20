package zad6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę naturalną: ");

        int number = scanner.nextInt();
        double suma = 0;
        for (double i = 1; i <= number; i++) {
            System.out.printf(" + %.2f", 1 / i);
            suma = suma + 1 / i;
        }
        System.out.println(" ");
        System.out.println("Suma to: " + suma);
    }
}

package zad4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {

            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("PIF PAF!");
            } else if (i % 3 == 0) {
                System.out.println("PIF!");
            } else if (i % 7 == 0) {
                System.out.println("PAF!");
            } else {
                System.out.println(i);
            }
        }
    }
}

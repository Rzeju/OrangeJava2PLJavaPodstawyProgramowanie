package zad8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaje pierwszą liczbę = ");
        float number1 = scanner.nextFloat();

        System.out.print("Podaj znak działania: ");
        //char sign = scanner.next().charAt(0);
        String mySign = scanner.next();

        System.out.print("Podaj drugą liczbę = ");
        float number2 = scanner.nextFloat();

        switch (mySign) {
            case "+":
                System.out.println("Wynik dodawania = " + (number1 + number2));
                break;
            case "-":
                System.out.println("Wynik odejmowania = " + (number1 - number2));
                break;
            case "*":
                System.out.println("Wynik mnożenia = " + (number1 - number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Błąd");
                } else {
                    System.out.println("Wynik dzielenia = " + (number1 / number2));
                }
                break;
            default:
                System.out.println("Błędny znak");
                break;
        }
    }
}

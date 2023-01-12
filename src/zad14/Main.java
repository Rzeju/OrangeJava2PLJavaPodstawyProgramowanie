package zad14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);

        int result = 0;
        if ((firstLetter < 'a' || firstLetter > 'z') || (secondLetter < 'a' || secondLetter > 'z')) {
            System.out.println("Podaj tylko małe litery");
        } else if (firstLetter == secondLetter) {
            System.out.println("Podałeś dwie takie same litery. Brak znaków między nimi");
        } else {
            result = Math.abs(firstLetter - secondLetter) - 1;
            System.out.println("Odległość między literami to = " + result);
        }
    }
}

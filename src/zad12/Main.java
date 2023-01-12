package zad12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] textArray = text.split("");

        int spaces = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals(" ")) {
                spaces++;
            }
        }

        float result = 100f * spaces / textArray.length;

        System.out.printf("W podanym tekście zawartość spacji to %f%%", result);


        ///ALTERNATYWNE ROZWIĄZANIE

        String str = text;
        int all = str.length();
        System.out.println("Długość tekstu ze spacjami: " + all);

        int spacje = text.split(" ").length - 1;
        System.out.println("Spacje: " + spacje);

        double rownanie = ((double) spacje / all) * 100;
        double równianie = 100d * spacje / all;
        System.out.println("wynik = " + rownanie + "%");

        System.out.printf("2. W podanym tekście zawartość spacji to %f%%", result);
    }
}

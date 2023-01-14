package zad11;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);
        //zmienna pokmocnicza do przechowywania najdluższego tekstu
        String result = "";
        //zmienna do przechowywania tekstu wprowadzonego przez użhytkownika
        String text;

        //pętla do-while
        do {
            //przypisanie tekstu wprowadzonego przez użytkownika do zmiennej tekst
            text = scanner.nextLine().trim();

            //sprawdzenie czy wprowadzony tekst to 'Starczy'
            if (text.equals("Starczy")) {
                //przerwania działania pętli (przerwanie działania programu)
                break;
            //sprawdzenie czy wprowadzony tekst jest pusty
            } else if (text.isBlank()) {
                //wypisanie na ekran informacji o pustym tekście wprowadzonym przez użytkownika
                System.out.println("Nie podano żadnego tesktu");
            }

            //sprawdzenie czy nowowprowadzony tekst jest dłuższy od najdłuższego tekstu wprowadzonego do tej pory
            if (text.length() > result.length()) {
                //przypisanie dłuższego tekstu do wyniku
                result = text;
            }

        //pętla nieskończona
        } while (true);

        //wypisanie wyniku na ekran
        System.out.println(result);

    }


}


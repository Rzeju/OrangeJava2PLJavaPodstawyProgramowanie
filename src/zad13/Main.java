package zad13;

public class Main {

    public static void main(String[] args) {

        //tekst do powtórzenia
        String somethingToSay = "Ala ma kota";

        //podzielenie tekstu na tablice Stringów (każdy element to odzielne słowo)
        //separatorem jest tutaj spacja
        String[] myText = somethingToSay.split(" ");

        //pętla przechodząca przez wszystkie słowa w tablicy
        for (int i = 0; i < myText.length; i++) {
            //dwukrotne wypisanie na ekran każdego ze słów
            String word = myText[i];
            System.out.printf("%s %s ", word, word);
        }
    }
}

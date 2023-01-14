package zad10;

public class Main {

    public static void main(String[] args) {

        //liczba, której cyfyr będziemy sumować
        int number = 12345;
        //liczba, której cyfyr będziemy sumować dla drugiego sposobu rozwiązania
        int numberToPrint = number;

        //zmienna pokmocnicza do przechowywania wyniku
        int result = 0;
        //pętla while. Będzie się wykonywać do momentu aż zmienna number będzie wynosić 0
        while (number != 0) {
            //dodanie reszty z dzielenia przez 10 liczby number do aktualnej wartości zmiennej result
            result = result + number % 10;
            //podzielenie liczby number przez 10 i przypisanie wyniku do tej samej zmiennej
            //w efekcie tego działania przesuwany cyfry liczby o jeden w prawo
            //np. 12345 / 10 = 1234,5 -> number jest typu int zatem część ułamkowa zostanie utacona
            //w wyniku otrzymamy już tylko 1234
            number = number / 10;
        }

        //wypisanie wyniku na ekran
        System.out.printf("Suma cyfr liczby %d wynosi %d%n", numberToPrint, result);

        //ALTERNATYWANE ROZWIĄZANIE
        //zamiana liczby na obiekt typu String
        String digit = String.valueOf(numberToPrint);
        //utworzenie z obiektu typu String tablicy (każda cyfra będzie oddzielnym elementem tej tablicy)
        String[] numbers = digit.split("");

        //zmienna pokmocnicza do przechowywania wyniku
        result = 0;

        //pętla obliczająca sumę cyfr liczby
        for (int i = 0; i < numbers.length; i++) {
            //każdy kolejny element tablicy jest zamieniany ze Stringa na inta i dodawany do wyniku
            result = result + Integer.parseInt(numbers[i]);
        }

        //wypisanie wyniku na ekran
        System.out.println("Suma cyfr metodą alternatywaną" + result);

    }
}

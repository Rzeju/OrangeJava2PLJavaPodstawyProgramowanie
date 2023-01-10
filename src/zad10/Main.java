package zad10;

public class Main {

    public static void main(String[] args) {

        int number = 12345;
        int numberToPrint = number;

        int result = 0;
        while (number != 0) {
            result = result + number % 10;
            number = number / 10;
        }

        System.out.printf("Suma cyfr liczby %d wynosi %d%n", numberToPrint, result);

        //ALTERNATYWANE ROZWIĄZANIE
        String digit = String.valueOf(numberToPrint);
        String[] numbers = digit.split("");

        result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result = result + Integer.parseInt(numbers[i]);
        }

        System.out.println("Suma cyfr metodą alternatywaną" + result);

    }
}

package zad7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Podaj liczbę naturalna n = ");
        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);
        //Przypisanie liczby podanej przez użytkownika do zmiennej n
        int n = scanner.nextInt();

        //poprzedni element ciągu
        int previous = 1;
        //obecny element ciągu
        int current = 1;

        //sprawdzenie czy nie chcemy uzyskać 1 lub 2 elementu ciągu (1 i 2 element ciągu wynosi 1)
        if (n > 2) {
            //pętla obliczająca kolejne elementy ciągu do uzyskania zadanego elementu na pozycji n
            for (int i = 2; i < n; i++) {
                //obliczenie kolejnego wyrazu ciągu (suma obecnego i poprzedniego)
                int next = current + previous;

                //przypisanie wartości obecnego elementu do poprzedniego
                previous = current;
                //przypisanie nowo wyliczonego elementu ciągu do obecnego
                current = next;
                //zabieg ten pozwala nam na przechodzenie przez kolejne elementu ciągu
                //jeżeli obecne elementu to previous = 1 oraz current = 1 to kolejny element jest ich sumą czyli 2
                //bo obliczeniu kolejnego elementu 2 staję się on naszym obenym elementem czyli current = 2;
                //na poprzedni element to 1 czyli previous = 1
                //w kolejnym kroku nowy element to 3 (current + previous -> 1 + 2)
                //tym razem naszym obecnym nowo wyliczonym elementem będzie current = 3 a poprzednim previous = 2
            }
        }

        System.out.printf("Element n = %d ciągu Fibonacciego wynosi -> %d", n, current);

        int recursionResult = calculateFibonacciRecursion(n);
        System.out.printf("\nREKURENCJA!! Element n = %d ciągu Fibonacciego wynosi -> %d", n, recursionResult);
    }

    public static int calculateFibonacciRecursion(int n) {
        if (n < 3) {
            return 1;
        } else {
            return calculateFibonacciRecursion(n - 1) + calculateFibonacciRecursion(n - 2);
        }
    }
}

package zad17;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Utworzenie skanera
        Scanner scanner = new Scanner(System.in);
        //Podbranie od użytkownika daty
        String userInputDate = scanner.nextLine();

        //Parsowanie strinka przekazanego przez użytkownika na LocalDate
        LocalDate courseDate = LocalDate.parse(userInputDate);
        //Pobranie LocalDate dla obecnej chwili
        LocalDate today = LocalDate.now();

        //Obliczenie liczby dni pomięzy datami
        long chronoUnitResult = ChronoUnit.DAYS.between(today, courseDate);

        //Metoda z ChronoUnit.DAYS.between zwraca liczbę dni pomiędzy data
        //Tutaj będzie prostasza w użyciu
        System.out.println("Liczba dni pomiędzy data wynosi " + chronoUnitResult);

        //Utworzenie obiektu typo Period (okres pomiędzy datami)
        Period periodResult = Period.between(today, courseDate);

        //Period może wprowadzać tutaj w błąd
        //Zamienia on różnicę w datach na pełne okres lat, miesięcy i dni
        //Jeżeli różnica w datach wynosi np. 35 dni w wyniku otrzymamy 1 miesiąc i 5 dni
        System.out.println("Period Lata: " + periodResult.getYears());
        System.out.println("Period Miesiące: " + periodResult.getMonths());
        System.out.println("Period Dni: " + periodResult.getDays());
    }
}

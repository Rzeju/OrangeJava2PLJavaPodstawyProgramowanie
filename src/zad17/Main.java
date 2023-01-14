package zad17;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInputDate = scanner.nextLine();

        LocalDate courseDate = LocalDate.parse(userInputDate);
        LocalDate today = LocalDate.now();

        long chronoUnitResult = ChronoUnit.DAYS.between(today, courseDate);

        System.out.println("Liczba dni pomiędzy data wynosi " + chronoUnitResult);

        Period periodResult = Period.between(today, courseDate);

        System.out.println("Period Lata: " + periodResult.getYears());
        System.out.println("Period Miesiące: " + periodResult.getMonths());
        System.out.println("Period Dni: " + periodResult.getDays());
    }
}

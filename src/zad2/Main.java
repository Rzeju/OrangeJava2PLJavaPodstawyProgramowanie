package zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float weight = scanner.nextFloat();
        int height = scanner.nextInt();

        float heightInMeters = height / 100f;

        double BMI = weight / Math.pow(heightInMeters, 2);

        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI optymalne - " + BMI);
        } else {
            System.out.println("BMI Nieoptymalne - " + BMI);
        }

        //OBIEKTOWO

        Bmi bmi = new Bmi(weight, height);
        bmi.calculateBmi();

    }
}

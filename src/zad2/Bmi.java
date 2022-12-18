package zad2;

public class Bmi {

    private float weight;

    private float height;

    public Bmi(float weightInKilograms, int heightInCentimeters) {
        this.weight = weightInKilograms;
        this.height = heightInCentimeters / 100f;
    }

    public void calculateBmi() {
        double BMI = weight / Math.pow(height, 2);

        if (BMI > 18.5 && BMI < 24.9) {
            System.out.println("BMI Optymalne" + BMI);
        } else {
            System.out.println("BMI Nieoptymalne" + BMI);
        }
    }
}

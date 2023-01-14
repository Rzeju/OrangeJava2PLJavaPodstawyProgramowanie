package zad16;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 8, 4, 2, 5, 6, 11, 13, 15};

        int counter = 1;

        int result = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                counter++;
            } else {
                if (counter > result) {
                    result = counter;
                }
                counter = 1;
            }
        }

        if (counter > result) {
            result = counter;
        }

        System.out.println("Najdłuższy podciąg wynosi = " + result);
    }


}

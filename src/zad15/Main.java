package zad15;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 3, 10, 10, 10, 3, 8, 3, 1, 2, 10, 8, 3, 5, 5};

        boolean[] visited = new boolean[numbers.length];
        Arrays.fill(visited, false);

        for (int i = 0; i < numbers.length; i++) {

            if(visited[i]) {
                continue;
            }

            int counter = 1;
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    counter++;
                }
            }

            if (counter > 1) {
                System.out.print(numbers[i] +" ");
            }
        }
    }
}

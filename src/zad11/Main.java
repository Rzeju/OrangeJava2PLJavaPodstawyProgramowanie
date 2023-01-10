package zad11;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result = "";
        String text;

        do {
            text = scanner.nextLine().trim();

            if (text.equals("Starczy")) {
                break;
            } else if (text.isBlank()) {
                System.out.println("Nie podano żadnego tesktu");
            }

            if (text.length() > result.length()) {
                result = text;
            }

        } while (true);

        System.out.println(result);

    }


}


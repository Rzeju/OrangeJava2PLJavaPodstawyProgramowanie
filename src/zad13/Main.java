package zad13;

public class Main {

    public static void main(String[] args) {

        String somethingToSay = "Ala ma kota";

        String[] myText = somethingToSay.split(" ");

        for (int i = 0; i < myText.length; i++) {
            String word = myText[i];
            System.out.printf("%s %s ", word, word);
        }
    }
}

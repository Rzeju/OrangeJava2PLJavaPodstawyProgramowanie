package zad18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String easyRegex = "a+ psik";
        String complicatedRegex = "(^|\\s)a+\\spsik($|\\s)";

        Pattern pattern = Pattern.compile(easyRegex);

        String myString = "aaaaaaaaaaaaaaaa psik      hjgjkhghjghjghjkh";

        Matcher matcher = pattern.matcher(myString);
        boolean result = matcher.find();

        result = pattern.matcher(myString).find();

        if(result) {
            System.out.println("User kichnął");
        } else {
            System.out.println("User nie kichnął");
        }

    }
}

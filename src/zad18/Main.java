package zad18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //Regex dla 'aaaaa psik'
        //wersja prosta i wystarczająca
        String easyRegex = "a+ psik";
        //Regex dla 'aaaaa psik'
        //Przez naszym wrażeniem może być początek lini lub jedna spacja
        //Potem dowlna liczba a, jedna spacja oraz psik
        //na konću jednak spacja lub zakończenie linii
        String complicatedRegex = "(^|\\s)a+\\spsik($|\\s)";

        //Utowrzenie obiekty typu Pattern na podstawie regexu
        Pattern pattern = Pattern.compile(easyRegex);

        //String do testu
        String myString = "aaaaaaaaaaaaaaaa psik      hjgjkhghjghjghjkh";

        //Utworzenie obiektu typiu Matcher na podstawie przekazanego tekstu
        //Obiekt ten będzie porównywał nasz tekst z regexem w porządany przez na sposób
        Matcher matcher = pattern.matcher(myString);
        //metoda find() dla obiektu typu Matcher sprawdza czy dany regex występuje w naszym tekście
        boolean result = matcher.find();

        //jest to ta sama procedura jak powyżej zapisana w jednej linii
        result = pattern.matcher(myString).find();

        //w przekazanycm tekście wystąpił szuakny ciąg znaków
        if(result) {
            System.out.println("User kichnął");
        } else {
            //w przekazanycm tekście wystąpił szuakny ciąg znaków
            System.out.println("User nie kichnął");
        }

    }
}

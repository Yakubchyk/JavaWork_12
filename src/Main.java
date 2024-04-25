import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        System.out.println("  Hello World".replaceAll("^ +", ""));
//        System.out.println("  Hello     World".matches("[A-z]{5}"));

//        Pattern p = Pattern.compile("[A-z]{5}");
//        Matcher m = p.matcher("Hello im Danila!");
//
//        while (m.find()) {
//            System.out.println(m.group()); //Совпадение
//        }

        String text = "Today my 17th lesson. null I’m the best 1! Find me in inst: @teachmeskills";
        Matcher m = Pattern.compile("null").matcher(text);

        System.out.println(m.matches());


        String text1 = "coming from the 25/11/2020 to the 30/11/2020";
        Pattern p = Pattern.compile("([012][09]|3)");



    }
}

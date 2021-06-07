package module4.HomeWork5.StringExperiments2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, Kolya - 2000, а Маша - 30000 рублей";
//        String[] words = text.split(", ");
//        int sum = 0;
//        for(int i = 0; i < words.length; i++){
//            words[i] = words[i].replaceAll("[^0-9]", "");
//            sum += Integer.parseInt(words[i]);
//        }
//        System.out.println(sum);

        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(text);
        int sum = 0;
        while (m.find()) {
            sum = sum + Integer.parseInt(text.substring(m.start(), m.end()));
        }
        System.out.println(sum);

    }
}
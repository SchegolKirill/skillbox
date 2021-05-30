
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, Kolya - 2000, а Маша - 30000 рублей";
        String[] words = text.split(", ");
        int sum = 0;
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll("[^0-9]", "");
            sum += Integer.parseInt(words[i]);
        }
        System.out.println(sum);
    }
}
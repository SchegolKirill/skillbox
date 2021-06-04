package module5.HomeWork1.Rainbow;

public class Test {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colorWords = text.split(",?\\s+");
        String[] colorWords2 = new String[colorWords.length];
        int j = colorWords2.length - 1;
        for(int i = 0; i < colorWords.length; i++) {
            colorWords2[j] = colorWords[i];
            j--;
        }
        for(String word : colorWords2){
            System.out.println(word);
        }
    }
}

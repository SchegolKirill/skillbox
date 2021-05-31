public class Test {
    public static void main(String[] args) {
        String news = "It's an all-English Champions League final - but will it be Manchester City or Chelsea who will be crowned champions of Europe on Saturday?\n" +
                "\n" +
                "Premier League champions City are looking to win the prestigious competition for the first time.\n" +
                "\n" +
                "Chelsea, European champions in 2012, have beaten Pep Guardiola's side twice in the league and FA Cup in 2020-21.\n" +
                "\n" +
                "Up to 16,500 people will be allowed inside Porto's Estadio do Dragao ground to watch.\n" +
                "\n" +
                "Both sides have fully fit squads to choose from, although City midfielder Ilkay Gundogan looked like he took a minor knock in Friday's training session after a collision with Fernandinho.";

        String words1= news.replaceAll(",", "");
        String words2 = words1.replaceAll(".\n", " ");
        String words3 = words2.replaceAll(" - ", "");
        String words4 = words3.replaceAll("\n", "");
        String words5 = words4.replace('.', ' ');


        System.out.println(words5);
    }
}

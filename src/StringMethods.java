public class StringMethods {
    public static void main(String[] args) {
        String slogan = "It was like a fresh of breath air! :)";
        System.out.println(slogan.toLowerCase());
        System.out.println(slogan.toUpperCase());

        System.out.println("\n");

        String song = "Can you feel it? Can you feel the love! Nothing feels better than fellin' the love! Everybody knows that when push comes to shove! Nothing feels better than feelin' the love!";
        System.out.println(song);
        String changed = song.replace("love", "pie").replace("shove", "fly");
        System.out.println(changed);

        System.out.println("\n");

        String weather = "      The weather outside is sunny.      ";
        System.out.println(weather);
        String trimmed = weather.trim();
        System.out.println(trimmed);

        System.out.println("\n");

        String question = "Why are you reading this? ";
        System.out.println(question);
        int lastWord = question.lastIndexOf("this?");
        System.out.println(lastWord);

        System.out.println("\n");

        String shouting = "Come Back! ";
        System.out.println(shouting);
        String repeated = shouting.repeat(3);
        System.out.println(repeated);
    }
}

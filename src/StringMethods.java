public class StringMethods {
    public static void main(String[] args) {
        String slogan = "It was like a fresh of breath air! :)";
        System.out.println(slogan.toLowerCase());
        System.out.println(slogan.toUpperCase());

        System.out.println("\n");

        String original = "Can you feel it? Can you feel the love! Nothing feels better than fellin' the love! Everybody knows that when push comes to shove! Nothing feels better than feelin' the love!";
        System.out.println(original);
        String changed = original.replace("love", "pie").replace("shove", "fly");
        System.out.println(changed);
    }
}

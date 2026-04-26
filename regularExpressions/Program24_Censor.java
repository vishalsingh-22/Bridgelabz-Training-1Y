public class Program24_Censor {
    public static void main(String[] args) {
        String text = "This is damn stupid";
        System.out.println(text.replaceAll("\\b(damn|stupid)\\b", "****"));
    }
}
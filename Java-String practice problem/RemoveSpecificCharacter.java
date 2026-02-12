import java.util.*;

public class RemoveSpecificCharacter {
    static String removeChar(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch)
                result += str.charAt(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String s = sc.nextLine();
        System.out.println("Enter character to remove:");
        char ch = sc.next().charAt(0);
        System.out.println("Modified String: " + removeChar(s, ch));
    }
}

import java.util.*;

public class SubstringOccurrences {
    static int countSub(String str, String sub) {
        int count = 0;
        for (int i = 0; i <= str.length()-sub.length(); i++) {
            if (str.substring(i, i+sub.length()).equals(sub))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string:");
        String s = sc.nextLine();
        System.out.println("Enter substring:");
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countSub(s, sub));
    }
}

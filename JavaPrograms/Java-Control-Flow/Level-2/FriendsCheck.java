import java.util.Scanner;

class FriendsCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int aAge = input.nextInt();
        int bAge = input.nextInt();
        int cAge = input.nextInt();

        int aHt = input.nextInt();
        int bHt = input.nextInt();
        int cHt = input.nextInt();

        if (aAge < bAge && aAge < cAge)
            System.out.println("Amar is youngest");
        else if (bAge < aAge && bAge < cAge)
            System.out.println("Akbar is youngest");
        else
            System.out.println("Anthony is youngest");

        if (aHt > bHt && aHt > cHt)
            System.out.println("Amar is tallest");
        else if (bHt > aHt && bHt > cHt)
            System.out.println("Akbar is tallest");
        else
            System.out.println("Anthony is tallest");
    }
}

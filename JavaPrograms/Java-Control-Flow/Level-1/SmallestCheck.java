import java.util.Scanner;

class SmallestCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 < n2 && n1 < n3)
            System.out.println("Is the first number the smallest? Yes");
        else
            System.out.println("Is the first number the smallest? No");
    }
}

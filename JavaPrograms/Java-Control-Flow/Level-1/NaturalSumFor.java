import java.util.Scanner;

class NaturalSumFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            int formula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formula);
        }
    }
}

import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            System.out.println("Factorial is " + fact);
        }
    }
}

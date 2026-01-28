import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int fact = 1, i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial is " + fact);
        }
    }
}

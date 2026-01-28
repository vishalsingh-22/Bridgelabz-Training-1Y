import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double num;

        while (true) {
            num = input.nextDouble();
            if (num == 0)
                break;
            total += num;
        }

        System.out.println("Total sum is " + total);
    }
}

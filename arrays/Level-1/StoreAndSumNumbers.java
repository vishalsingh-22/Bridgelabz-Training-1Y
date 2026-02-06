import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        int index = 0;

        while (true) {
            double value = input.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            values[index] = value;
            index++;
        }

        double total = 0.0;
        for (int i = 0; i < index; i++) {
            total += values[i];
        }

        System.out.println(total);
    }
}

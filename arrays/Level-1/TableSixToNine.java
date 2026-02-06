import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] result = new int[4];

        int count = 0;
        for (int i = 6; i <= 9; i++) {
            result[count] = number * i;
            count++;
        }

        count = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[count]);
            count++;
        }
    }
}

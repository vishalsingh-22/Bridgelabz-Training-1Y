import java.util.*;

public class FibonacciGenerator {

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = sc.nextInt();
        printFibonacci(n);
    }
}

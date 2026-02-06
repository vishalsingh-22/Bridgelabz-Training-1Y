import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        int youngIndex = 0;
        int tallIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngIndex]) {
                youngIndex = i;
            }
            if (height[i] > height[tallIndex]) {
                tallIndex = i;
            }
        }

        System.out.println(names[youngIndex]);
        System.out.println(names[tallIndex]);
    }
}

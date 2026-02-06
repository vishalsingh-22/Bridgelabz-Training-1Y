import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int persons = input.nextInt();

        double[][] data = new double[persons][3];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            data[i][0] = input.nextDouble();
            data[i][1] = input.nextDouble();

            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            if (data[i][2] < 18.5) status[i] = "Underweight";
            else if (data[i][2] < 25) status[i] = "Normal";
            else if (data[i][2] < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
        }
    }
}

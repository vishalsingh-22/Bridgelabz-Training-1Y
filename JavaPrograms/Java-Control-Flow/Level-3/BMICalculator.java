import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();   // kg
        double heightCm = input.nextDouble(); // cm

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}

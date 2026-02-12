import java.util.*;

public class TemperatureConverter {

    static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = sc.nextInt();

        System.out.println("Enter temperature:");
        double temp = sc.nextDouble();

        if (choice == 1)
            System.out.println("Converted: " + toCelsius(temp));
        else
            System.out.println("Converted: " + toFahrenheit(temp));
    }
}

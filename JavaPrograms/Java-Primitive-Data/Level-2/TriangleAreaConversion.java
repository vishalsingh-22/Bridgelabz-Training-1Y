
import java.util.Scanner;
class TriangleAreaConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();

        double areaCm = 0.5 * baseCm * heightCm;
        double baseIn = baseCm / 2.54;
        double heightIn = heightCm / 2.54;
        double areaIn = 0.5 * baseIn * heightIn;

        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + areaCm);
    }
}

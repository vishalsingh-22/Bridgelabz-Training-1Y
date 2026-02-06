import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();

        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            marks[i][0] = input.nextInt();
            marks[i][1] = input.nextInt();
            marks[i][2] = input.nextInt();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        for (int i = 0; i < students; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }
    }
}

// Program to calculate BMI for a team of 10 people.
import java.util.Scanner;
public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        height /= 100; // Convert cm to meters
        return weight / (height * height);
    }
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        return "Obese";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] people = new double[10][3];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            people[i][0] = input.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            people[i][1] = input.nextDouble();
            people[i][2] = calculateBMI(people[i][0], people[i][1]);
        }
        System.out.println("Height | Weight | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.println(people[i][1] + "cm | " + people[i][0] + "kg | " + people[i][2] + " | " + getBMIStatus(people[i][2]));
        }
        input.close();
    }
}

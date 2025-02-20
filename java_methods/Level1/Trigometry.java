import java.util.Scanner;
// Write a program to calculate various trigonometric functions using Math class given an angle in degrees
// Hint => 
// Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)

public class Trigometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        
        double[] result = new double[3];

        // Convert angle to radians
        double radians = Math.toRadians(angle);

        result[0] = Math.sin(radians);
        result[1] = Math.cos(radians);
        result[2] = Math.tan(radians);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);




    }
}

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble() / 100; // Convert height to meters

        double bmi = weight / (height * height);

        
        if (bmi < 18.5) {  
            System.out.println("Underweight");
           
        } else if (bmi < 24.9) { 
            System.out.println("Normal weight");
           
        } else if (bmi < 29.9) {
            System.out.println("Overweight");
          
        } else
            System.out.println("Obese");
    

       
        sc.close();
    }
}

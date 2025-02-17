
// Create a program to find the bonus of employees based on their years of service.
// Hint => 
// Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
// Take salary and year of service in the year as input.
// Print the bonus amount.

import java.util.Scanner;

public class BonusEmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary and year of service in the year as input.
        double salary = sc.nextInt();
        int yearOfService = sc.nextInt();
        double bonus = 0;

        // Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
        if (yearOfService > 5) {
            bonus = salary * 0.05;
        }
        // Print the bonus amount.
        System.out.println("Bonus: " + bonus);
        sc.close();
    }
}

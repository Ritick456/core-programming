import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int employeeCount = 10;

        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];
        double[] bonusAmounts = new double[employeeCount];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();

            // Validate the inputs
            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < employeeCount; i++) {
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            double bonus = salaries[i] * bonusRate;
            double newSalary = salaries[i] + bonus;

            bonusAmounts[i] = bonus;
            newSalaries[i] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary;
        }

        System.out.println("Employee Bonuses and Salaries:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salaries[i] + ", Bonus = " + bonusAmounts[i] + ", New Salary = " + newSalaries[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}

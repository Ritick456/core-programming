// Program to check if students can vote based on age
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = input.nextInt();
        }
        for (int age : ages) {
            if (age < 0) System.out.println("Invalid age.");
            else if (age >= 18) System.out.println("The student with age " + age + " can vote.");
            else System.out.println("The student with age " + age + " cannot vote.");
        }
        input.close();
    }
}

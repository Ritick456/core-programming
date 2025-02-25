
// Program to compute sum of n natural numbers using recursion and formula.
import java.util.Scanner;

public class SumNaturalRecursion {
    // Recursive function to calculate sum of n natural numbers.
    public static int sumRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula to calculate sum of n natural numbers.
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula: " + formulaSum);
        System.out.println("Both methods give the same result: " + (recursiveSum == formulaSum));
        sc.close();
    }
}

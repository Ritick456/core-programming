// Program to find the sum of N natural numbers using a loop.
import java.util.Scanner;
public class SumNaturalNumbers {
    public static int calculateSum(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + ans);
        sc.close();
    }
}

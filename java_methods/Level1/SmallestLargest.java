// Program to find the smallest and largest of three numbers.
import java.util.Scanner;
public class SmallestLargest {
    public static int[] findSmallestAndLargest(int a, int b, int c) {
        return new int[]{Math.min(a, Math.min(b, c)), Math.max(a, Math.max(b, c))};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        int[] result = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
        input.close();
    }
}

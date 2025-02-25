// Program to check if a number is positive, negative, or zero and compare first and last elements
import java.util.Scanner;
public class NumberProperties {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) numbers[i] = input.nextInt();
        for (int num : numbers) {
            if (num > 0) System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
            else if (num < 0) System.out.println(num + " is Negative");
            else System.out.println(num + " is Zero");
        }
        if (numbers[0] == numbers[4]) System.out.println("First and last elements are equal.");
        else if (numbers[0] > numbers[4]) System.out.println("First element is greater.");
        else System.out.println("First element is smaller.");
        input.close();
    }
}

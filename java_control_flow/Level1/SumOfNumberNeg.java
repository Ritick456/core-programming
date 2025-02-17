// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
// Hint => 
// Use infinite while loop as in while (true)
// Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

import java.util.Scanner;

public class SumOfNumberNeg {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
          double total = 0.0;
          double number;
          
          // Use the while loop to check if the user entered is 0
          while (true) {
        
                number = sc.nextDouble();
                if (number <= 0) {
                 break;
                }
                total += number;
          }
          // The loop will continue till the user enters zero and outside the loop display the total value
          System.out.println(total);
    }
}

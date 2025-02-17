
// Create a program to print odd and even numbers between 1 to the number entered by the user.
// Hint => 
// Get an integer input from the user, assign to a variable number and check for Natural Number
// Using a for loop, iterate from 1 to the number
// In each iteration of the loop, print the number is odd or even number


public class OddAndEven {
    public static void main(String[] args) {
        // Get an integer input from the user
        
        int number = 10;
        for (int i = 1; i <= number; i++) {
            // In each iteration of the loop, print the number is odd or even number
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}

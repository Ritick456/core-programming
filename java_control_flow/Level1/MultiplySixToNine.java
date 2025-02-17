// Create a program to find the multiplication table of a number entered by the user from 6 to 9.
// Hint => 
// Take integer input and store it in the variable number
// Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 

import java.util.Scanner;

public class MultiplySixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
        sc.close(); // Close the scanner why?
        // The Scanner class is used to get user input, and it is a good practice to close the scanner after you are done with it. explain more?
        // Closing the scanner releases the resources that the scanner is using, and it is a good practice to close the scanner after you are done with it. This helps in freeing up the resources and avoiding memory leaks in the program.
    }
}

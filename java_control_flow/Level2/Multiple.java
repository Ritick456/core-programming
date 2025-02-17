

// Create a program to find all the multiple of a number taken as user input below 100.
// Hint => 
// Get input value for a variable named number.
// Run a for loop backwards: from i = 100 to i = 1.
// Inside the loop, check if i perfectly divides number.
// If true, print the number and continue the loop.

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 100; i > 0; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }else{
                continue;
            }  
        }
        sc.close();
    }
}

// Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
// Hint => 
// Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using while loop
// Compare the two results and print the result

import java.util.Scanner;

public class SumNaturalNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of " + n + " natural numbers is " + sum);
        int sumFormulae = n * (n + 1) / 2;
        System.out.println("The sum of " + n + " natural numbers using formulae is " + sumFormulae);
        if (sum == sumFormulae) {
            System.out.println("Both the results are correct");
        } else {
            System.out.println("The results are incorrect");
        }

    }
}

// Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
// Hint =>  Take the user input number and check whether it's a Natural number
// If it's a natural number Compute using formulae as well as compute using for loop
// Compare the two results and print the result

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumNaturalNumberFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
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

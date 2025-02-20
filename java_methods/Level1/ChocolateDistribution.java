
// Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
// Hint => 
// Get an integer value from user for the numberOfchocolates and numberOfChildren.
// Write the method to find the number of chocolates each child gets and number of remaining chocolates
// public static int[] findRemainderAndQuotient(int number, int divisor) 

import java.util.Scanner;

public class ChocolateDistribution {
    // find the number of chocolates each child gets and number of remaining
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2];
        result[0] = numberOfChocolates / numberOfChildren;
        result[1] = numberOfChocolates % numberOfChildren;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println(
                "Each child gets " + result[0] + " chocolates and " + result[1] + " chocolates are remaining.");

        sc.close();

    }
}

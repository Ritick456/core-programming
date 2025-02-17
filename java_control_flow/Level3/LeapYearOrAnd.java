
// Write a program that checks if a given year is a leap year or not. If the year is a leap year, print "Leap year", otherwise print "Not a leap year". A year is a leap year if it is divisible by 4, 100, and 400. Use the logical AND operator to check if the year is a leap year or not.

import java.util.Scanner;

public class LeapYearOrAnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

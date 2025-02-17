// Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
// y0 = y − (14 − m) / 12
// x = y0 + y0/4 − y0/100 + y0/400
// m0 = m + 12 × ((14 − m) / 12) − 2
// d0 = (d + x + 31m0 / 12) mod 7

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month");
        int month = sc.nextInt();

        // Check if the month is valid
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a valid month.");
            return;
        }

        System.out.println("Enter the Date");
        int date = sc.nextInt();

        // Check if the date is valid
        if (date < 1 || date > 31) {
            System.out.println("Invalid date. Please enter a valid date.");
            return;
        }

        System.out.println("Enter the year");
        int year = sc.nextInt();

        // Check if the year is valid
        if (year < 1) {
            System.out.println("Invalid year. Please enter a valid year.");
            return;
        }

        // y0 = y − (14 − m) / 12
        // x = y0 + y0/4 − y0/100 + y0/400
        // m0 = m + 12 × ((14 − m) / 12) − 2
        // d0 = (d + x + 31m0 / 12) mod 7  

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (date + x + 31 * m0 / 12) % 7;

        System.out.println("Day of the week: " + d0);
        
        sc.close();

    }
}

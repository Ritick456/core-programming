
// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;

public class FrequencyDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int temp = number;
        // Find the count of digits in the number
        
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        temp = number;

        // Find the digits in the number and save them in an array
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] frequency = new int[10];

        // Find the frequency of each digit in the number
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        
        System.out.println("Frequency of each digit in " + number + " is:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] != 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
        sc.close();
    }
}


// Write a Program to check if the given number is a prime number or not
// Hint => 
// A number that can be divided exactly only by itself and 1 are Prime Numbers,
// Prime Numbers checks are done for number greater than 1
// Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
// Use isPrime boolean variable to store the result


import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        for(int i=2; i<number; i++){
            if(number % i == 0){
                System.out.println(number + " is not a Prime Number.");
                sc.close();
                return;
            }
        }

        System.out.println(number + " is a Prime Number.");


        
        sc.close();
    }
}

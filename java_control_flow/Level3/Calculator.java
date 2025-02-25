import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Operator (+,-,*,/): ");
        char op = sc.next().charAt(0);

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2) );
                break;
            case '*':
                System.out.println("Result: " + (num1*num2));
                break;
            case '/':
                System.out.println("Result: " + (num1/num2));
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}

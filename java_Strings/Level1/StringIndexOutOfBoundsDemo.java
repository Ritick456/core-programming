// Program to demonstrate StringIndexOutOfBoundsException.
import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    public static void generateException(String str) {
        System.out.println(str.charAt(str.length()));
    }
    public static void handleException(String str) {
        try {
           generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        handleException(str);
        sc.close();
    }
}

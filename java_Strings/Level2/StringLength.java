// Program to find the length of a string without using length() method
import java.util.Scanner;
public class StringLength {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        int customLength = findLength(str);
        int builtInLength = str.length();
        System.out.println("Custom Method Length: " + customLength);
        System.out.println("Built-in Method Length: " + builtInLength);
        input.close();
    }
}

// Program to calculate maximum handshakes among N students.
import java.util.Scanner;
public class Handshakes {
    public static int calculateHandshakes(int students) {
        // combination = (n * (n - 1)) / 2 to calculate the maximum number of possible handshakes.
        return (students * (students - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);

        System.out.println("Maximum handshakes: " + handshakes);
        sc.close();
    }
}

// Program to calculate maximum handshakes among N students.
import java.util.Scanner;
public class Handshakes {
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = input.nextInt();
        System.out.println("Maximum handshakes: " + calculateHandshakes(students));
        input.close();
    }
}

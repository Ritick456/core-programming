import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter age and height of Amar: ");
        int age1 = input.nextInt();
        int height1 = input.nextInt();
        System.out.print("Enter age and height of Akbar: ");
        int age2 = input.nextInt();
        int height2 = input.nextInt();
        System.out.print("Enter age and height of Anthony: ");
        int age3 = input.nextInt();
        int height3 = input.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));
        System.out.println("Youngest friend is " + youngest);
        System.out.println("Tallest friend is " + tallest);
        input.close();
    }
}

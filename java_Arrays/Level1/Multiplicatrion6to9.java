import java.util.Scanner;

public class Multiplicatrion6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] table = new int[4];

        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int index = 0;

        for(int i=6; i<=9; i++){
            table[index++] = number * i;
        }

        for(int i=0; i<table.length; i++){
            int multiplier = i + 6;
            System.out.println(number + "*" + multiplier + "=" + table[i]);
        }
    }
}

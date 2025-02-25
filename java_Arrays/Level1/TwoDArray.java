// Program to create a 2D array, display elements and calculate sum
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int n = sc.nextInt();
        System.out.println("Enter the column");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter the elements of the 2D Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] ans = new int[n*m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[index++] = arr[i][j];
            }
            System.out.println();
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}

package Extra_String;

import java.util.Scanner;

public class Replac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        

        // Split string into words (handling multiple spaces)
        String[] strarr = str.split("\\s+");


        // Replace first occurrence of str1 with str2
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].equals(str1)) {  // Use equals() for string comparison
                strarr[i] = str2;
                break;
            }
        }

        // Print the modified string
        System.out.println(String.join(" ", strarr));

        sc.close(); // Close Scanner to prevent resource leak
    }
}

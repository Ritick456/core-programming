package Extra_String;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count =1;

        for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i) == ' '){
                count++;
            }

        }

        String[] strarr = str.split(" ");

        int maxi = Integer.MIN_VALUE; 
        int index= 0;

        for(int i=0; i<strarr.length; i++){
            int strlen = strarr[i].length();

            if(strlen > maxi){
                maxi = strlen;
                index = i;
            }

        }

        System.out.println(strarr[index]);


    }
}

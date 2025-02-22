package Extra_String;

import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);

        String str = sc.nextLine();

        int countvowels = 0;
        int countconsonants = 0;

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                countvowels++;
            }
            else{
                countconsonants++;
            }
        }

        System.out.println(countconsonants + " " + countvowels);
    }
}

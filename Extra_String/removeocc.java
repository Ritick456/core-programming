package Extra_String;

import java.util.Scanner;

public class removeocc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                continue;
            }
            else{
                ans.append(str.charAt(i));
            }
        }

        System.out.println(ans);
    }
}

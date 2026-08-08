package programfoldeer;

import java.util.Scanner;

public class revere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Name");
        String k = scan.nextLine();
        int len=k.length();
        for(int i= len-1;i>=0;i--){
        char c= k.charAt(i);
           System.out.print(k.charAt(i));
            scan.close();
        }
       


    }
}

package task;

import java.util.Scanner;

/**
 * nametowrite1stordertolastorder
 * 
 * input: Swetha
 *          012345--->062534
 * output: sawhet
 */
public class nametowrite1stordertolastorder {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Name");
        String name=s.next();
        int len =name.length();
      int dec=--len;
        for(int i=0;i<len/2+1;i++)
                   System.out.print(name.charAt(i)+""+name.charAt(dec--));

        s.close();

    }
}
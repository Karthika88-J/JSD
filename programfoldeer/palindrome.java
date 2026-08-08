package programfoldeer;

import java.util.Scanner;

/**
 * palindrome
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int n =scan.nextInt();
        int v=0,q,p=n;
        while (p!=0) {
            q=p%10;
            p=p/10;
            v=(v*10)+q;
            
            
        }
        if(n==v)
                System.out.println("It is a Palindrome   "+ n);
            else
                System.out.println("It is not a palindrome  "+ n);
            scan.close();
    }
    
    
}
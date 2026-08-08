package programfoldeer;

import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long n = scan.nextLong();
        long re,q=0;
        while (n!=0) {
           re=n%10;
           q=(q*10)+re;
           n=n/10;

        }
        System.out.println(q);
        scan.close();
    }
}

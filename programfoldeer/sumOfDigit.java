package programfoldeer;

import java.util.Scanner;

/**
 * sumOfDigit
 */
public class sumOfDigit {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a Number");
        long n=scan.nextLong();
        long sum=0,r;
        while(n!=0){
              r=n%10;
              n=n/10;
              sum+=r;
        }
        System.out.println(sum);
    }
}
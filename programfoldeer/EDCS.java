package programfoldeer;
/*enter a Value
1234567
*****display even number  246
*****display odd number   1357
count even number   3
count odd number   4
sum even number   12
sum odd number   16 */
import java.util.Scanner;

public class EDCS {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a Value");
        long n=scan.nextLong();
        long reminder;
        long sume=0,sumo=0;
        int counteven=0,countodd=0;
        long even=0,odd=0;
        long tempeven=1,tempodd=1;
        while(n!=0){
               reminder=n%10;
               n=n/10;
               if(reminder%2==0){
                
                sume=sume+reminder;
                // even=even*10+reminder;
                even=(reminder*tempeven)+even;
                tempeven=tempeven*10; 
               counteven=counteven+1;
                
               }
               else{
                sumo+=reminder;
                //odd=odd*10+reminder;
                odd=(reminder*tempodd)+odd;
                tempodd=tempodd*10;
               
               
                countodd=countodd+1;

               }



        }
System.out.println("display even number  " + even);
System.out.println("display odd number   " + odd);
System.out.println("count even number   " + counteven);
System.out.println("count odd number   " + countodd);
System.out.println("sum even number   " + sume);
System.out.println("sum odd number   " + sumo);
scan.close();
    }
}

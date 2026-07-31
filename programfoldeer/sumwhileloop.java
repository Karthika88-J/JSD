package programfoldeer;

import java.util.Scanner;

public class sumwhileloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a Value");
        long n=scan.nextLong();
        long q;
        long sume=0,sumo=0;
        int ce=0,co=0;
        long even=0,odd=0;
        while(n!=0){
               q=n%10;
               n=n/10;
               if(q%2==0){
                
                sume=sume+q;
                 even=q;
                 System.out.println("display even number" + even);
               
               ce=ce+1;
                
               }
               else{
                sumo+=q;
                odd=q;
                System.out.println("display odd number" + odd);
               
                co=co+1;

               }



        }
        System.out.println("display even number" + even);
System.out.println("display odd number" + odd);
System.out.println("count even number" + ce);
System.out.println("count odd number" + co);
System.out.println("sum even number" + sume);
System.out.println("sum odd number" + sumo);
    }
}

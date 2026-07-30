//package TaskProgram;

import java.util.Scanner;

/**
 * reverseName
 
public class reverseName {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a Name");
        
    }
}*/

public class reverseName {
    public static void main(String[] args) {
        int f;
        float  a=2;
        int b=-1;
        int c=3;
        int d=4;
        int e=5;

        f = ((++a != 0 && b++ != 0) || (c++ != 0 && ++d != 0) || e++ != 0) ? 1 : 0;

           System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // Printing the final sum
        System.out.print("Total Sum: ");
        System.out.println(a + b + c + d + e + f);
    }
}

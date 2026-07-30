package Task;


import java.util.Scanner;

/**
 * Taskof1
 * 
 * count alphabets,number,splcaracter
 * enter text
 *          karur.123.nishanth@gmail.com
 *output
    alpscount : 12
    numbers : 3
    special char:2
 */
public class Taskof1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a Email ID");
        String email = scan.next();
        int alpcount=0;
        int numcount=0;
        int specount=0;
       int  len=email.length();
        for(int i=0;i<len;i++){
            char c=email.charAt(i);
            if( c>='a' && c<='z'){
                alpcount++;
            }
            if(c>='0' && c<='9')
            {
                numcount++;
            }
            if(c=='.')
            {
                specount++;
            }
            if(c=='@')
                break;

        }
        System.out.println("alphabet count  " +alpcount );
                System.out.println("Number count" +numcount );

                        System.out.println("special count " +specount );


    }
}
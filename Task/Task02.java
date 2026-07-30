package Task;

import java.util.Scanner;

/*
task 
input

i              am       so     good
output
i am so good

*/
public class Task02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a Text");
        String text=s.nextLine();
        int len=text.length();
        String res="";
        for(int i=0;i<len-1;i++){
            char c1=text.charAt(i);
            char c2=text.charAt(i+1);
            if(c1==' ' && c2==' ')
                continue;
            else
                res=res+c1;
        }
        System.out.println(res+text.charAt(len-1));
        s.close();
           }
            
                                                        
        
    }


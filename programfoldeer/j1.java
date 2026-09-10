package programfoldeer;
import java.util.Scanner;

public class j1{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Name");
        String name=scan.nextLine();
        int len=name.length();
        System.out.println("Enter a Character");
        char c=scan.next().charAt(0);
        int sum=0;
        for(int i=0;i<=len-1;i++){
            if(name.charAt(i)==c){
                System.out.print(i+",");
                sum=sum+1;
            }
        }
                        System.out.println("\b ");
            if(sum==0){
               System.out.println("Not Found"); 
            }
     
    }
    
} 
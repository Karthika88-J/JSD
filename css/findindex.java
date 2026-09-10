import java.util.Scanner;

public class findindex {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Name");
        String name=scan.next();
        int len=name.length();
        System.out.println("Enter a Character");
        char c=scan.next().charAt(0);
        for(int i=0;i<len;i++){
            if(i==name.charAt(c)){
                System.out.println(i+",");
            }
        }
                        System.out.println("/b ");


    }
    
} 
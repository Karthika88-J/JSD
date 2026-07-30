import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Total Purchse Amount : ");
        int v1= scan.nextInt();
        String d="";
        float amt =0.0f;
        if(v1>=0 && v1<=6000)
{
                if(v1<1000)
                {
                    amt = 0;
                    d= "No Discount";
                }
                else if(v1>=1000 && v1 <=1999){
                       amt=v1*5/100;
                       d = "Discount Amount is 5%";

                }else if(v1>=2000 && v1 <=3999){
                       amt=v1*7/100;
                       d = "Discount Amount is 7%";

                }else {
                       amt=v1*8/100;
                       d = "Discount Amount is 8%";

                }


              }
        
        else {
             amt=v1*10/100;
             d = "Discount Amount is 10%";

        }
        System.out.println(d +amt);
     scan.close();  
    }
}

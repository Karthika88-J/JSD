import java.util.Scanner;

public class Codition {
  /*   public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter mark");
        int mark=scan.nextInt();
        if(mark>49){
            System.out.println("result:pass");
        }
        else{
            System.out.println("fail");
        }scan.close();
        }*/

        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("enter the marks");
            int m1=scan.nextInt();
            int m2=scan.nextInt();
            int m3=scan.nextInt();
            int m4=scan.nextInt();
            int m5=scan.nextInt();
            String res="";
            if(m1>34 && m2<34 && m3<34 && m4<34 &&m5<34){
                res="pass";

            }
            else {
                res="fail";
            }
            int tot=m1+m2+m3+m4+m5;
            float avg=tot/5.0f;
            String gra="";
            if(res=="pass"){
                if(avg>85)
                    gra="outstanding";
                else if(avg>=75)
                    gra="excellent";
                else if(avg>=65)
                    gra="average";
                else if(avg>=55)
                    gra="fair";
                else
                    gra="need improvement";
            }
            else
                gra="no grade && fail";
            System.out.println("total"+tot);
            System.out.println("percentage"+avg);
            System.out.println("Result"+res);
            System.out.println("Grade"+gra);
            scan.close();
        }
        
    
}

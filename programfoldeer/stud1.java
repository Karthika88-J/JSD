import java.util.Scanner;
public class stud1{
    int rno;
    String sname;
    float mark;
    Scanner scan=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter rno sname and mark:");
        rno=scan.nextInt();
        sname=scan.next();
        mark=scan.nextInt();
    }
    void dis()
    {
        System.out.println(rno+"   "+sname+"     "+mark);
    }
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter total no of student");
      int n=scan.nextInt();
      stud1 s[]=new stud1[n];
      for(int i=0;i<n;i++){
        s[i]=new stud1();
        s[i].getdata();
      }
      for(int i=0;i<n;i++){
        s[i]=new stud1();
        s[i].dis();
      }

    }
}
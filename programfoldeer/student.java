import java.util.Scanner;
public class student{
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
      student s[]=new student[n];
      for(int i=0;i<n;i++){eed
        s[i]=new student();
        s[i].getdata();
      }
      for(int i=0;i<n;i++){
       // s[i]=new stud1();
        s[i].dis();
      }
      System.out.println("--------------Fail Students List---------");
      for(int i=0;i<n;i++){
        if(s[i].mark<50)
            s[i].dis();
      }

    }
}
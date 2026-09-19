package databasework;
import java.sql.*;
import java.util.Scanner;

public class Pgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rno  :");
		int rno=scan.nextInt();
		
		
		
	
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver Accepted");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root", "12345");
		    System.out.println("Connection Successfully");
		   
		    //delete data
		    
		    Statement st=con.createStatement();
		   int res=st.executeUpdate("delete from student where student_id= "+rno);
		    if(res==1) {
		    	System.out.println("Successflully deleted");
		    }
		    else {
		    	System.out.println("not inserted");
		    }
		    
		    
		    st.close();con.close();
		}
		catch(Exception e) 
		{
			System.out.println("Error Reason : "+e.toString());
		}

	}

}
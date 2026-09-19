package databasework;
import java.sql.*;
import java.util.Scanner;

public class Pgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter rno sname mark :");
		int rno=scan.nextInt();
		String sname=scan.next();
		float mark= scan.nextFloat();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    System.out.println("Driver Accepted");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root", "12345");
		    System.out.println("Connection Successfully");
		   
		    //insert data
		    
		    Statement st=con.createStatement();
		   int res=st.executeUpdate("insert into student Value("+rno+", '"+sname+"' ,"+mark+")");
		    if(res==1) {
		    	System.out.println("Successflully inserted");
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
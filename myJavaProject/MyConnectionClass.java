package myJavaProject;
import java.sql.*;
public class MyConnectionClass {
	Connection con;
	Statement stmt;
	MyConnectionClass(){
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentmangementsystem","root","yellow9@rssb");
			stmt=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

//this class opens up a window showing all the records of the database
package myJavaProject;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
public class AllRecords extends JFrame{
	MyConnectionClass m;
	JTable tab;
	JScrollPane jsp;
	String rows[]= {"S. No.","Student Name","Student ID","Email ID","Aadhaar No.","Date","Month","Year","Temporary Address","Permanent Address","Total Attendence","Father's Name","Mother's Name","Year of Admission","Contact 1","Contact 2","Marks 1","Mark 2","Mark 3","Mark 4","Average","Grade"};
	String d[][];
	AllRecords()
	{
		super("STUDENT MANAGEMENT SYSTEM- All the Records of the Students");
		setSize(1550,800);
		setLocationRelativeTo(null);
		
		m=new MyConnectionClass();
		
		getData();
		tab=new JTable(d,rows);
		jsp=new JScrollPane(tab);
		add(jsp);
		setVisible(true);
		
	}
	void getData()
	{
		double d1;
		long l=0;
		d=new String[1000][23];
		String temp="";
		int i1,j=0,i=0, sno=1;
		try
		{
			ResultSet rs=m.stmt.executeQuery("SELECT* from student");
			while(rs.next())
			{
				temp+=sno;
					d[i][j++]=temp;
					temp="";
					d[i][j++]=rs.getString("stuName");
					d[i][j++]=rs.getString("studentID");
					d[i][j++]=rs.getString("emailID");
					l=rs.getLong("adhaarNo");
					temp+=l;
					d[i][j++]=temp;
					temp="";
					i1=rs.getInt("date");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					d[i][j++]=rs.getString("month");
					i1=rs.getInt("year");
					temp+=i1;
					i1=0;
					d[i][j++]=temp;
					temp="";
					d[i][j++]=rs.getString("temporaryAddress");
					d[i][j++]=rs.getString("permanentAddress");
					i1=rs.getInt("totalAttendance");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					d[i][j++]=rs.getString("fatherName");
					d[i][j++]=rs.getString("motherName");
					i1=rs.getInt("admYear");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					l=rs.getLong("contactNumber");
					temp+=l;
					d[i][j++]=temp;
					temp="";
					l=rs.getLong("contact2");
					temp+=l;
					d[i][j++]=temp;
					temp="";
					i1=rs.getInt("marks1");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					i1=rs.getInt("marks2");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					i1=rs.getInt("marks3");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					i1=rs.getInt("marks4");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					d1=rs.getDouble("avg");
					temp+=d1;
					d[i][j++]=temp;
					temp="";
					temp=rs.getString("grade");
					d[i][j++]=temp;
					temp="";
					j=0;
				i++;
				sno++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

package myJavaProject;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ShortAttendance extends JFrame {
	MyConnectionClass m;
	JTable tab;
	JScrollPane jsp;
	String rows[]= {"S. No.","Student Name","Student ID","Email ID","Total Attendence"};
	String d[][];
	ShortAttendance()
	{
		super("STUDENT MANAGEMENT SYSTEM- All Department Attendance(Students with Short Attendance)");
		setSize(new Dimension(750,800));
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
		d=new String[10000][5];
		String temp="";
		int i1,j=0,i=0, sno=1;
		try
		{
			ResultSet rs=m.stmt.executeQuery("SELECT* from student");
			while(rs.next())
			{
				i1=rs.getInt("totalAttendance");
				if(i1<=45)
				{
					temp+=sno;
					d[i][j++]=temp;
					temp="";
					d[i][j++]=rs.getString("stuName");
					d[i][j++]=rs.getString("studentID");
					d[i][j++]=rs.getString("emailID");
					i1=rs.getInt("totalAttendance");
					temp+=i1;
					d[i][j++]=temp;
					temp="";
					j=0;
				i++;
				sno++;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
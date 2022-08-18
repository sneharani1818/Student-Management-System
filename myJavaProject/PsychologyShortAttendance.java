package myJavaProject;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PsychologyShortAttendance extends JFrame {
	MyConnectionClass m;
	JTable tab;
	JScrollPane jsp;
	String rows[]= {"S. No.","Student Name","Student ID","Total Attendance"};
	String d[][];
	PsychologyShortAttendance()
	{
		super("STUDENT MANAGEMENT SYSTEM- Pshychology Attendance(Students with Short Attendance)");
		setSize(new Dimension(750,500));
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
		d=new String[1000][4];
		String temp="";
		int i1,j=0,i=0, sno=1;
		try
		{
			ResultSet rs=m.stmt.executeQuery("SELECT* from student");
			while(rs.next())
			{
				temp=rs.getString("department");
				i1=rs.getInt("totalAttendance");
				if(temp.equals("Psychology 110")&&i1<=45)
				{
					temp="";
				temp+=sno;
					d[i][j++]=temp;
					temp="";
					d[i][j++]=rs.getString("stuName");
					d[i][j++]=rs.getString("studentID");
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

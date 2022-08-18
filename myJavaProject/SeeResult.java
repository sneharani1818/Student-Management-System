package myJavaProject;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
public class SeeResult extends JFrame
{
	String id,password;
	MyConnectionClass m;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27;
	SeeResult(String id,String password)
	{
		super("STUDENT MANAGEMENT SYSTEM- See Result");
		setSize(new Dimension(800,650));
		setLocationRelativeTo(null);//to locate the window at the center
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		this.id=id;
		this.password=password;
		m=new MyConnectionClass();
		
		l=new JLabel("------------------------------------------------------------------------------------------------RESULT-------------------------------------------------------------------------------------------------");
		l.setBounds(0,0,850,40);
		l1=new JLabel("Student ID");
		l1.setBounds(25,50,150,35);
		l2=new JLabel("");//student id
		l2.setBounds(150,50,150,35);
		
		l3=new JLabel("Name");
		l3.setBounds(25,75,150,35);
		l4=new JLabel("");//name
		l4.setBounds(150,75,150,35);
		
		l5=new JLabel("Father's Name");
		l5.setBounds(25, 100,150, 35);
		l6=new JLabel("");//father's name
		l6.setBounds(150,100,150,35);
		
		l7=new JLabel("Mother's Name");
		l7.setBounds(25,125,150,35);
		l8=new JLabel("");//mother's name
		l8.setBounds(150,125,150,35);
		
		l9=new JLabel("Course Name");
		l9.setBounds(25,150,150,35);
		l10=new JLabel("");//course name
		l10.setBounds(150,150,150,35);
		
		l11=new JLabel("Year");
		l11.setBounds(25,175,150,35);
		l12=new JLabel("");//year of study
		l12.setBounds(150,175,150,35);
		
		l13=new JLabel("Sr No.                        SUBJECT                        MARKS");
		l13.setBounds(45,220,750,35);
		l14=new JLabel("1.                                Subject 1");
		l14.setBounds(45,240,250,35);
		l15=new JLabel("2.                                Subject 2");
		l15.setBounds(45,260,250,35);
		l16=new JLabel("3.                                Subject 3");
		l16.setBounds(45,280,250,35);
		l17=new JLabel("4.                                Subject 4");
		l17.setBounds(45,300,250,35);
		l18=new JLabel("");//marks 1
		l18.setBounds(300,240,150,35);
		l19=new JLabel("");//marks 2
		l19.setBounds(300,260,150,35);
		l20=new JLabel("");//marks 3
		l20.setBounds(300,280,150,35);
		l21=new JLabel("");//marks 4
		l21.setBounds(300,300,150,35);
		l22=new JLabel("TOTAL MARKS		:");
		l22.setBounds(100,400,150,35);
		l23=new JLabel("");//total marks
		l23.setBounds(250,400,150,35);
		l24=new JLabel("AVG. MARKS		:");
		l24.setBounds(100,430,150,35);
		l25=new JLabel("");//average marks
		l25.setBounds(250,430,150,35);
		l26=new JLabel("GRADE			:");
		l26.setBounds(100,460,150,35);
		l27=new JLabel("");//grade
		l27.setBounds(250,460,150,35);
		
		generateResult();
		
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
		add(l11);
		add(l12);
		add(l13);
		add(l14);
		add(l15);
		add(l16);
		add(l17);
		add(l18);
		add(l19);
		add(l20);
		add(l21);
		add(l22);
		add(l23);
		add(l24);
		add(l25);
		add(l26);
		add(l27);
		
		setVisible(true);
	}
	public void generateResult()
	{
		int temp;
		int total=0;
		double avg=0;
		long l;
		String str=": ";
		try
		{
			ResultSet rs=m.stmt.executeQuery("SELECT* from student");
			while(rs.next())
			{
				if((id.equals(rs.getString(3)))||id.equals(rs.getString(2))&&password.equals(rs.getString(4)))
				{
					l=rs.getLong("studentID");
					str+=l;
					l2.setText(str);
					str=": ";
					str+=rs.getString("stuName");
					l4.setText(str);
					str=": ";
					str+=rs.getString("fatherName");
					l6.setText(str);
					str=": ";
					str+=rs.getString("motherName");
					l8.setText(str);
					str=": ";
					str+=rs.getString("department");
					l10.setText(str);
					str=": ";
					temp=rs.getInt("yearOfStudy");
					str+=temp;
					l12.setText(str);
					str="";
					temp=rs.getInt("marks1");
					total+=temp;
					insertMarks1(temp);
					str+=temp;
					l18.setText(str);
					str="";
					temp=rs.getInt("marks2");
					insertMarks2(temp);
					total+=temp;
					str+=temp;
					l19.setText(str);
					str="";
					temp=rs.getInt("marks3");
					insertMarks2(temp);
					total+=temp;
					str+=temp;
					l20.setText(str);
					str="";
					temp=rs.getInt("marks4");
					insertMarks4(temp);
					total+=temp;
					str+=temp;
					l21.setText(str);
					str="";
					str+=total;
					l23.setText(str);
					str="";
					avg=total/4.0;
					insertAvg(avg);
					str+=avg;
					l25.setText(str);
					if(avg>=95)
					{
						str="O";
						l27.setText(str);
					}
					else if(avg>=90)
					{
						str="A+";
						l27.setText(str);
					}
					else if(avg>=80)
					{
						str="A";
						l27.setText(str);
					}
					else if(avg>=70)
					{
						str="B";
						l27.setText(str);
					}
					else if(avg>=60)
					{
						str="C";
						l27.setText(str);
					}
					else if(avg>=50)
					{
						str="D";
						l27.setText(str);
					}
					else if(avg>=40)
					{
						str="E";
						l27.setText(str);
					}
					else
					{
						str="F";
						l27.setText(str);
					}
					insertGrade(str);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertMarks1(int marks)
	{
		String sql="";
		try
		{
			sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=m.con.prepareStatement(sql);
			ps.setInt(19,marks);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertMarks2(int marks)
	{
		String sql="";
		try
		{
			sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=m.con.prepareStatement(sql);
			ps.setInt(20,marks);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertMarks3(int marks)
	{
		String sql="";
		try
		{
			sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=m.con.prepareStatement(sql);
			ps.setInt(21,marks);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertMarks4(int marks)
	{
		String sql="";
		try
		{
			sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=m.con.prepareStatement(sql);
			ps.setInt(22,marks);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertAvg(double a)
	{
		String sql="";
		try
		{
			sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=m.con.prepareStatement(sql);
			ps.setDouble(23, a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertGrade(String g)
	{
		String sql="";
		try
		{
			sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=m.con.prepareStatement(sql);
			ps.setString(24,g);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

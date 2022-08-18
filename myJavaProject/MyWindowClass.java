package myJavaProject;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
public class MyWindowClass extends JFrame implements ActionListener{
	
	//data members
	MyConnectionClass m;
	String email,password;
	JLabel l,l1,l2,l3, l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,id;
	JTextField f1,f2,f3,f4,f5,f6,f9,f10,f11, f7,f8;
	JButton b1,b2,b3,b4;
	JComboBox<String> jcb1,jcb2,jcb3,jcb4,jcb5;
	String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String month[]= {"January","Februray","March","April","May","June","July","August","September","October","November","Decemeber"};
	String year[]= {"2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994"};
	String sub[]= {"English 101","Computer Science 102","Mathematics 103","Physics 104","Chemistry 105","Electronics 106","FoodTech 107","Microbiology 108","BioMedical Science 109","Psychology 110"};
	String yrOfStudy[]= {"1","2","3"};
	
	MyWindowClass()
	{
		super("Student Management System- Register a NEW Student/ Update an Existing Record");
		setSize(900,600);
		setLocationRelativeTo(null);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		//creating objects of connection class
		m=new MyConnectionClass();
		
		//adding labels and their respective text field or choices or check boxes
		l=new JLabel("");
		l.setBounds(270, 270, 350, 30);
		
		l1=new JLabel("Adhaar Number:");
		l1.setBounds(20, 20, 100, 25);
		f1=new JTextField(15);
		f1.setBounds(125, 20, 250, 25);
		
		l13=new JLabel("Year of Admission");
		l13.setBounds(500,20,150,25);
		f9=new JTextField(15);
		f9.setBounds(620,20,210,25);
		
		l2=new JLabel("Name:");
		l2.setBounds(20, 50, 100, 25);
		f2=new JTextField(30);
		f2.setBounds(125, 50, 250, 25);
		
		l4=new JLabel("D.O.B.");
		l4.setBounds(500,50,100,25);
		jcb1=new JComboBox<String>(date);
		jcb1.setBounds(600, 50, 50, 25);
		jcb2=new JComboBox<String>(month);
		jcb2.setBounds(665, 50, 80, 25);
		jcb3=new JComboBox<String>(year);
		jcb3.setBounds(760, 50, 70, 25);
		
		l5=new JLabel("Email ID:");
		l5.setBounds(20, 80, 100, 25);;
		f5=new JTextField(30);
		f5.setBounds(125, 80, 250, 25);
		
		l6=new JLabel("Create Password:");
		l6.setBounds(500,80,100,25);
		f6=new JTextField(30);
		f6.setBounds(600,80,250,25);
		
		l7=new JLabel("Sub/Dept:");
		l7.setBounds(20, 110, 100, 25);
		jcb4=new JComboBox<String>(sub);
		jcb4.setBounds(125,110,150,25);
		
		l8=new JLabel("Year of Study:");
		l8.setBounds(500, 110, 100, 25);
		jcb5=new JComboBox<String>(yrOfStudy);
		jcb5.setBounds(600,110,50,25);
		
		l9=new JLabel("Temporary address:");
		l9.setBounds(20,170,150,25);
		f7=new JTextField(250);
		f7.setBounds(160,170,215,50);
		
		l12=new JLabel("Permanent address:");
		l12.setBounds(500,170,150,25);
		f8=new JTextField();
		f8.setBounds(630,170,215,50);
		
		
		l10=new JLabel("Father's name:");
		l10.setBounds(500,140,100,25);
		f3=new JTextField();
		f3.setBounds(600,140,250,25);
		//f3.setText("father's name");
		
		l11=new JLabel("Mother's name:");
		l11.setBounds(20,140,100,25);
		f4=new JTextField();
		f4.setBounds(125,140,250,25);
		//f4.setText("mother's name");
		
		l14=new JLabel("Contact Number1:");
		l14.setBounds(20,230,150,25);
		f10=new JTextField(10);
		f10.setBounds(160,230,215,25);
		
		
		l15=new JLabel("Contact Number2:");
		l15.setBounds(500,230,150,25);
		f11=new JTextField(10);
		f11.setBounds(630,230,215,25);
		
		id=new JLabel("");
		id.setBounds(270,280,500,50);
				
		//creating buttons
		b1=new JButton("SUBMIT");
		b1.setBounds(200,340, 450,30);
		b2=new JButton("CLEAR ALL");
		b2.setBounds(200, 380, 450, 30);
		b3=new JButton("CLOSE");
		b3.setBounds(200, 460, 450, 30);
		b4=new JButton("UPDATE RECORD");
		b4.setBounds(200,420,450,30);
		
		//registering the listeners
		f1.addActionListener(this);
		f2.addActionListener(this);
		b1.addActionListener(this);
		jcb1.addActionListener(this);
		jcb2.addActionListener(this);
		jcb3.addActionListener(this);
		f5.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		jcb4.addActionListener(this);
		jcb5.addActionListener(this);
		f3.addActionListener(this);
		f4.addActionListener(this);
		f6.addActionListener(this);
		f7.addActionListener(this);
		f8.addActionListener(this);
		f9.addActionListener(this);
		f10.addActionListener(this);
		f11.addActionListener(this);
		
		//adding the elements to the window
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(b1);
		add(l4);
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(l5);
		add(f5);
		add(l6);
		add(f6);
		add(b2);
		add(b3);
		add(l);
		add(l7);
		add(l8);
		add(jcb4);
		add(jcb5);
		add(l9);
		add(l10);
		add(l11);
		add(f3);
		add(f4);
		add(f7);
		add(l12);
		add(f8);
		add(b4);
		add(l13);
		add(f9);
		add(l14);
		add(l15);
		add(f10);
		add(f11);
		add(id);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		long var=0;
		int x=0;
		String str="";
		String sql="";
		if(ae.getSource()==b1)
		{
			try
			{
				sql="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement ps=m.con.prepareStatement(sql);
				ps.setString(1, f2.getText());//name
				str=getID();
				id.setText("YOUR STUDENT ID IS "+str+". PLEASE REMEMBER IT.");//student id
				ps.setString(2, str);//student id
				ps.setString(3, f5.getText());//email id
				ps.setString(4,f6.getText());//password
				var=Long.parseLong(f1.getText());
				ps.setLong(5, var);//aadhar number
				str=(String)jcb1.getSelectedItem();
				ps.setInt(6, Integer.parseInt(str));//date of birth
				str=(String)jcb2.getSelectedItem();
				ps.setString(7, str);//month of birth
				str=(String)jcb3.getSelectedItem();
				ps.setInt(8, Integer.parseInt(str));//year of birth
				str=(String)jcb4.getSelectedItem();
				ps.setString(9, str);//department
				str=(String)jcb5.getSelectedItem();
				ps.setInt(10, Integer.parseInt(str));//year of study (1/2/3)
				ps.setString(11, f7.getText());//temporary address
				ps.setString(12, f8.getText());//permanent address
				ps.setInt(13, 0);//total attendance
				str=f3.getText();
				ps.setString(14, str);//father's name
				str=f4.getText();
				ps.setString(15, str);//mother's name
				x=Integer.parseInt(f9.getText());
				ps.setInt(16, x);//year of admission
				var=Long.parseLong(f10.getText());
				ps.setLong(17, var);//contact 1
				var=Long.parseLong(f11.getText());
				ps.setLong(18, var);//contact2
				ps.setInt(19, 0);//marks1
				ps.setInt(20, 0);//marks2
				ps.setInt(21, 0);//marks3
				ps.setInt(22, 0);//marks4
				ps.setDouble(23, 0.0);//average marks
				ps.setString(24, "F");//grade
				
				int i=ps.executeUpdate();
				if(i>0)
					l.setText("RECORD HAS BEEN ADDED SUCCESSFULLY");
				else
					l.setText("Error in adding new record");
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(ae.getSource()==b2)
		{
			f1.setText("");
			f2.setText("");
			f3.setText("");;
			f4.setText("");;
			f5.setText("");
			f6.setText("");
			f7.setText("");;
			f8.setText("");;
			f9.setText("");
			f10.setText("");;
			f11.setText("");
			l.setText("");
			jcb1.setSelectedIndex(0);
			jcb2.setSelectedIndex(0);
			jcb3.setSelectedIndex(0);
			jcb4.setSelectedIndex(0);
			jcb5.setSelectedIndex(0);
			id.setText("");
		}
		else if(ae.getSource()==b3)
		{
			this.setVisible(false);
		}
		else if(ae.getSource()==b4)
		{
			int temp=0,i;
			str="";
			sql="";
			PreparedStatement ps=null;
			try
			{
				ResultSet rs=m.stmt.executeQuery("SELECT* from student");
				while(rs.next())
				{
					if(email.equals(rs.getString(2))&&password.equals(rs.getString(4)))
					{
						//query for adhaar number
						sql="UPDATE student SET adhaarNo=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						var=Long.parseLong(f1.getText());
						ps.setString(2, email);
						ps.setLong(1, var);//adhaar number
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("ADHAAR UPDATED");
						else
							System.out.println("aadhaar not updated");*/
						
						//query for student name
						sql="UPDATE student SET stuName=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						str=f2.getText();
						ps.setString(1, str);
						ps.setString(2, email);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("Name updated");
						else
							System.out.println("Name not updated");*/
					

						//query for email ID
						sql="UPDATE student SET emailID=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f5.getText();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("email updated");
						else
							System.out.println("Email not updated");*/
						
						//email=str;
						
						//query for password
						sql="UPDATE student SET password=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f6.getText();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("password updated");
						else 
							System.out.println("Password not updated");*/
						
						//query for date of birth
						sql="UPDATE student SET date=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=(String)jcb1.getSelectedItem();
						temp=Integer.parseInt(str);
						ps.setInt(1, temp);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("date of birth updated");
						else
							System.out.println("Date of birth not updated");*/
						
						//query for month of birth
						sql="UPDATE student SET month=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=(String)jcb2.getSelectedItem();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("month of birth updated");
						else
							System.out.println("Month of birth not updated");*/

						
						//query for year of birth
						sql="UPDATE student SET year=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=(String)jcb3.getSelectedItem();
						temp=Integer.parseInt(str);
						ps.setInt(1, temp);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("year of birth updated");
						else
							System.out.println("Year of birth not updated");*/
						
						
						//query for department
						sql="UPDATE student SET department=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=(String)jcb4.getSelectedItem();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("department updated");
						else
							System.out.println("Department not updated");*/
						
						//query for year of study
						sql="UPDATE student SET yearOfStudy=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=(String)jcb5.getSelectedItem();
						temp=Integer.parseInt(str);
						ps.setInt(1, temp);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("Year of study updated");
						else
							System.out.println("year of study not updated");*/
						
						//query for temporary address
						sql="UPDATE student SET temporaryAddress=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f7.getText();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("temporary address updated");
						else
							System.out.println("Temp address not updated");*/
						
						//query for permanent address
						sql="UPDATE student SET permanentAddress=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f8.getText();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("permanent address updated");
						else
							System.out.println("permanent address not updated");*/
						
						//query for father's name
						sql="UPDATE student SET fatherName=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f3.getText();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("father's name updated");
						else
							System.out.println("Father name not updated");*/
						
						//query for mother's name
						sql="UPDATE student SET motherName=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f4.getText();
						ps.setString(1, str);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("mother's name updated");
						else System.out.println("mother name not updated");*/
						
						//query for admission year
						sql="UPDATE student SET admYear=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f9.getText();
						temp=Integer.parseInt(str);
						ps.setInt(1, temp);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("admission year updated");
						else
							System.out.println("admission year not");*/
						
						//query for contact 1
						sql="UPDATE student SET contactNumber=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f10.getText();
						var=Long.parseLong(str);
						ps.setLong(1, var);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("contact 1 updated");
						else
							System.out.println("Contact 1 not");*/
						
						//query for contact 2
						sql="UPDATE student SET contact2=? WHERE studentID=?";
						ps=m.con.prepareStatement(sql);
						ps.setString(2, email);
						str=f11.getText();
						var=Long.parseLong(str);
						ps.setLong(1, var);
						i=ps.executeUpdate();
						/*if(i>0)
							System.out.println("contact 2 updated");
						else
							System.out.println("Contact 2 not");*/
						
						l.setText("RECORD HAS BEEN UPDATED SUCCESSFULLY");
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
	public String getID()//student ID =year of admission+ department code(3 digit)+year of study+ 2 digit class roll no.
	{
		String s1=(String)jcb4.getSelectedItem();
		s1=s1.substring(s1.length()-3);
		String s="";
		s=f9.getText()+s1;
		s1=(String)jcb5.getSelectedItem();
		s=s+s1;
		int r=returnclassrollno();
		if(r<10)
			s=s+"0"+r;
		else
			s=s+r;
		System.out.println(s);
		return s;
	}
	public int returnclassrollno()
	{
		String str;
		int d1=1,d2=1,d3=1,d4=1,d5=1,d6=1,d7=1,d8=1,d9=1,d10=1;
		try
		{
			ResultSet rs=m.stmt.executeQuery("SELECT* from student");
			while(rs.next())
			{
				str=rs.getString("department");
				if(str.equals("English 101"))
					d1++;
				else if(str.equals("Computer Science 102"))
					d2++;
				else if(str.equals("Mathematics 103"))
					d3++;
				else if(str.equals("Physics 104"))
					d4++;
				else if(str.equals("Chemistry 105"))
					d5++;
				else if(str.equals("Electrnics 106"))
					d6++;
				else if(str.equals("FoodTech 107"))
					d7++;
				else if(str.equals("Microbiology 108"))
					d8++;
				else if(str.equals("BioMedical Science 109"))
					d9++;
				else if(str.equals("Psychology 110"))
					d10++;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		str=(String)jcb4.getSelectedItem();
		if(str.equals("English 101"))
			return ++d1;
		else if(str.equals("Computer Science 102"))
			return ++d2;
		else if(str.equals("Mathematics 103"))
			return ++d3;
		else if(str.equals("Physics 104"))
			return ++d4;
		else if(str.equals("Chemistry 105"))
			return ++d5;
		else if(str.equals("Electrnics 106"))
			return ++d6;
		else if(str.equals("FoodTech 107"))
			return ++d7;
		else if(str.equals("Microbiology 108"))
			return ++d8;
		else if(str.equals("BioMedical Science 109"))
			return ++d9;
		else if(str.equals("Psychology 110"))
			return ++d10;
		return 0;
	}

	public void showRecord(String email, String password)
	{
		int temp=0;
		long var=0;
		String str="";
		try
		{
			ResultSet rs=m.stmt.executeQuery("SELECT* from student");
			while(rs.next())
			{
				if((email.equals(rs.getString(3)))||email.equals(rs.getString(2))&&password.equals(rs.getString(4)))
				{
					var=rs.getLong("adhaarNo");
					str+=var;
					f1.setText(str);
					temp=0;
					f2.setText(rs.getString("stuName"));
					f5.setText(rs.getString("emailID"));
					f6.setText(password);
					str="";
					f4.setText(rs.getString("motherName"));
					f3.setText(rs.getString("fatherName"));
					f7.setText(rs.getString("temporaryAddress"));
					f8.setText(rs.getString("permanentAddress"));
					temp=rs.getInt("admYear");
					str+=temp;
					f9.setText(str);
					str="";
					temp=rs.getInt("date");
					jcb1.setSelectedIndex(temp-1);
					str=rs.getString("month");
					for(int i=0;i<12;i++)
					{
						if(str.equals(month[i]))
						{
							temp=i;
							break;
						}
					}
					jcb2.setSelectedIndex(temp);
					str="";
					temp=rs.getInt("year");
					str+=temp;
					for(int i=0;i<13;i++)
					{
						if(str.equals(year[i]))
						{
							temp=i;
							break;
						}
					}
					jcb3.setSelectedIndex(temp);
					str=rs.getString("department");
					for(int i=0;i<10;i++)
					{
						if(str.equals(sub[i]))
						{
							temp=i;
							break;
						}
					}
					jcb4.setSelectedIndex(temp);
					temp=rs.getInt("yearOfStudy");
					jcb5.setSelectedIndex(temp-1);
					var=rs.getLong("contactNumber");
					str="";
					str+=var;
					f10.setText(str);
					str="";
					var=rs.getLong("contact2");
					str+=var;
					f11.setText(str);
					id.setText("YOUR STUDENT ID IS "+rs.getString("studentId"));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	public void getEmail(String e)
	{
		 email=e;
	}
	public void getPassword(String p)
	{
		password=p;
	}
}
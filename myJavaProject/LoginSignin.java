package myJavaProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class LoginSignin extends JFrame implements ActionListener {
	MyWindowClass win;
	SelectDeptForAttendance a;
	RecPassword allrec;
	MyConnectionClass m;
	String email;
	String password;
	JLabel l1, l2, l3, background;
	JButton b,b1,b2,b3,b4;
	JButton b5,b6;//to see result and fees status
	JTextField f1,f2;
	SeeResult r;
	LoginSignin()
	{
		super("STUDENT MANAGEMENT SYSTEM- LOGIN/SIGN IN PAGE");
		setSize(new Dimension(600,550));
		setLocationRelativeTo(null);//to locate the window at the center
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		m=new MyConnectionClass();
		//a=new Attendance();
		
		l1=new JLabel("Student ID:");
		l1.setBounds(133, 100, 100, 30);
		f1=new JTextField(20);
		f1.setBounds(200, 100, 200, 30);
		
		l2=new JLabel("Password:");
		l2.setBounds(140, 130, 100, 30);
		f2=new JTextField(20);
		f2.setBounds(200, 130, 200, 30);
		
		l3=new JLabel("");
		l3.setBounds(150,175,300,30);
		
		b=new JButton("LOGIN/UPDATE RECORD");
		b.setBounds(150, 200, 280, 30);
		b1=new JButton("REGISTER A NEW STUDENT");
		b1.setBounds(300, 25, 200, 25);
		b2=new JButton("DELETE RECORD");
		b2.setBounds(150,240,280,30);
		b3=new JButton("ALL RECORDS");
		b3.setBounds(150,360,280,30);
		b4=new JButton("ATTENDANCE");
		b4.setBounds(150,400,280,30);
		b5=new JButton("RESULT");
		b5.setBounds(150,280,280,30);
		b6=new JButton("SHORTAGE ATTENDANCE LIST");
		b6.setBounds(150,320,280,30);
		
		
		b.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(b);
		add(b1);
		add(l3);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		boolean i;
		String f1text=f1.getText();
		String f2text=f2.getText();
		String s="";
		String str=ae.getActionCommand();
		if(str.equals(b.getActionCommand()))
		{
			email=f1.getText();
			password=f2.getText();
			try
			{
				ResultSet rs=m.stmt.executeQuery("SELECT* from student");
				while(rs.next())
				{
					if((email.equals(rs.getString("emailID"))||email.equals(rs.getString("studentID")))&&password.equals(rs.getString("password")))
					{
						//l3.setText("LOGGED IN SUCCESSFULLY");
						SwingUtilities.invokeLater(
								new Runnable()
								{
									public void run()
									{
										win=new MyWindowClass();
										win.showRecord(email, password);
										//win.updateRecord(email, password);
										win.getEmail(email);
										win.getPassword(password);
									}
								});
						l3.setText("LOGGED IN SUCCESSFULLY");
						f1.setText("");
						f2.setText("");
						break;
					}
					else if(!(email.equals(rs.getString("emailID"))&&password.equals(rs.getString("password"))))
						l3.setText("CHECK YOUR PASSWORD OR EMAIL ID");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(str.equals(b1.getActionCommand()))
		{
			SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{
							win=new MyWindowClass();
						}
					});
		}
		else if(str.equals(b2.getActionCommand()))
			{
				s=f1.getText();
				try
				{
					String sql="DELETE FROM student WHERE studentID=?";
					PreparedStatement ps=m.con.prepareStatement(sql);
					ps.setString(1,s);
					i=ps.execute();
					if(i==false)
						l3.setText("RECORD HAS BEEN DELETED SUCCESSFULLY");
					else
						l3.setText("Error in deleting record");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		else if(str.equals(b3.getActionCommand()))
		{
			SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{
							allrec=new RecPassword();
						}
					});
		}
		else if(str.equals(b4.getActionCommand()))
		{
			SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{
							a=new SelectDeptForAttendance("");
						}
					});
		}
		else if(ae.getSource()==b5)
		{
			SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{
							r=new SeeResult(f1text,f2text);
						}
					});
		}
		else if(ae.getSource()==b6)
		{
			SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{
							a=new SelectDeptForAttendance("short");
						}
					}
					);
		}
		f1.setText("");
		f2.setText("");
	}
}

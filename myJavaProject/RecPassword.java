package myJavaProject;
//this class asks for database password to see all the records
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class RecPassword extends JFrame implements ActionListener{
	MyConnectionClass m;
	AllRecords allrec;
	JButton b;
	JLabel l1,l2,l3;
	JTextField f1,f2;
	RecPassword()
	{
		super("Login Page to see the Records");
		setLayout(null);
		setSize(450,300);
		setLocationRelativeTo(null);
		
		m=new MyConnectionClass();
		b=new JButton("SEE THE RECORDS");
		b.setBounds(105,175,200,30);
		l1=new JLabel("Username:");
		l1.setBounds(75,25,100,30);
		l2=new JLabel("Password");
		l2.setBounds(75,75,100,30);
		l3=new JLabel("");
		l3.setBounds(150,100,250,30);
		f1=new JTextField(150);
		f1.setBounds(145,25,150,30);
		f2=new JTextField(150);
		f2.setBounds(145,75,150,30);
		
		b.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);
		
		add(l1);
		add(l2);
		add(l3);
		add(f1);
		add(f2);
		add(b);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("SEE THE RECORDS"))
		{
			if(f1.getText().equals("root")&&f2.getText().equals("yellow9@rssb"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
						{
							public void run()
							{
								allrec=new AllRecords();
							}
						});
				l3.setText("");
				this.setVisible(false);
			}
			else
				l3.setText("Invalid username/password");
		}
	}
}

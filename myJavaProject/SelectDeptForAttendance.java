package myJavaProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SelectDeptForAttendance extends JFrame implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10, b;
	String t="";
	SelectDeptForAttendance(String t)
	{
		super("STUDENT MANAGEMNET SYSTEM-Select Department to see Attendance");
		setSize(500,650);
		setLocationRelativeTo(null);
		setLayout(null);
		
		this.t=t;
		
		b=new JButton("ALL DEPARTMENTS");
		b.setBounds(30,30,440,45);
		b.addActionListener(this);
		//b.setFont(b.getFont().deriveFont(200));
		
		b1=new JButton("English");
		b1.setBounds(30,100,440,35);
		b1.addActionListener(this);
		
		b2=new JButton("Computer Science");
		b2.setBounds(30,140,440,35);
		b2.addActionListener(this);
		
		b3=new JButton("Mathematics");
		b3.setBounds(30,180,440,35);
		b3.addActionListener(this);
		
		b4=new JButton("Physics");
		b4.setBounds(30,220,440,35);
		b4.addActionListener(this);
		
		b5=new JButton("Chemistry");
		b5.setBounds(30,260,440,35);
		b5.addActionListener(this);
		
		b6=new JButton("Electronics");
		b6.setBounds(30,300,440,35);
		b6.addActionListener(this);
		
		b7=new JButton("FoodTech");
		b7.setBounds(30,340,440,35);
		b7.addActionListener(this);
		
		b8=new JButton("Microbiology");
		b8.setBounds(30,380,440,35);
		b8.addActionListener(this);
		
		b9=new JButton("BioMedical Science");
		b9.setBounds(30,420,440,35);
		b9.addActionListener(this);
		
		b10=new JButton("Psychology");
		b10.setBounds(30,460,440,35);
		b10.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(t=="")
		{
			if(ae.getActionCommand().equals("English"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new EnglishAttendence();
							}
						});
			}
			else if(ae.getActionCommand().equals("Computer Science"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ComputerScienceAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Mathematics"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new MathematicsAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Physics"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new PhysicsAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Chemistry"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ChemistryAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Electronics"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ElectronicsAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("FoodTech"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new FoodTechAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Microbiology"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new MicrobiologyAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("BioMedical Science"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new BioMedicalScienceAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Psychology"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new PsychologyAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("ALL DEPARTMENTS"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new Attendance();
							}
						});
			}
		}
		else
		{
			if(ae.getActionCommand().equals("English"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new EnglishShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Computer Science"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ComputerScienceShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Mathematics"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new MathematicsShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Physics"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new PhysicsShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Chemistry"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ChemistryShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Electronics"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ElectronicsShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("FoodTech"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new FoodTechShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Microbiology"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new MicrobiologyShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("BioMedical Science"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new BioMedicalScienceShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("Psychology"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new PsychologyShortAttendance();
							}
						});
			}
			else if(ae.getActionCommand().equals("ALL DEPARTMENTS"))
			{
				SwingUtilities.invokeLater(
						new Runnable()
								 {
							public void run()
							{
								new ShortAttendance();
							}
						});
			}
		}
	}
}

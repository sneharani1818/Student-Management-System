package myJavaProject;
import javax.swing.*;
public class MyMainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(
				new Runnable()
						 {
					public void run()
					{
						new LoginSignin();
					}
				});
	}
}
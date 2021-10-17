package DevelopersDoHere;

import java.util.ResourceBundle;

public class DemoApp {

	public int userLogin(String user_in, String pwd_in) 
	{
	
		ResourceBundle rb= ResourceBundle.getBundle("ForDevelopers");	// Get bundle of resources from .properties file
		String username=rb.getString("username");
		String password=rb.getString("password");
		
		String passwor1d=rb.getString("password");
		String password1=rb.getString("password");
		
		
		// modified by Gitx
		String passwor=rb.getString("password");
		String passwod=rb.getString("password");
		String passw1d=rb.getString("password");
		
		if(user_in.equals(username) && pwd_in.equals(password))
		{
			return 1;			// If both are equal Login Successful
		}
		else
		{
			return 0;			// If anyone not equal Login Failed
		}
	}
	
}

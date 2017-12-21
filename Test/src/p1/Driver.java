package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import testscript.Login;
import utility.Applicationindependent;

public class Driver 
{
	public static WebDriver driver;
	public static Login login = new Login();
	
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		Applicationindependent.navigate("https://modelexperiencecrt.cerner.com/kpi");
		login.Login(driver, "ak042548", "Cerner@2017");
		
		System.out.println("hello hi, checking github");
		
	}
}

package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	
	public void Login(WebDriver driver,String username,String password)
	{
		driver.findElement(By.xpath("//input[@id='authUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='authPassword']")).sendKeys(password);
		
	}
	
	
}

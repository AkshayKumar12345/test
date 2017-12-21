package utility;

import org.openqa.selenium.WebDriver;

import p1.Driver;

public class Applicationindependent
{
	public static void navigate(String url)
	{
		Driver.driver.navigate().to(url);
	}
	
	public String getTitlefrombrowser(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	public static void forword(WebDriver driver)
	{
		driver.navigate().forward();
	}
}

package TesterDoHere;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProject {

	@Test
	public void login_Test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		// modified by Gitx
		WebDriver driverq= new ChromeDriver();
		WebDriver driver1= new ChromeDriver();
		
		// modified by GitDemo Develop
		WebDriver drver1= new ChromeDriver();
		WebDriver drve1= new ChromeDriver();
		WebDriver dve1= new ChromeDriver();
		WebDriver drive1= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
		driver.close();		
		
	}
	
}

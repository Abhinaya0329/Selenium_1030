package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignmentmvn {
	@Test
public void demoSkill()
{
	String URL = System.getProperty("url");
	String EMAIL = System.getProperty("email");	
	String PASSWORD = System.getProperty("password");
	
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   
   driver.get(URL);
   Reporter.log(URL,true);
   Reporter.log(PASSWORD,true);
   Reporter.log(EMAIL,true);
   driver.findElement(By.linkText("Log in")).click();
   
   
   driver.findElement(By.id("Email")).sendKeys(EMAIL);//abhis1234@gmail.com
  driver.findElement(By.id("Password")).sendKeys(PASSWORD);//abhis@123
   driver.findElement(By.xpath("//input[@value='Log in']")).click();
   
   
   Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
   Reporter.log("home page is displayed",true);
	 }
}

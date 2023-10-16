package EXLAT_PACKAGE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Sauce_login {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			  driver.get("https://www.saucedemo.com/");
				System.out.println("test started");
			  Thread.sleep(3000);
	  }
  @Test
  public void Login() {
		WebElement user= driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement button= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		button.click();
		//Assertion
		String expectedTitle="Swag Labs";
		String actualTitle=driver.getTitle();
		Assert.assertEquals( actualTitle,expectedTitle);
		System.out.println(actualTitle);
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("test ended");
	  
  }
  }





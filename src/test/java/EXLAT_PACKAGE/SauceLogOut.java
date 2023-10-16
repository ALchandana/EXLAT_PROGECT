package EXLAT_PACKAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLogOut {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("test started");
  }
  @Test
  public void logout() throws InterruptedException {
	  driver.get("https://www.saucedemo.com/");
	  
	  WebElement user= driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement button= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		button.click();
		Thread.sleep(3000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		
		driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
		
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("test ended");
  }
}

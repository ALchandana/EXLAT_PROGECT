package EXLAT_PACKAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceRemoveFromCart {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("test started");
		}
  @Test
  public void RemoveFromCart() {
	  driver.get("https://www.saucedemo.com/");
	  
	  WebElement user= driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement button= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		button.click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
	}
  @AfterMethod
  public void aftermethod() {
	  System.out.println("test ended");
  }
}
	
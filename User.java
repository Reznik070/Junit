package initial;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class User{
	
	  public String baseUrl = "http://automationpractice.com/index.php";
      String driverPath = "C:\\Users\\Akino\\eclipse-workspace\\Drivers\\chromedriver.exe";
      public WebDriver driver; 

	
  @Test(priority = 0)
  
  
  public void login()throws InterruptedException  {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get(baseUrl);
      String expectedTitle = "My Store";
      String actualTitle = "";
      actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      WebElement signin = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
      signin.click();
      WebElement usrname = driver.findElement(By.cssSelector("#email"));
      usrname.sendKeys("akemzo07@hotmail.com");
      WebElement pass = driver.findElement(By.cssSelector("#passwd"));
      pass.sendKeys("rocker07");
      WebElement btn = driver.findElement(By.cssSelector("#SubmitLogin > span"));
      btn.click();
      WebElement usracnt = driver.findElement(By.xpath("//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a"));
      Assert.assertEquals(usracnt.getText(), "Titty Jackson");
      Thread.sleep(4000);
  }
  
  @Test(priority = 1)

  public void logout()throws InterruptedException  {
	  
	  WebElement lgot = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a"));
      lgot.click();
      WebElement verify = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
      Assert.assertEquals(verify.getText(), "Sign in");
      Thread.sleep(4000);
      
      
      
  driver.close();  
  }
}

package initial2;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class lost_pass_testcase {
	
	public String baseUrl = "http://automationpractice.com/index.php";
    String driverPath = "C:\\Users\\Akino\\eclipse-workspace\\Drivers\\chromedriver.exe";
    public WebDriver driver; 

	
@Test(priority = 0)


public void lostPass()throws InterruptedException  {
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
    
    WebElement forgot_link = driver.findElement(By.cssSelector("#login_form > div > p.lost_password.form-group > a"));
    forgot_link.click();
    
    WebElement email_textbox = driver.findElement(By.cssSelector("#email"));
    email_textbox.sendKeys("akemzo07@hotmail.com");
    
    WebElement retrieve_btn = driver.findElement(By.cssSelector("#form_forgotpassword > fieldset > p > button"));
    retrieve_btn.click();
    
    WebElement alert_success = driver.findElement(By.cssSelector("#center_column > div > p"));
    Assert.assertEquals(alert_success.getText(), "A confirmation email has been sent to your address: akemzo07@hotmail.com");
    Thread.sleep(2000);
    driver.close();
    
}

}

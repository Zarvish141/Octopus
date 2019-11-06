package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstSeleniumTest {
   public static void main(String[] args) {
   
 //System.setProperty("webdriver.gecko.driver", "/home/zarvish/eclipse-workspace/SeliniumTest/lib/geckodriver/geckodriver");
   System.setProperty("webdriver.chrome.driver", "/home/zarvish/eclipse-workspace/SeliniumTest/lib/chromedriver/chromedriver");

  // WebDriver driver = new FirefoxDriver();
   WebDriver driver = new ChromeDriver();
   
   driver.manage().window().maximize();
   String url = "https://accounts.google.com/signin";
   driver.get(url);
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
   
   WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
   email_phone.sendKeys("sunilrajput141");
   
   driver.findElement(By.id("identifierNext")).click();
   WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
   
   WebDriverWait wait = new WebDriverWait(driver, 20);
   wait.until(ExpectedConditions.elementToBeClickable(password));
   password.sendKeys("zarvish7758942389");
   driver.findElement(By.id("passwordNext")).click();
   
   driver.manage().window().maximize();
   
   //driver.close();
   //driver.quit();
    }
}

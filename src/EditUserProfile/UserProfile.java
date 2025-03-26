package EditUserProfile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserProfile {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.smartmedhx.ai/signin");
        driver.manage().window().maximize();
        Thread.sleep(500);

      
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[4]/button")).click();
        Thread.sleep(10000);
        
        //account tab 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/a")).click();
        Thread.sleep(10000);
        
        //Title 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[1]/div[2]/div/div[1]/div[2]")).click();
        Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN , Keys.ARROW_DOWN);
	    actions.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(3000);
	    
	    //first name 
	    WebElement firstname = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[2]/div/div[2]/input"));
	    firstname.clear();
	    Thread.sleep(2000);
	    firstname.sendKeys("Test");
	    
	    //last name 
	    WebElement lastname = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[3]/div/div[2]/input"));
	    lastname.clear();
	    Thread.sleep(2000);
	    lastname.sendKeys("12345");
	    
	    //profession 
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[8]/div[2]/div/div[1]/div[2]")).click();
	    Actions actions1 = new Actions(driver);
	    actions1.sendKeys(Keys.ARROW_DOWN);
	    actions1.sendKeys(Keys.ENTER).perform();
	    Thread.sleep(2000);
	    
	    //update button
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[1]/button")).click();
       
        Thread.sleep(6000); 
       
       driver.quit();
       
       }}
        
   

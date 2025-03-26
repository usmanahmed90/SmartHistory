package Account;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class editAccountdetails {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.smartmedhx.ai/signin");
        driver.manage().window().maximize();
        Thread.sleep(500);

        // Sign in
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("teamuser@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[4]/button")).click();
        Thread.sleep(15000);
        
        // Navigate to Account
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/a")).click();
        Thread.sleep(6000);

        // Locate the file upload input element (it must be an <input type="file"> element)
        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));

        // Provide the absolute path of the profile picture to be uploaded
        String profilePicPath = "C:\\Users\\USER\\Downloads\\pexels-arthousestudio-4310608.jpg";
        uploadElement.sendKeys(profilePicPath);

        // If there's a "Save" or "Upload" button to click after file upload, click it
        // Example:
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[1]/button"));
        saveButton.click();

        // Wait for the upload to complete (you may use explicit waits instead of Thread.sleep)
        Thread.sleep(5000);
        //title 
     	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[1]/div[2]/div/div[1]/div[2]")).click();
    	Actions actions = new Actions(driver);
   		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
   		Thread.sleep(2000);
  		actions.sendKeys(Keys.ENTER).perform();
 		Thread.sleep(4000);  		
 		
//  		//firstname
  		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[2]/div/div[2]/input"));
        firstname.clear();
       firstname.sendKeys("usman");
        
     //profession
    driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[8]/div[2]/div/div[1]/div[2]")).click();
   	Actions actions1 = new Actions(driver);
  	actions1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
  	Thread.sleep(2000);
 	actions1.sendKeys(Keys.ENTER).perform();
	Thread.sleep(4000);  
     driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[1]/button")).click();
     Thread.sleep(3000);
        // Other profile update code can go here (like title, first name, profession changes)

        driver.quit();
    }
}

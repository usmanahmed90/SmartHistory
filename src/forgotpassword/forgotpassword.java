package forgotpassword;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class forgotpassword {

	public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver-win64\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		driver.get("https://staging.smartmedhx.ai/reports");
		driver.manage().window().maximize();
	// Sign in
//        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("teamuser@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test12345");
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[4]/button")).click();
      Thread.sleep(5000);
//        
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[3]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("usman.ahmed@kodexolabs.com");
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/a/div/button/div")).click();
			driver.get("https://mail.google.com/mail/u/0/?ogbl#inbox");
			driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("usman.ahmed@kodexolabs.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(5000);
		
	   driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Usman@786");
	   driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
	   driver.findElement(By.cssSelector("//*[@id=\"gs_lc50\"]/input[1]")).sendKeys("subject:Password Reset Request");
	  
	   Thread.sleep(3000);

        driver.quit();
    }
}

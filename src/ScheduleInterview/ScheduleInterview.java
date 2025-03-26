package ScheduleInterview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScheduleInterview {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

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
//        
        // Schedule Interview 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[1]/button")).click();
        
        // Interviewee Name 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Usman");
        
        // Interviewee Email
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div/div[2]/input")).sendKeys("usman.ahmed@kodexolabs.com");
        
       //Interview Type
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(3) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div:nth-child(3) > div.css-b62m3t-container > div > div.css-1wy0on6 > div > svg")));
		newconversation.click();

       Actions actions = new Actions(driver);
//		// Navigate through the dropdown options using the keyboard
//		// Example: Down arrow key and Enter key(jaha locators naa ho waha iss trah kr
//		// sktai hai aur agr second opt select krna huwa tou arrow down wali command
//		// wapis daini praigi)
 		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);
 		Thread.sleep(2000);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		
		//Interview Language
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(3) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div:nth-child(4) > div.css-b62m3t-container > div > div.css-1wy0on6 > div > svg")));
		newconversation1.click();
		
		Actions actions1 = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER).perform();
		
		//Send Link Button 	
	    driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div.flex.justify-end > button")).click();
		Thread.sleep(8000);
        
        driver.quit();
    }
}
   
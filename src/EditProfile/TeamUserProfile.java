package EditProfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TeamUserProfile {
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
	        
	        //user tab 
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/a")).click();
	        
	        Thread.sleep(4000);
	        //edit button 
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[6]/div/div[1]/img")).click();
	        
	        Thread.sleep(10000);
	       //title  
	      //  driver.findElement(By.cssSelector("body > div:nth-child(8) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div > form > div.grid.grid-cols-1.md\\:grid-cols-2.gap-3 > div:nth-child(1) > div.css-b62m3t-container > div")).click();
	      
//	        //Title 
//	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[4]/div/div[1]/div[2]/div/div[1]/div[2]")).click();
//	        Actions actions = new Actions(driver);
//		    actions.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN , Keys.ARROW_DOWN);
//		    actions.sendKeys(Keys.ENTER).perform();
//		    Thread.sleep(3000);
		    
		    //first name 
		    WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		    Thread.sleep(4000);
		    firstname.clear();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("body > div:nth-child(8) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div > form > div.flex.w-\\[100\\%\\].justify-between.gap-2.mt-10 > div:nth-child(2) > button")).click();
		    Thread.sleep(3000);
		    //firstname.sendKeys("Test");
       	        
		    driver.quit();
	      
}}

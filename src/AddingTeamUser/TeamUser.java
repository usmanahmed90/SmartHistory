package AddingTeamUser;

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

public class TeamUser {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.smartmedhx.ai/sign-up");
        driver.manage().window().maximize();
        Thread.sleep(500);

      
        // Title of the user 
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/form/div[2]/div[1]/div[2]/div/div[1]/div[2]")));
		newconversation.click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER).perform();
      
		//first name
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Usman");
		
		//last name
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Ahmed");
		
		//credentials 
		driver.findElement(By.xpath("//*[@id=\"credentials\"]")).sendKeys("MD");
		
		//Organization 
		driver.findElement(By.xpath("//*[@id=\"company_name\"]")).sendKeys("Kodexo labs");
		
		//Country
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/form/div[2]/div[6]/div[2]/div/div[1]/div[2]")).click();
		Actions actions1 = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);
		//State 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/form/div[2]/div[7]/div[2]/div/div[1]/div[2]")).click();
		Actions actions2 = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER).perform();
		
		//Email 
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("usman.ahmed@kodexolabs.com");
		
		//Professsion
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/form/div[2]/div[9]/div[2]/div/div[1]/div[2]")).click();
		Actions actions3 = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);
		//checkbox
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/form/div[3]/label[2]")).click();
		
		//save button
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/div[1]/form/div[4]/div/button")).click();
	
        Thread.sleep(6000); 
       
       driver.quit();
       
       }}
        
   

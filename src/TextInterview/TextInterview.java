package TextInterview;

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

public class TextInterview {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.smartmedhx.ai/pending/66152b41f3b1156d611fa9e2/655b5f524329a410045f3d98?prompt=65717e529b2c47a105fde842&identifier=28b36dce-24f5-42b2-b781-a1ca0d4683c8&language_code=en");
        driver.manage().window().maximize();
        Thread.sleep(500);

        
//        
        // Schedule Interview 
        Thread.sleep(6000);        
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/button[1]")).click();
        
        
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div/form/textarea")).sendKeys("hello");
//       Thread.sleep(300);
//       
//       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div/form/textarea")).sendKeys("usman and 24");
//       
        
       // driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/button[1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement finetuning = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div/form/textarea")));
		finetuning.click();
        
       String[] messages = {"Hi", "Mr.Usman", "Male" , "35" , "right hand" , "65kg and 4 feet 5 inch"};
       By textAreaLocator = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div/form/textarea");
       By sendButtonLocator = By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/div/div/form/button/div");
       

       for (String message : messages) {
		WebElement textArea = wait.until(ExpectedConditions.visibilityOfElementLocated(textAreaLocator));          
     	  
           //textArea.click();
     	  
           textArea.sendKeys(message);

           
           WebElement sendButton3 = wait.until(ExpectedConditions.elementToBeClickable(sendButtonLocator));         
           sendButton3.click();
           
           Thread.sleep(10000); 
       }
       
       //end button 
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/button")).click();
       Thread.sleep(5000);
        driver.quit();
    }
}
   
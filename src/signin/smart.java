package signin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class smart {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\selenium-java-4.28.1\\chromedriver-win64.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.smartmedhx.ai/signin");
        driver.manage().window().maximize();
        Thread.sleep(500);

        // Sign in
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("teamuser@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[4]/button")).click();
        Thread.sleep(5000);
        
        //Download file 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div[2]/div/div/div/div/div/table/tbody/tr[2]/td[5]/div/div[1]")).click();
        Thread.sleep(5000);
        
        //Search bar 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/header/nav/div/div/div/input")).sendKeys("usman");
        Thread.sleep(5000);
              
        // Subscription
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/a")).click();
        Thread.sleep(5000);
        
        // Account
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/a")).click();
        Thread.sleep(2000);
        
        driver.quit();
    }
}
   
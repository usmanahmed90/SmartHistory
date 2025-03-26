package Subscription;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Subscriptionmanagement {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.smartmedhx.ai/signin");
        driver.manage().window().maximize();
        Thread.sleep(500);

        // Sign in
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("usman.ahmed@kodexolabs.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test12345");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[3]/div/form/div[4]/button")).click();
        Thread.sleep(5000);

        //Subscription managenment tab 
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/a")).click();
        
//        //upgrade subscription
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/main/div/div/div[1]/div[1]/button[1]")).click();
        
        Thread.sleep(6000);
        //package selection
        driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div > div.grid.grid-cols-1.gap-5.md\\:grid-cols-2.justify-items-center.mt-10 > div:nth-child(2) > button")).click();
        
        //stripe "Pay without link" button
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[1]/div[3]/div/div/div/div/button/div")));
		newconversation.click();
      //  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[1]/div[3]/div/div/div/div/button")).click();
        
        Thread.sleep(6000);
        //card information
        driver.findElement(By.xpath("//*[@id=\"cardNumber\"]")).sendKeys("4242 4242 4242 4242");
        
        //month 
        driver.findElement(By.xpath("//*[@id=\"cardExpiry\"]")).sendKeys("02 / 29");
        
        //CVC
        driver.findElement(By.xpath("//*[@id=\"cardCvc\"]")).sendKeys("123");
        
        //card holder name 
        driver.findElement(By.xpath("//*[@id=\"billingName\"]")).sendKeys("Usman");
        
        Thread.sleep(5000);
        
        
        //subscribe button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/main/div/form/div[1]/div/div/div[3]/div/div[3]/button/div[3]")).click();
        
        //subscription tab 
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div:nth-child(2) > div > div.mt-10.overflow-auto > div:nth-child(2) > a")));
		newconversation1.click();
		
        //manage subscription
        driver.findElement(By.cssSelector("#root > div:nth-child(2) > main > div > div > div.flex.flex-col.w-full.gap-4 > div.bg-white.rounded-lg.w-full.md\\:w-\\[60\\%\\].p-5 > button.flex.cursor-pointer.bg-navyBlue.hover\\:border-navyBlue.hover\\:text-navyBlue.w-full.mb-2.justify-center.rounded-md.px-3.py-1\\.5.text-sm.font-semibold.leading-6.shadow-sm.text-white.border.items-center.hover\\:bg-white.transition.hover\\:border-primary.hover\\:text-primary.focus-visible\\:outline.focus-visible\\:outline-2.focus-visible\\:outline-offset-2.focus-visible\\:outline-indigo-600")).click();
        Thread.sleep(12000);
        
        //cancel subscription
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(3) > div > span:nth-child(2) > div > div > div > div > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(1) > div > div > div > div > div > div:nth-child(2) > div > div > div > div > div > div.PressableCore-base.Box-root > a")).click();
        Thread.sleep(5000);    
        
        //canacel plan button 
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(3) > div > span:nth-child(2) > div > div > div > div > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > div.Box-root.Padding-vertical--48 > div > div > div > div:nth-child(1) > button > div")).click();
        
        //return to emedicolegal
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(3) > div > span:nth-child(2) > div > div > div > div > div.Box-root > div > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div:nth-child(2) > a > div > div.Box-root.Flex-flex.Flex-alignItems--baseline.Flex-direction--row.Flex-justifyContent--flexStart > span > span")).click();
        
      //subscription tab 
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation2 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div:nth-child(2) > div > div.mt-10.overflow-auto > div:nth-child(2) > a")));
		newconversation2.click();
		
        //manage subscription
        driver.findElement(By.cssSelector("#root > div:nth-child(2) > main > div > div > div.flex.flex-col.w-full.gap-4 > div.bg-white.rounded-lg.w-full.md\\:w-\\[60\\%\\].p-5 > button.flex.cursor-pointer.bg-navyBlue.hover\\:border-navyBlue.hover\\:text-navyBlue.w-full.mb-2.justify-center.rounded-md.px-3.py-1\\.5.text-sm.font-semibold.leading-6.shadow-sm.text-white.border.items-center.hover\\:bg-white.transition.hover\\:border-primary.hover\\:text-primary.focus-visible\\:outline.focus-visible\\:outline-2.focus-visible\\:outline-offset-2.focus-visible\\:outline-indigo-600")).click();
        Thread.sleep(12000);
        
      //cancel subscription
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(3) > div > span:nth-child(2) > div > div > div > div > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div:nth-child(2) > div > div:nth-child(1) > div > div > div > div > div > div:nth-child(2) > div > div > div > div > div > div.PressableCore-base.Box-root > a")).click();
        Thread.sleep(5000);    
        
        //canacel plan button 
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(3) > div > span:nth-child(2) > div > div > div > div > div:nth-child(2) > div > div > div:nth-child(2) > div > div:nth-child(2) > div > div:nth-child(2) > div.Box-root.Padding-vertical--48 > div > div > div > div:nth-child(1) > button > div")).click();
        
        Thread.sleep(8000);
        //no thanks button 
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(4) > div > span.ModalLayer-container > div > div > div > div > div.Dialog-footer.Box-root.Box-divider--light-top-1.Padding-top--16.Padding-bottom--16.Padding-horizontal--20.Flex-flex.Flex-direction--row.Flex-justifyContent--flexEnd > div > div > div > div:nth-child(1) > div > div.PressableCore-base.Box-root > button")).click();
        
      //return to emedicolegal
        driver.findElement(By.cssSelector("#customer_portal_page_body > div:nth-child(3) > div:nth-child(3) > div > span:nth-child(2) > div > div > div > div > div.Box-root > div > div > div:nth-child(1) > div > div:nth-child(2) > div > div > div > div:nth-child(2) > a > div > div.Box-root.Flex-flex.Flex-alignItems--baseline.Flex-direction--row.Flex-justifyContent--flexStart > span > span")).click();
              
        
      //subscription tab 
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement newconversation3 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div:nth-child(2) > div > div.mt-10.overflow-auto > div:nth-child(2) > a")));
		newconversation3.click();
		 Thread.sleep(4000); 
		 
        driver.quit();
        
    }
}
   
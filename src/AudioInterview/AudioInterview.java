package AudioInterview;

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

public class AudioInterview {

    public static void main(String[] args) throws InterruptedException  {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\USER\\\\\\\\Downloads\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://staging.smartmedhx.ai/pending/6597b22c78a8f69d7e6af03d/67179c5347aa85a8dc808552?prompt=6720bd73c3ad539810626ff0&identifier=f6f03b65-7565-4cdf-9620-80b874721016&language_code=en");
        driver.manage().window().maximize();
        Thread.sleep(500);

        
//        
        // Schedule Interview 
       Thread.sleep(8000);        
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/button[2]")).click();
        Thread.sleep(6000); 
        
        //user journey
       driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.bFxtrZ > svg")).click();
//       
//       driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.bFxtrZ > svg")).click();
////       
//       driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.bFxtrZ > svg")).click();
////       
//       driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.bFxtrZ > svg")).click();
////     
////      driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.bFxtrZ > svg > path")).click();
//      
//      driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.bFxtrZ > svg")).click();
//      
//      driver.findElement(By.cssSelector("#___reactour > div:nth-child(3) > div > div > button.sc-bdfCDU.jPbqiw.sc-dlfmHC.csWLUl > span > svg")).click();
//      
       //call accept 
       driver.findElement(By.cssSelector("body > div:nth-child(3) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div > div > button.flex.cursor-pointer.bg-primary.border-primary.text-white.font-medium.w-full.py-2.justify-center.rounded-md.px-3.py-1\\.5.text-sm.font-semibold.leading-6.shadow-sm.text-white.border.items-center.hover\\:bg-white.transition.hover\\:border-primary.hover\\:text-primary.focus-visible\\:outline.focus-visible\\:outline-2.focus-visible\\:outline-offset-2.focus-visible\\:outline-indigo-600")).click();
       Thread.sleep(15000);
       
       //end call button 
       driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/button[4]")).click();
       
       //end call button | modal 
       driver.findElement(By.cssSelector("body > div:nth-child(5) > div > div.ant-modal-wrap.ant-modal-centered > div > div.ant-modal-content > div > div > div > button.flex.cursor-pointer.bg-shadeRed.border-shadeRed.text-white.hover\\:\\!text-shadeRed.hover\\:\\!border-shadeRed.font-medium.w-full.py-2.false.justify-center.rounded-md.px-3.py-1\\.5.text-sm.font-semibold.leading-6.shadow-sm.text-white.border.items-center.hover\\:bg-white.transition.hover\\:border-primary.hover\\:text-primary.focus-visible\\:outline.focus-visible\\:outline-2.focus-visible\\:outline-offset-2.focus-visible\\:outline-indigo-600")).click();
       
           Thread.sleep(10000);
           driver.quit();
       }}
        
   

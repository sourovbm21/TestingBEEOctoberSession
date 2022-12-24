package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {


    public static void main(String[] args) throws InterruptedException {




        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("openwindow")).click();
                            //driver.getWindowHandle();
       Set<String> window = driver.getWindowHandles();
         Iterator<String > it =  window.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(parent);
       String title =  driver.getTitle();
        System.out.println(title);
        driver.switchTo().window(child);
        String t = driver.getTitle();
        System.out.println(t);
        driver.switchTo().window(parent);
        String p = driver.getTitle();
        System.out.println(p);
        driver.close();
        driver.switchTo().window(child);
        String c = driver.getTitle();
        System.out.println(c);

Thread.sleep(3000);
//driver.quit();
     // driver.close();


    }
}

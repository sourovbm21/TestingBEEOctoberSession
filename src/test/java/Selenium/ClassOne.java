package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class ClassOne {


    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webDriver.chrome.driver","/Users/tohidur/Downloads/chromedriver-2");
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        WebDriver   driver = new SafariDriver() ;
//        WebDriver   driver = new FirefoxDriver() ;
//        WebDriver   driver = new EdgeDriver() ;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.get("https://www.amazon.co.uk");

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Locators( Tagname, Attribute, Value
        //<input type="text" id="autocomplete" class="inputs ui-autocomplete-input" placeholder="Type to Select Countries" autocomplete="off">
           /*
           Xpath : //TagName[@Attribute='Value'],//input[@placeholder='Type to Select Countries'], //input[@type='text'], //input[@class='inputs ui-autocomplete-input']
           Css  : TagName[Attribute='Value'], input[type='text']
           Id
           Name
           Linktext
           partiallinktext
           Class Name
           Tagname
            */
//
        // driver.findElement(By.xpath("//input[@placeholder='Type to Select Countries']")).sendKeys("Fahmida");
//        driver.findElement(By.xpath("//input[@value='radio3']")).click();
//        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Anika");
//        //driver.findElement(By.id("autocomplete")).sendKeys("Rubina");
//        //driver.findElement(By.className("inputs ui-autocomplete-input")).sendKeys("Sourov");
////   driver.findElement(By.ByLinkText());
//        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//        Thread.sleep(2000l);
//        driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
//        //Alert
//        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
//        Thread.sleep(3000);
//        String alertmsg = driver.switchTo().alert().getText();
//        System.out.println(alertmsg);
//        driver.switchTo().alert().accept();
//
//        String pageHeader = driver.findElement(By.xpath("//h1")).getText();
//        System.out.println(pageHeader);
// How to Scroll
      WebElement scrollTo =  driver.findElement(By.xpath("//button[@id='mousehover']"));
        //WebElement sc = driver.findElement(By.xpath("//a[text()='Latest News']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollTo);
        //action (Mouse interaction or mouse ajex
        Actions a = new Actions(driver);
        a.moveToElement(scrollTo).perform();
        //a[text()='Reload']
        a.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();




        Thread.sleep(5000l);
       driver.quit();


    }
}

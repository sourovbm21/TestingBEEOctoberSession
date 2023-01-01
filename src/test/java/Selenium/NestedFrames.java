package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;


public class NestedFrames {



@Test
    public void nestedFrames() throws InterruptedException {
    WebDriver driver  = new ChromeDriver();
    driver.get("http://the-internet.herokuapp.com/nested_frames");
    Actions a = new Actions(driver);
    List<WebElement> e = driver.findElements(By.tagName("frame"));
    System.out.println(e.size());
    WebElement parentTop =driver.findElement(By.xpath("//frame[@name='frame-top']"));
    driver.switchTo().frame(parentTop);
    List <WebElement> b = driver.findElements(By.tagName("frame"));
    System.out.println(b.size());
    a.contextClick().perform();
    Thread.sleep(3000);;
    driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
    a.contextClick().perform();
    Thread.sleep(3000);;
    driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
    a.contextClick().perform();
    Thread.sleep(3000);;
    driver.switchTo().parentFrame().switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
    driver.switchTo().defaultContent();


    a.contextClick().perform();

    Thread.sleep(3000);;


driver.quit();
}

@Test
    public void auto_Suggestive_Drop_Down() throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

    driver.findElement(By.id("autocomplete")).sendKeys("Bang");
    Thread.sleep(3000);
     List<WebElement> allCountryNames = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//div"));
    System.out.println(allCountryNames.size());
    for (int i=0;i<allCountryNames.size();i++){
        System.out.println(allCountryNames.get(i).getText());
       String CountryName =allCountryNames.get(i).getText();
       if (CountryName.equals("Bangladesh")){
           allCountryNames.get(i).click();
       }

    }


    driver.quit();


}


}

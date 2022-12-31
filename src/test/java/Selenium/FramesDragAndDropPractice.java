package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesDragAndDropPractice {





    @Test
       public void dragAndDrop() throws InterruptedException {

           WebDriver driver = new ChromeDriver();
           driver.get("https://jqueryui.com/droppable/");
           WebElement frameName = driver.findElement(By.tagName("iframe"));
           driver.switchTo().frame(frameName);
          WebElement source =  driver.findElement(By.id("draggable"));
          WebElement target = driver.findElement(By.id("droppable"));
           Actions action = new Actions(driver);
           action.dragAndDrop(source,target).build().perform();
           driver.switchTo().defaultContent();
           driver.findElement(By.xpath("//a[text()='Draggable']")).click();
           Thread.sleep(4000);
           driver.quit();


    }





       }

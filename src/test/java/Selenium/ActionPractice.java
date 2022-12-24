package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement scrollTo =  driver.findElement(By.xpath("//button[@id='mousehover']"));
        //WebElement sc = driver.findElement(By.xpath("//a[text()='Latest News']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrollTo);

        //action (Mouse interaction or mouse ajex
        Actions a = new Actions(driver);
        a.moveToElement(scrollTo).perform();
        //a[text()='Reload']
        a.moveToElement(driver.findElement(By.xpath("//a[text()='Reload']"))).click().perform();



    }




}

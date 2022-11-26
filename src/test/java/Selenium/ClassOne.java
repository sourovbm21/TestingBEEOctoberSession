package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ClassOne {


    public static void main(String[] args) {

        //System.setProperty("webDriver.chrome.driver","/Users/tohidur/Downloads/chromedriver-2");
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        WebDriver   driver = new SafariDriver() ;
//        WebDriver   driver = new FirefoxDriver() ;
//        WebDriver   driver = new EdgeDriver() ;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk");

       // driver.get("https://rahulshettyacademy.com/AutomationPractice/");







    }
}

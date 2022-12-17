package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HurokoApp {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//a[text()='Dropdown']")).click();

        //driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        s.selectByIndex(2);
        //s.selectByVisibleText("Option 2");
        // s.selectByValue("2");

    }
}

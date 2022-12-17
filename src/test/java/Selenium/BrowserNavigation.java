package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
        Thread.sleep(2000);
       String  google_Page_Title = driver.getTitle();
        System.out.println(google_Page_Title);
        driver.navigate().to("https://en-gb.facebook.com/");
       String faceBookPageTitle = driver.getTitle();
        System.out.println(faceBookPageTitle);
        Thread.sleep(2000);
        driver.navigate().back();
        String  Title = driver.getTitle();
        System.out.println(Title);
        Thread.sleep(2000);
        driver.navigate().forward();
        String  Titlee = driver.getTitle();
        System.out.println(Titlee);
        driver.navigate().refresh();
        driver.quit();
    }


}

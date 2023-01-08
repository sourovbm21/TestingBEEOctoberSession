package Selenium;

import org.asynchttpclient.uri.Uri;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URL;
import java.util.function.Predicate;

public class Authentication {


@Test
    public void basicAuth(){
    WebDriver driver = new ChromeDriver();
    driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    driver.quit();
}
@Test
    public void basicAuthPredicate(){
    WebDriver driver = new ChromeDriver();
    Predicate<URI> uriPredicate = uri -> uri.getHost().contains("the-internet.herokuapp.com");
    ((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
    driver.get("http://the-internet.herokuapp.com/basic_auth");
    driver.quit();

}



}

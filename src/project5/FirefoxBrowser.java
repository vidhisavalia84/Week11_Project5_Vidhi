package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //Print title of page
        System.out.println("Title of the page is : "+driver.getTitle());
        //Print current url
        System.out.println("Current url is : "+driver.getCurrentUrl());
        //Get Page source
        System.out.println("Page source is : "+driver.getPageSource());
        //Enter email
        WebElement email=driver.findElement(By.id("user[email]"));
        email.sendKeys("abcd123@gmail.com");
        //Enter password
        WebElement password=driver.findElement(By.id("user[password]"));
        password.sendKeys("abc123");
driver.close();
    }
}

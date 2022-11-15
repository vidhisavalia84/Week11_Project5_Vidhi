package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser="Firefox";
  static WebDriver driver;
  static String baseurl="https://courses.ultimateqa.com/users/sign_in";



    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver=new EdgeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();

        }else {
            System.out.println("Invalid browser");
        }
          driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //Print title of the page
        System.out.println("Title of the page is : "+driver.getTitle());
        //Print current url
        System.out.println("Current url : "+driver.getCurrentUrl());
        //Print page source
        System.out.println("The page source is : "+driver.getPageSource());
        //Enter email
        WebElement email=driver.findElement(By.id("user[email]"));
        email.sendKeys("abcd123@gmail.com");
        //Enter password
        WebElement password=driver.findElement(By.id("user[password]"));
        password.sendKeys("abc123");
driver.close();
    }
}

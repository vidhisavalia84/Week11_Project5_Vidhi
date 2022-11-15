package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
    public static void main(String[] args) {
        String baseurl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get(baseurl);
        //maximise window
        driver.manage().window().maximize();
        //Print title
        System.out.println("Title of the page : "+driver.getTitle());
        //Print current url
        System.out.println("Current url is : "+driver.getCurrentUrl());
        //Print page souse
        System.out.println("Print page source : "+driver.getPageSource());
        //enter email
        WebElement email=driver.findElement(By.id("user[email]"));
        email.sendKeys("abcd123@gmail.com");
        //enter password
        WebElement password=driver.findElement(By.id("user[password]"));
        password.sendKeys("abc123");
driver.close();
    }
}

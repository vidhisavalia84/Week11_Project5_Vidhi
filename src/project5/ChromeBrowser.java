package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

        public static void main (String[]args){
            String baseurl = "https://courses.ultimateqa.com/users/sign_in";
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //maximise window
            driver.manage().window().maximize();
            //set url
            driver.get(baseurl);
            //Print title
            System.out.println("Print title of the page : " + driver.getTitle());
            //Print current url
            System.out.println("Current url is : " + driver.getCurrentUrl());
            //Print page source
            System.out.println("Psge source is :" + driver.getPageSource());
            //Enter email
            WebElement email = driver.findElement(By.id("user[email]"));
            email.sendKeys("abcd@gmail.com");
            //Enter password
            WebElement password = driver.findElement(By.id("user[password]"));
            password.sendKeys("abc123");
            driver.close();
        }
    }

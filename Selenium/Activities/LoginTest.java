package Selanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {

        // Launch the browser
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://training-support.net/webelements/login-form/");

        // Get and print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Enter username
        driver.findElement(By.id("username")).sendKeys("admin");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("password");

        // Click login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Close the browser
      //  driver.close();
    }
}    


package Selanium;

   import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Aboutas {

    public static void main(String[] args) {

        // Launch the browser
        WebDriver driver = new ChromeDriver();

        // Open the training support website
        driver.get("https://training-support.net");

        // Print the title of the page
        System.out.println("Home Page Title: " + driver.getTitle());

        // Click the "About Us" button
        driver.findElement(By.linkText("About Us")).click();

        // Print the title of the new page
        System.out.println("About Us Page Title: " + driver.getTitle());

        // Close the browser
      //  driver.close();
    }
} 


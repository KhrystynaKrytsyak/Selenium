package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    //Task
    //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    //verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    //verify enroll today button is enabled
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        driver.switchTo().frame("FrameOne");
        WebElement header = driver.findElement(By.className("heading-13"));
        String text = header.getText();
        if(text.equals("Sorry, We Couldn't Find Anything For “Asksn”")){
            System.out.println("Header is displayed");
        }else {
            System.out.println("Header is not available");
        }
        /*header.isDisplayed();
        boolean errorMessage = header.isDisplayed();
        System.out.println("Sorry, We Couldn't Find Anything For “Asksn” " + errorMessage);
       */

        driver.switchTo().defaultContent();
        driver.switchTo().frame("FrameTwo");
        WebElement enrollButton = driver.findElement(By.xpath("//div[text()='Enroll today'][1]"));
        String button = enrollButton.getText();
        if (enrollButton.isEnabled()) {
            System.out.println("Enroll button is available");
        }else {
            System.out.println("Enroll button is not available");
        }
        /* enrollButton.isEnabled();
        boolean button = enrollButton.isEnabled();
        System.out.println("Enroll button is available " + button);
        */

        driver.close();


    }
}

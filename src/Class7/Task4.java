package Class7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Task: Go to https://syntaxprojects.com/javascript-alert-box-demo.php
//click on each button and handle the alert accordingly
public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alert1.click();
        Thread.sleep(2000);
        Alert acceptAlert1 = driver.switchTo().alert();
        acceptAlert1.accept();

        WebElement alert2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2.click();
        Thread.sleep(2000);
        Alert acceptAlert2 = driver.switchTo().alert();
        acceptAlert2.accept();

        WebElement alert3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3.click();
        Thread.sleep(2000);
        Alert acceptAlert3 = driver.switchTo().alert();
        acceptAlert3.sendKeys("Khrystyna");
        acceptAlert3.accept();
        driver.quit();
    }
}

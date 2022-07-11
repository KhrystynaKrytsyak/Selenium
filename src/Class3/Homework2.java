package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    //Task2:
    //navigate to fb.com
    //click on create new account
    //fill up all the text boxes
    //click on sign up button
    //close the popup
    //close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(6000);
        driver.findElement(By.name("firstname")).sendKeys("Maria");
        driver.findElement(By.name("lastname")).sendKeys("Krytsyak");
        driver.findElement(By.name("reg_email__")).sendKeys("mkrytsyak65@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mkrytsyak65@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("JHfsdmnfsmfk7^%e83283");
        Thread.sleep(6000);
        driver.findElement(By.id("month")).sendKeys("August");
        driver.findElement(By.id("day")).sendKeys("14");
        driver.findElement(By.id("year")).sendKeys("1996");
        Thread.sleep(6000);
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.className("_42ft _4jy0 layerConfirm _2rsa uiOverlayButton _4jy3 _4jy1 selected _51sy")).click();
        Thread.sleep(15000);
        driver.quit();
    }
}

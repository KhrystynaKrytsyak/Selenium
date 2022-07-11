package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Task: Navigate to http://syntaxprojects.com
//Click on start practicing
//click on simple form demo
//enter any text on first text box
//click on show message
//quit the browser


public class Homework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement practice = driver.findElement(By.xpath("//a[text() = ' Start Practising ']"));
        practice.click();
        Thread.sleep(2000);
        WebElement simpleForm = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.xpath("//input[@id='user-message']"));
        message.sendKeys("This message is invisible");
        Thread.sleep(2000);
        WebElement showMessage=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        showMessage.click();
        Thread.sleep(2000);

        driver.quit();
    }
}


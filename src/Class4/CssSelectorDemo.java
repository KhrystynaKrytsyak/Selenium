package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        WebElement startPracticingButton = driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPracticingButton.click();
        Thread.sleep(2000);
        WebElement simpleForm = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleForm.click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.cssSelector("input[placeholder ^='Please enter']"));
        message.sendKeys("Sameer loves Absolute One lol");
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick *= 'show"));
        showMessageButton.click();

        Thread.sleep(2000);
        driver.quit();

    }
}

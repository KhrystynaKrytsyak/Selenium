package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkTask3 {
    //HRMS Application Negative Login:
    //Open chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text "Password cannot be empty" is displayed.

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("Admin");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement message = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        boolean isMessageDisplayed = message.isDisplayed();
        System.out.println(isMessageDisplayed);
    }
}

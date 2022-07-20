package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

    //Go to facebook sign up page
    //Fill out the whole form
    //Click signup

    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccount.click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Khrystyna");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Krytsyak");
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("krytsyak@gmail.com");
        WebElement confirmationEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        confirmationEmail.sendKeys("krytsyak@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("Krytsyak1408");
        WebElement month = driver.findElement(By.id("month"));
        Select select = new Select(month);
        select.selectByVisibleText("Aug");
        WebElement day = driver.findElement(By.id("day"));
        select = new Select (day);
        select.selectByVisibleText("14");
        WebElement year = driver.findElement(By.id("year"));
        select = new Select(year);
        select.selectByVisibleText("1992");
        WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
        gender.click();
        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();
    }
}

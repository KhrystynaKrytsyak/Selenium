package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    //Task1:navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //click on register
    //close the browser

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Khrystyna");
        driver.findElement(By.id("customer.lastName")).sendKeys("Krytsyak");
        driver.findElement(By.id("customer.address.street")).sendKeys("359 Broome Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("New York");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11456");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("3476548765");
        driver.findElement(By.id("customer.ssn")).sendKeys("98784997");
        driver.findElement(By.id("customer.username")).sendKeys("KKryt");
        driver.findElement(By.id("customer.password")).sendKeys("SyntaxTechnology");
        driver.findElement(By.id("repeatedPassword")).sendKeys("SyntaxTechnology");
        driver.findElement(By.className("button")).click();
        Thread.sleep(6000);
        driver.quit();
    }
}

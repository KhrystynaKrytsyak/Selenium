package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    //TC 1: Facebook dropdown verification . Open chrome browser. Go to "https://www.facebook.com"
    //click on create new account. Verify: 1. month dd has 12 month options. 2. day dd has 31 day options
    //3. year dd has 115 year options. 4. Select your date of birth
    //Quit browser
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccount.click();
        Thread.sleep(2000);

        //month verification
        WebElement month = driver.findElement(By.id("month"));
        Select select = new Select(month);
        List<WebElement> monthOptions = select.getOptions();
        int monthSize = monthOptions.size();
        System.out.println(monthSize);
        select.selectByIndex(8);

        //day verification
        WebElement day = driver.findElement(By.id("day"));
        select=new Select(day);
        List<WebElement> dayOptions = select.getOptions();
        int daySize = dayOptions.size();
        System.out.println(daySize);
        select.selectByIndex(14);

        //year verification
        WebElement year = driver.findElement(By.id("year"));
        select = new Select(year);
        List<WebElement> yearOptions = select.getOptions();
        int yearSize = yearOptions.size();
        System.out.println(yearSize);
        select.selectByVisibleText("1992");

        Thread.sleep(2000);
        driver.quit();





    }
}

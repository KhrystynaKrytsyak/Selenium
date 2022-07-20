package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {

    public static String url = "https://www.ebay.com/";
    public static void main(String[] args) throws InterruptedException {
        //Go to ebay.com
        //get all the categories and print them in the console
        //select Computers/Tables & Networking
        //click on search
        //verify the header
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement allCategories = driver.findElement(By.id("gh-cat"));
        Select select = new Select(allCategories);
        List<WebElement> allOptions = select.getOptions();

        for (WebElement options : allOptions) {
            String categories = options.getText();
            System.out.println(categories);
        }
            Thread.sleep(2000);
         select.selectByVisibleText("Computers/Tablets & Networking");
         WebElement search = driver.findElement(By.id("gh-btn"));
         search.click();
         Thread.sleep(2000);
         WebElement header = driver.findElement(By.xpath("//span[@class='b-pageheader__text']"));
         String headerText = header.getText();
         if(header.isDisplayed()) {
             System.out.println("Header is verified");
             driver.quit();
            }
        }
    }


package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); //
         WebDriver driver = new ChromeDriver(); //create an object
         driver.get("https://www.amazon.com/"); //specify an URL you want to access
         String title =driver.getTitle();
         String url=driver.getCurrentUrl();
         System.out.println(title+" "+url);
         driver.quit();
     }
}

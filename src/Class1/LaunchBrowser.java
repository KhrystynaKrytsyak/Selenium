package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe"); //setting the property to use chrome driver
                                    // .exe is used for windows/ if mac then no need for extension
        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("http://www.google.com");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title =driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}

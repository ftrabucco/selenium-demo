package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Navigations {


    private RemoteWebDriver driver;
    

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void miTest() {
        driver.get("https://www.snapdeal.com");
        //driver.get("https://www.amazon.com");

        driver.navigate().to("https://www.amazon.com");


        driver.navigate().back(); // snapdeal
        driver.navigate().forward();

        driver.navigate().refresh();

    }
}

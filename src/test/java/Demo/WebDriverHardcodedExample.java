package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebDriverHardcodedExample {

    // webdriver instance variable declaration
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // specify the location of the browser driver
        System.setProperty("webdriver.chrome.driver", "/path/to/driver/chromedriver.exe");
        // create a new instance of the WebDriver
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
        driver.get("https://www.google.com");
    }
}

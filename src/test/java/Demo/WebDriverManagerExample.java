package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class WebDriverManagerExample {

    // webdriver instance variable declaration
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // call setup method from WebDriverManager
        WebDriverManager.chromedriver().setup();
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
        driver.get("https://www.google.com/");
    }

}

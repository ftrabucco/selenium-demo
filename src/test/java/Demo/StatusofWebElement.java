package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StatusofWebElement {

    private WebDriver driver;

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
        driver.get("https://www.demo.nopcommerce.com/register");

        // isDisplayed()    isEnabled()
        WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));

        System.out.println("Display status: "+searchStore.isDisplayed()); // true
        System.out.println("Enabled status: "+ searchStore.isEnabled());

        // isSelected() - radio buttons, check boxes, dropdown
        WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Selected status: "+ male.isSelected()); // False
        System.out.println("Selected status: "+ female.isSelected()); // False

        male.click(); // selects male radio button

        System.out.println("Selected status: "+ male.isSelected()); // True
        System.out.println("Selected status: "+ female.isSelected()); // False

        female.click(); // selects female radio button

        System.out.println("Selected status: "+ male.isSelected()); // False
        System.out.println("Selected status: "+ female.isSelected()); // True
    }
}

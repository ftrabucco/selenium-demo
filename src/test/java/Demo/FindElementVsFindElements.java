package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementVsFindElements extends SettingClass{

    @Test
    public void miTest() {
        driver.get("https://demo.guru99.com/test/newtours/index.php");

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //single element
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //submitButton.click();
 ;
        //list of elements
        List <WebElement> links = driver.findElements(By.cssSelector("td[class='mouseOut']>a"));
        System.out.println("Number of elements captured: " + links.size());

        for (WebElement ele: links) {
            System.out.println(ele.getText());
        }
    }

}

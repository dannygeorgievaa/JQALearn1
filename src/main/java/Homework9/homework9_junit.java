package Homework9;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class homework9_junit {

    public static ChromeDriver driver;

    {
        // WebElement element;
        System.setProperty("webdriver.chrome.driver", "/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
    }

    @BeforeClass
    public static void openBrowser() {
         driver = new ChromeDriver();
        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
        driver.get("https://www.google.com/");
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.google.com/",actualUrl);
        driver.manage().window().maximize();
        //
    }

    @Test
    public void openPage() {


        driver.findElement(By.id("L2AGLb")).click();
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("test 123");
        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();
        WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @AfterClass
        public static void closeBrowser(){
            driver.quit();

    }

}


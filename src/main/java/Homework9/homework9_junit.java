package Homework9;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class homework9_junit {

    private static ChromeDriver driver;
   // WebElement element;

    @BeforeClass
    public static void openBrowser(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");

    }

    @Test
    public void openPage () {

        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("L2AGLb")).click();
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("test 123");
        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();
    }

            @AfterClass
        public static void closeBrowser(){
            driver.quit();

    }

}


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import java.util.List;
import org.junit.*;

public class TestAction_Actions_Homework10 {

      //  public static void main(String[] args) {

            static WebDriver driver;

            @BeforeClass
            public static void setUp () {
                System.setProperty("webdriver.chrome.driver", "/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }

            @Test
            public void demoBrowserMethods () {
                driver.get("https://blog.testproject.io/");

                String urlTestProject = driver.getCurrentUrl();
                System.out.println("What Is Test Project's Current URL? " + urlTestProject);

                String titleTestProject = driver.getTitle();
                System.out.println("What Is Test Project's Page Title? " + titleTestProject);
            }

            @AfterClass
             public static void tearDown () {
                //driver.quit();
                driver.close();
            }
        }




  /*  public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");

        Actions a = new Actions(driver);


//Double click on element

        WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));

        a.doubleClick(trialaction).perform();

    }

} */


package Homework10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class LoginPage {
    //  WebDriver driver;

    public static ChromeDriver driver;
    {
        System.setProperty("webdriver.chrome.driver", "/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("www.pinterest.com");
        driver.manage().window().maximize();
    }
    WebElement loginButton = driver.findElement(By.className("wc1 zI7 iyn Hsu"));
    WebElement userName = driver.findElement(By.className("zI7 iyn Hsu"));
    WebElement password = driver.findElement(By.className("NVN CRJ zI7 iyn Hsu"));
    WebElement signInButton = driver.findElement(By.className("zI7 iyn Hsu"));
    {
        this.driver = (ChromeDriver) driver;
        PageFactory.initElements(this.driver, this);

    }

    public void loginUser(String userName, String password) {
        System.out.println("Login user method");
        this.loginButton.click();
        this.userName.sendKeys("dannygeorgievaa@gmail.com");
        this.password.sendKeys("hardexpert");
        this.signInButton.click();

    }
}

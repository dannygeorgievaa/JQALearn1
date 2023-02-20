package Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Login {
    static WebDriver driver;
    static FindBy loginButton = (FindBy) By.className("wc1 zI7 iyn Hsu");
    static FindBy email = (FindBy) By.className("wc1 zI7 iyn Hsu");
    static FindBy password = (FindBy) By.className("NVN CRJ zI7 iyn Hsu");
    static FindBy submitButton =(FindBy) By.className("zI7 iyn Hsu");

    public static void clickLoginButton()
    {
        driver.findElement((By) loginButton).click();
    }
    public static void typeEmail(String s)
    {
        driver.findElement((By) email).sendKeys();
    }
    public static void typePassword(String String )
    {
        driver.findElement((By) password).sendKeys("hardexpert");
    }
    public static void clickSubmit()
    {
        driver.findElement((By) submitButton).click();
    }
    public void LoginPage(WebDriver driver){
        this.driver = driver;

    }
}


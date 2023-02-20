package Helpers;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static Helpers.Login.driver;

public class Main {


        @BeforeClass
        public static void SetDriver()
        {
            System.setProperty("webdriver.chrome.driver", "/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("www.pinterest.com");
            driver.manage().window().maximize();
    }
        @Test
    public void validateLogin()
        {
            Login loginPage = new Login();
            loginPage.clickLoginButton();
            loginPage.typeEmail("dannygeorgievaa@gmail.com");
            loginPage.typePassword("hardexpert");
            loginPage.clickSubmit();
        }
}

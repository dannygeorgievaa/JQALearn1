package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class FirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("L2AGLb")).click();
        WebElement searchBox = driver.findElement(By.linkText("Search"));
        searchBox.sendKeys("test 123");
        WebElement searchButton = driver.findElement(By.id("gNO89b"));
        searchButton.click();


    }
}

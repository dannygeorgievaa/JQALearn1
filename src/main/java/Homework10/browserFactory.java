package Homework10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.util.HashMap;
import java.util.Map;

public class browserFactory {
    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
            case "Safari":
                driver = drivers.get("Safari");
                if (driver == null) {
                    driver = new SafariDriver();
                    drivers.put("Safari", driver);
                }
                break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver","/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }

    public static void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}
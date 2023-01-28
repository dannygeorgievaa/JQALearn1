import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class helloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        String firstName = "Dani";
        String lastName = "Mihaylova";
        System.out.println(firstName + " "+ lastName);

        System.setProperty("webdriver.chrome.driver","/Users/dannygeorgievaa/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.google.com");
        driver.quit();
    }
}


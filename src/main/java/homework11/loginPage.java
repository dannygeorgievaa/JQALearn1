package homework11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class loginPage {
        WebDriver driver;
        By EmailId = By.xpath("//input[contains(@name, *id')1");
        By Password = By.xpath("//input[contains (@name, 'password')]");
        By ContinueButton = By.xpath("//button[contains(@class,'Signup *)1");

    public void typeEmail(String Email) {
        driver.findElement(EmailId).sendKeys(Email);
    }
        public void typePassword (String passwordtext){
                driver.findElement (Password).sendKeys (passwordtext);
        }
        public void clickContinue (){
        driver.findElement(ContinueButton).click();
    }
public loginPage(WebDriver driverFromPreviousClass) {
        this.driver = driverFromPreviousClass;
        }
}

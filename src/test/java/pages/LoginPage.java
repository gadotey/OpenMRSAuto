package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Gadotey on 3/4/2020
 */
public class LoginPage extends BaseUtil {


    private WebDriver driver;
    //private WebDriverWait wait;

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // wait = new WebDriverWait(driver, 10);
    }

    @FindBy(id = "username")
    WebElement userName;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(id = "Registration Desk")
    WebElement  locationField;

    @FindBy(id = "loginButton")
    WebElement loginBtn;

    @FindBy(xpath = "//h4[contains(text(),'Logged in as Super User (admin) at Registration De')]")
    WebElement  successfulLoginMessage;

    @FindBy(id = "error-message")
    WebElement  unsuccessfulLoginMessage;


    public void LoginToDashboard(String admin, String input) {
        // wait.until(ExpectedConditions.elementToBeClickable(searchField));
        userName.sendKeys(admin);
        Password.sendKeys(input);
        locationField.click();
        loginBtn.click();
    }

    public String successfulLoginMessage() {
        // wait.until(ExpectedConditions.visibilityOf(searchResult));
        return displayMessage(successfulLoginMessage, successfulLoginMessage.getText());
    }

    public void InvalidLoginToDashboard(String admin, String input) {
        // wait.until(ExpectedConditions.elementToBeClickable(searchField));
        userName.sendKeys(admin);
        Password.sendKeys(input);
        locationField.click();
        loginBtn.click();

    }

    public String unsuccessfulLoginMessage() {
        // wait.until(ExpectedConditions.visibilityOf(searchResult));
        return displayMessage(unsuccessfulLoginMessage, unsuccessfulLoginMessage.getText());
    }
}

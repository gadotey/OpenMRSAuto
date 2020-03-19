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

    @FindBy(id = "authUser")
    WebElement userName;

    @FindBy(id = "clearPass")
    WebElement Password;

    @FindBy(xpath = "//option[5]")
    WebElement  locationField;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement loginBtn;

    @FindBy(id = "username")
    WebElement  successfulLoginMessage;

    @FindBy(xpath = "//div[@class='alert alert-danger login-failure m-1']")
    WebElement  unsuccessfulLoginMessage;


    public void LoginToDashboard(String admin, String input) {
        // wait.until(ExpectedConditions.elementToBeClickable(searchField));
        userName.sendKeys(admin);
        Password.sendKeys(input);
        //locationField.click();
        loginBtn.click();
    }

    public String successfulLoginMessage() {
        // wait.until(ExpectedConditions.visibilityOf(searchResult));
        return displayMessage(successfulLoginMessage, successfulLoginMessage.getText());
    }

    public void InvalidLoginToDashboard(String admin1, String input1) {
        // wait.until(ExpectedConditions.elementToBeClickable(searchField));
        userName.sendKeys(admin1);
        Password.sendKeys(input1);
        locationField.click();
        loginBtn.click();

    }

    public String unsuccessfulLoginMessage() {
        // wait.until(ExpectedConditions.visibilityOf(searchResult));
        return displayMessage(unsuccessfulLoginMessage, unsuccessfulLoginMessage.getText());
    }
}

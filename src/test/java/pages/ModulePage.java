package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Gadotey on 3/4/2020
 */
public class ModulePage extends BaseUtil {


    private WebDriver driver;
    //private WebDriverWait wait;

    //Constructor
    public ModulePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//*[@id=\"menu_logo\"]/div/div/span[7]/div/div")
    WebElement modulesTab;

    @FindBy(xpath = "//div[contains(text(),'Manage Modules')]")
    WebElement manageModules;

    @FindBy(xpath = "//option[5]")
    WebElement  locationField;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    WebElement loginBtn;

    @FindBy(id = "username")
    WebElement  successfulLoginMessage;

    @FindBy(id = "error-message")
    WebElement  unsuccessfulLoginMessage;


    public void ManageModulePage() {
        //wait.until(ExpectedConditions.elementToBeClickable(searchField));
        modulesTab.click();
        manageModules.click();
        //locationField.click();
        //loginBtn.click();
    }

    public String successfulLoginMessage() {
        // wait.until(ExpectedConditions.visibilityOf(searchResult));
        return displayMessage(successfulLoginMessage, successfulLoginMessage.getText());
    }


    public String unsuccessfulLoginMessage() {
        // wait.until(ExpectedConditions.visibilityOf(searchResult));
        return displayMessage(unsuccessfulLoginMessage, unsuccessfulLoginMessage.getText());
    }
}

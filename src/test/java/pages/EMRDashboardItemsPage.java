package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Gadotey on 3/4/2020
 */
public class EMRDashboardItemsPage extends BaseUtil {

    private WebDriver driver;
    //private WebDriverWait wait;

    //Constructor
    public EMRDashboardItemsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//span[@id='menu_logo']//span[1]//div[1]")
    WebElement calendarTab;

    @FindBy(id = "username")
    WebElement  LoginUsername;

    @FindBy(xpath = "//span[2]//div[1]")
    WebElement flowboardTab;

    @FindBy(xpath = "//div[contains(text(),'Recall Board')]")
    WebElement  recallBoardTab;

    @FindBy(xpath = "//div[contains(text(),'Messages')]")
    WebElement messagesTab;

    @FindBy(xpath = "//*[@id='menu_logo']/div/div/span[5]/div/div")
    WebElement  patientClientTab;

    @FindBy(xpath = "//input[@id='anySearchBox']")
    WebElement  searchDemographic;






    public boolean verifyCalendarVisible() {

        return isDisplayed(calendarTab);
    }

    public boolean verifyFlowBoardVisible() {

        return isDisplayed(flowboardTab);
    }

    public boolean verifyRecallBoardVisible() {

        return isDisplayed(recallBoardTab);
    }

    public boolean verifyMessageTabVisible() {

        return isDisplayed(messagesTab);
    }

    public boolean verifyPatientClientVisible() {

        return isDisplayed(patientClientTab);
    }


      public boolean  verifySelectedLocation() {

          return isDisplayed(searchDemographic);
    }


}

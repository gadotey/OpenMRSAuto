package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Gadotey on 3/4/2020
 */
public class DashboardItemsPage extends BaseUtil {

    private WebDriver driver;
    //private WebDriverWait wait;

    //Constructor
    public DashboardItemsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        // wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//li[@class='identifier']")
    WebElement adminLink;

    @FindBy(xpath = "//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    WebElement findPatientsRecord;

    @FindBy(xpath = "//span[@id='selected-location']")
    WebElement  registrationDesk;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement loginOutBtn;

    @FindBy(xpath = "//i[@class='icon-cogs']")
    WebElement  systemAdmin;

    @FindBy(xpath = "//a[@id='org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension']//i[@class='icon-calendar']")
    WebElement  activeVisits;

    @FindBy(xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    WebElement registerAPatient;

    @FindBy(xpath = "//i[@class='icon-vitals']")
    WebElement captureVitals;

    @FindBy(xpath = "//a[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']//i[@class='icon-calendar']")
    WebElement  appointmentScheduling;

    @FindBy(xpath = "//i[@class='icon-list-alt']")
    WebElement reports;

    @FindBy(xpath = "//i[@class='icon-hdd']")
    WebElement  dataManagement;

    @FindBy(xpath = "//i[@class='icon-tasks']")
    WebElement  configureMetadata;

    @FindBy(id = "elected-location")
    WebElement  selectedLocation;


    public boolean verifyAdminVisible() {

        return isDisplayed(adminLink);
    }

    public boolean verifyRegistrationDeskVisible() {

        return isDisplayed(registrationDesk);
    }

    public boolean verifyLogoutVisible() {

        return isDisplayed(loginOutBtn);
    }

    public boolean verifyFindPatientRecordButtonVisible() {

        return isDisplayed(findPatientsRecord);
    }

    public boolean verifyActiveVisitsButtonVisible() {

        return isDisplayed(activeVisits);
    }

    public boolean verifyRegisterAPatientButtonVisiblee() {

        return isDisplayed(registerAPatient);
    }

    public boolean verifyCaptureVitalsButtonVisible() {

        return isDisplayed(captureVitals);
    }

    public boolean verifyAppointSchedulingButtonVisible() {

        return isDisplayed(appointmentScheduling);
    }

    public boolean verifyDataManagementButtonVisible() {

        return isDisplayed(dataManagement);
    }

    public boolean verifyCofigureMetadataButtonVisible() {

        return isDisplayed(configureMetadata);
    }

    public boolean verifyReportsButtonVisible() {

        return isDisplayed(reports);
    }

    public boolean verifySystemAdminButtonVisible() {

        return isDisplayed(systemAdmin);
    }

    public String  verifySelectedLocation() {

        return displayMessage(selectedLocation, selectedLocation.getText());
    }


}

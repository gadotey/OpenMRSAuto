package Dashboard;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Gadotey on 3/4/2020
 */
public class FindPatientRecordPage extends BaseUtil {

    private WebDriver driver;
    private WebDriverWait wait;
    private Object WebElement;

    //Constructor
    public FindPatientRecordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    @FindBy(xpath = "//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']")
    WebElement findPatientsRecord;

    @FindBy(xpath = "//input[@id='patient-search']")
    WebElement patientSearch;

    @FindBy(xpath = "//h2[contains(text(),'Find Patient Record')]")
    WebElement PageTitle;

    @FindBy(xpath = "//*[@id=\"patient-search-results-table\"]/tbody/tr[5]/td[1]")
    WebElement searchResults;

    @FindBy(xpath = "//div[contains(text(),'Name')]")
    WebElement  NameSearch;

    @FindBy(id = "patient-search-results")
    public List<WebElement>  findPatient;


    public void searchPatientRecord(String input) {
        wait.until(ExpectedConditions.elementToBeClickable(findPatientsRecord));
        findPatientsRecord.click();
        patientSearch.sendKeys(input);
        wait.until(ExpectedConditions.elementToBeClickable(patientSearch));
        //searchResults.click();

    }


    public void getPageTitle() {
        System.out.println(getElementText(PageTitle));
    }
}

package base;

import manager.DriverManager;
import manager.DriverManagerFactory;
import manager.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * Created by Gadotey on 2/25/2020
 */
public class BaseUtil {
    public WebDriver driver;
    DriverManager driverManager;


    @BeforeMethod
    @Parameters("browserName")
    public void setUp(@Optional String browserName) {
        getLocalDriver(browserName);
        //driver.manage().window().maximize();
        driver.navigate().to("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
    }

    public WebDriver getLocalDriver(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
            driver = driverManager.getDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
            driver = driverManager.getDriver();
        } else {
            //This exception will be displayed on the screen if the driver is not found.
            throw new RuntimeException("No Such Driver Found!");
        }
        return driver;
    }

    public boolean verifyWebElementExist(WebElement element) {

        //private static final Logger log = LoggerHelper.getLogger(GenericHelper.class);

        try {
            return element.isDisplayed();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    //This will read the Value of an Element
    public String readValueFromElement(WebElement element) {

        if (null == element) {
            //log.info("weblement is null");
            return null;
        }

        boolean displayed = false;
        try {
            displayed = isDisplayed(element);
        } catch (Exception e) {
            //log.error(e);
            //Reporter.log(e.fillInStackTrace().toString());
            return null;
        }

        if (!displayed) {
            return null;
        }
        String text = element.getText();
        //log.info("weblement valus is.."+text);
        return text;
    }


    public String displayMessage(WebElement element, String actualMessage) {


        if (null == element) {
            //log.info("webelement is null");
            return null;
        }
        try {
            actualMessage = element.getText();
        } catch (Exception ex) {
            //log.info("Element not found " + ex)
            //Reporter.log(ex.fillInStackTrace().toString());
            System.out.println("Element not found " + ex);

        }
        return actualMessage;

    }

    protected String getDisplayText(WebElement element) {
        if (null == element) {
            return null;
        }
        if (!isDisplayed(element)) {
            return null;
        }
        return element.getText();
    }


    public static synchronized String getElementText(WebElement element) {
        if (null == element) {
            //log.info("weblement is null");
            return null;
        }
        String elementText = null;
        try {
            elementText = element.getText();
        } catch (Exception ex) {
            //log.info("Element not found " + ex);
            //Reporter.log(ex.fillInStackTrace().toString());
        }
        return elementText;
    }


    protected boolean isDisplayed(WebElement element) {
        try {
            element.isDisplayed();
            //log.info("element is displayed.."+element);
            return true;
        } catch (Exception e) {
            //log.info(e);
            //Reporter.log(e.fillInStackTrace().toString());
            return false;
        }
    }


    @AfterMethod
    public void tearDown() {
        driverManager.quitDriver();
    }
}

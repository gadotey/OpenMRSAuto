package manager;

import org.openqa.selenium.WebDriver;

/**
 * Created by Gadotey on 2/25/2020
 */
public abstract class DriverManager {

    WebDriver driver;

    abstract void startService();
    abstract void stopService();
    abstract void createService();

    public void quitDriver(){
        if (driver != null){
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        if (driver == null){
            startService();;
            createService();
        }
        return driver;
    }
}
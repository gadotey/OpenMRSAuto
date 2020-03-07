package manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.io.File;

/**
 * Created by Gadotey on 2/26/2020
 */
public class FirefoxDriverManager extends DriverManager {


    GeckoDriverService geckoService;

    void startService() {
        if (geckoService == null) {
            geckoService = new GeckoDriverService.Builder()
                    .usingDriverExecutable(new File(System.getProperty("user.dir") +  "\\driver\\geckodriver.exe"))
                    .usingAnyFreePort()
                    .build();
        }
    }

    void stopService() {
        if (geckoService != null && geckoService.isRunning()) {
            geckoService.stop();
        }
    }

    void createService() {
        driver = new FirefoxDriver(geckoService);

    }
}
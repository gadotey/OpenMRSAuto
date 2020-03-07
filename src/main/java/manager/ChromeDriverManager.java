package manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

/**
 * Created by Gadotey on 2/25/2020
 */
public class ChromeDriverManager extends DriverManager {
    ChromeDriverService chromeService;

    void startService() {
        if (chromeService == null) {
            chromeService = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File(System.getProperty("user.dir") +  "\\driver\\chromedriver.exe"))
                    .usingAnyFreePort()
                    .build();
        }
    }

    void stopService() {
        if (chromeService != null && chromeService.isRunning()) {
            chromeService.stop();
        }
    }

    void createService() {
        driver = new ChromeDriver(chromeService);

    }
}
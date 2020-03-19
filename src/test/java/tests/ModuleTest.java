package tests;

import base.BaseUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ModulePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gadotey on 3/4/2020
 */
public class ModuleTest extends BaseUtil {

    //RetryAnalyzer will make the test run again in case if fails( retryAnalyzer = RetryAnalyzer.class )
    @Test()
    public void validLogin() {
        ModulePage md = new ModulePage(driver);
        LoginPage login = new LoginPage(driver);
        driver.manage().window().maximize();

        login.LoginToDashboard("admin", "pass");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        md.ManageModulePage();

//        String successfulLoginMessage = "";
//        Assert.assertEquals(md.successfulLoginMessage(),
//                "");
    }

}

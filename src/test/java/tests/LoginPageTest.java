package tests;

import base.BaseUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by Gadotey on 3/4/2020
 */
public class LoginPageTest extends BaseUtil {

    //RetryAnalyzer will make the test run again in case if fails( retryAnalyzer = RetryAnalyzer.class )
    @Test()
    public void validLogin() {
        LoginPage login = new LoginPage(driver);
        login.LoginToDashboard("Admin", "Admin123");

        String successfulLoginMessage = "Logged in as Super User (admin) at Registration Desk.";
        Assert.assertEquals(login.successfulLoginMessage(),
                "Logged in as Super User (admin) at Registration Desk.");
    }

}

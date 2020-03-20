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
        login.LoginToDashboard("admin", "pass");

        String successfulLoginMessage = "Patient: None";
        Assert.assertEquals(login.successfulLoginMessage(),
                "Patient: None");
    }

    @Test()
    public void invalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.InvalidLoginToDashboard("admin", "admin");

        String unsuccessfulLoginMessage = "Invalid username or password";
        Assert.assertEquals(login.unsuccessfulLoginMessage(),
                "Invalid username or password");
    }

}

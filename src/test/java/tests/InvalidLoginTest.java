package tests;

import base.BaseUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by Gadotey on 3/4/2020
 */
public class InvalidLoginTest extends BaseUtil {



    @Test()
    public void invalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.InvalidLoginToDashboard("Admin123", "Admin");

        //String unsuccessfulLoginMessage = "Invalid username/password. Please try again";
        Assert.assertEquals(login.unsuccessfulLoginMessage(),
                "Invalid username/password. Please try again.");

    }


}

package tests;

import base.BaseUtil;
import org.testng.annotations.Test;
import pages.GooglePage;
import utils.RetryAnalyzer;

import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Gadotey on 2/25/2020
 */
public class Main extends BaseUtil {

    //RetryAnalyzer will make the test run again in case if fails
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void  testing() {
        GooglePage user = new GooglePage(driver);
        user.searchFor("Selenium");
        assertTrue(user.isOnResultPage());
    }
}
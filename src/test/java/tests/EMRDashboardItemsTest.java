package tests;

import base.BaseUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardItemsPage;
import pages.EMRDashboardItemsPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Gadotey on 3/4/2020
 */
public class EMRDashboardItemsTest extends BaseUtil {

    @Test()
    public void verifyEMRDashboardItems() {
        LoginPage login = new LoginPage(driver);
        //DashboardItemsPage dash = new DashboardItemsPage(driver);
		EMRDashboardItemsPage dashitem = new EMRDashboardItemsPage(driver);
        login.LoginToDashboard("admin", "pass");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		// Verify that the calendar tab  is visible
		Assert.assertTrue(dashitem.verifyCalendarVisible(), "The Calendar is not visible");

		// Verify that the calendar tab  is visible
		Assert.assertTrue(dashitem.verifyFlowBoardVisible(), "The FlowBoard tab is not visible");

		// Verify that the calendar tab  is visible
		Assert.assertTrue(dashitem.verifyRecallBoardVisible(), "The Recall Board tab is not visible");

		// Verify that the calendar tab  is visible
		Assert.assertTrue(dashitem.verifyMessageTabVisible(), "The Message tab is not visible");

		// Verify that the calendar tab  is visible
		Assert.assertTrue(dashitem.verifyPatientClientVisible(), "The Patient/Client tab is not visible");

		// Verify that the calendar tab  is visible
		Assert.assertTrue(dashitem.verifySelectedLocation(), "The Calendar is not visible");


    }

}

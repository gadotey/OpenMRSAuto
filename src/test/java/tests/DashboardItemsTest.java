package tests;

import base.BaseUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardItemsPage;
import pages.LoginPage;

/**
 * Created by Gadotey on 3/4/2020
 */
public class DashboardItemsTest extends BaseUtil {

    @Test()
    public void verifyDashboardItems() {
        LoginPage login = new LoginPage(driver);
        DashboardItemsPage dash = new DashboardItemsPage(driver);
        login.LoginToDashboard("Admin", "Admin123");

        //Verify the Valid Login information
        String successfulLoginMessage = "Logged in as Super User (admin) at Registration Desk.";
        Assert.assertEquals(login.successfulLoginMessage(),
                "Logged in as Super User (admin) at Registration Desk.");

        // Verify that the admin  is visible
		Assert.assertTrue(dash.verifyAdminVisible(), "The Admin is not visible");

        // Verify that find  patient button is  visible
		Assert.assertTrue(dash.verifyRegistrationDeskVisible(), "The Registration Desk is not visible");

        // Verify that logout is  visible
		Assert.assertTrue(dash.verifyLogoutVisible(), "The Logout is not visible");

        // Verify that find patient record button  is  visible
		Assert.assertTrue(dash.verifyFindPatientRecordButtonVisible(), "The find patient record button is not visible");

        // Verify that active visits button is visible
		Assert.assertTrue(dash.verifyActiveVisitsButtonVisible(), "The active visits button is not visible");

        // Verify that active visits button is visible
		Assert.assertTrue(dash.verifyActiveVisitsButtonVisible(), "The active visits button is not visible");

        // Verify that register a patient button is visible
		Assert.assertTrue(dash.verifyRegisterAPatientButtonVisiblee(), "The register a button is not visible");

		//Verify that reports button is visible

        // Verify that  appointments scheduling button is visible
		Assert.assertTrue(dash.verifyAppointSchedulingButtonVisible(), "The appointment scheduling button is not visible");

        // Verify that  data management button is visible
	    Assert.assertTrue(dash.verifyDataManagementButtonVisible(), "The data management button is not visible");

        // Verify that  configure metadata button is visible
	    Assert.assertTrue(dash.verifyCofigureMetadataButtonVisible(), "The metadata button is not visible");

	    // Verify that the System Admin button is visible
        Assert.assertTrue(dash.verifySystemAdminButtonVisible(), "The System Admin Button is not visible");

    }

}

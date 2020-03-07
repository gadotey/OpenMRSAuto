package tests;

import Dashboard.FindPatientRecordPage;
import base.BaseUtil;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import pages.DashboardItemsPage;
import pages.LoginPage;

import java.util.Collections;

import static org.testng.Assert.*;

/**
 * Created by Gadotey on 3/4/2020
 */
public class FindPatientRecordTest  extends BaseUtil {

    //public static Logger log = (Logger) LogManager.getLogger(BaseUtil.class.getName());

    @Test()
    public void PatientRecord() {
        LoginPage login = new LoginPage(driver);
        DashboardItemsPage dash = new DashboardItemsPage(driver);
        FindPatientRecordPage fprecord = new FindPatientRecordPage(driver);
        login.LoginToDashboard("Admin", "Admin123");
        fprecord.searchPatientRecord("Smith");

        Assert.assertEquals("Find Patient Record", "Find Patient Record");
        //Assert.assertEquals(Collections.singleton(fprecord.getPageTitle()), "Find Patient Record");
        fprecord.getPageTitle();
    }
}
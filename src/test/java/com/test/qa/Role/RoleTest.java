package com.test.qa.Role;

import com.test.qa.testdata.RoleData;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.RolePage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

import java.util.logging.Logger;
/**
 * @Author Banuja
 */

public class RoleTest extends TestBase {
   // the logger printing
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(RolePage.class));

    // use testng and group and use the priority
    @Test(groups = {"test","regression"},priority = 2,dataProviderClass = RoleData.class,dataProvider ="RoleDataTokyo" )


    // to get the values from the data provider using the method
    public void RoleTest(String role,String status,String alertmsg) {
        RolePage.clickMaster();
        RolePage.clickRole();
        RolePage.clickaddRole();
        RolePage.implicitWait(6000);
        RolePage.setRolCongerete(role);
        RolePage.clickSave();

// validation checking
      if(status.equals("pass")){
        softAssert.assertTrue(RolePage.isDisplayRole());
          LOGGER.info("Data Add sucessfully");

        }
      else {
          RolePage.isDisplayRole();
          RolePage.getRoleAlert();
          softAssert.assertEquals(RolePage.isDisplayRole(),alertmsg);
          LOGGER.info("Älert Message");
      }

    }

// testng annotation use , group and smoke
    @Test(groups = {"smoke"},priority = 1)
    public void RoleSmokeTest() {
        RolePage.clickMaster();
        RolePage.clickRole();
        RolePage.clickaddRole();
        RolePage.setRolCongerete("banu");
        RolePage.clickSave();
    }

}

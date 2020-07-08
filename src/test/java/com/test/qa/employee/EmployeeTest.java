package com.test.qa.employee;

import com.test.qa.testdata.EmployeeData;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.EmployeeList;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class EmployeeTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(EmployeeList.class));

    @Test(groups = {"test", "regression" }, priority = 2,dataProviderClass = EmployeeData.class, dataProvider = "employeeDataprovider")
    public void TokiyomasterTest(String fname ,String lname,String address,String contactno,String email,String status,String alertmsg) throws Exception {

        softAssert = new SoftAssert();

        EmployeeList.clickMasterMenu();
        EmployeeList.clickEmployee();
        EmployeeList.clickAddEmployee();
        softAssert.assertTrue(EmployeeList.isdashboardDisplay(), "AddEmployeePanal displayed");
        EmployeeList.setfname(fname);
        EmployeeList.setlname(lname);

        EmployeeList.selectPlantOption1();

        EmployeeList.setSelectDesignation1();
        EmployeeList.setaddress(address);
        EmployeeList.setnumber(contactno);
        EmployeeList.setemail(email);
        EmployeeList.clicksavebtn();

        if(status.equals("Pass")){
        softAssert.assertTrue(EmployeeList.isDisplayEmployee());
            LOGGER.info("Data Add Succues");
        }

        else{
            EmployeeList.isDisplayEmployee();
            EmployeeList.getEmployeeAlert();
            softAssert.assertEquals(EmployeeList.isDisplayEmployee(),alertmsg);
            LOGGER.info("Alert Message");
        }
       // softAssert.assertAll();
    }

    @Test(groups = {"Smoke"}, priority = 1)
    public void employeeSmokeTest() throws Exception {
        softAssert = new SoftAssert();

        EmployeeList.clickMasterMenu();
        EmployeeList.clickEmployee();
        EmployeeList.clickAddEmployee();
        softAssert.assertTrue(EmployeeList.isdashboardDisplay(), "AddEmployeePanal displayed");
        EmployeeList.setfname("vinthusha");
        EmployeeList.setlname("Loganathan");
        EmployeeList.selectPlantOption1();
        EmployeeList.setSelectDesignation1();
        EmployeeList.setaddress("Jaffna");
        EmployeeList.setnumber("0765894235");
        EmployeeList.setemail("vinthu15@gmail.com");
        EmployeeList.clicksavebtn();

    }
}

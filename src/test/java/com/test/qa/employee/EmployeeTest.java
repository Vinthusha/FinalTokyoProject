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
    public void TokiyomasterTest() throws Exception {

        softAssert = new SoftAssert();

        EmployeeList.clickMasterMenu();
        EmployeeList.clickEmployee();
        EmployeeList.clickbtnEmployee();
        EmployeeList.clickAddEmployee();
        softAssert.assertTrue(EmployeeList.isdashboardDisplay(), "AddEmployeePanal displayed");
        EmployeeList.setfname("fname");
        EmployeeList.setlname("lname");

        EmployeeList.selectPlantOption1();

        EmployeeList.setSelectDesignation1();
        EmployeeList.setaddress("address");
        EmployeeList.setnumber("contactno");
        EmployeeList.setemail("email");
        EmployeeList.clicksavebtn();
     softAssert.assertAll();
     }

    @Test(groups = {"Smoke"}, priority = 1)
    public void employeeSmokeTest() throws Exception {
        softAssert = new SoftAssert();

        EmployeeList.clickMasterMenu();
        EmployeeList.clickEmployee();
        EmployeeList.clickbtnEmployee();
        EmployeeList.clickAddEmployee();
        softAssert.assertTrue(EmployeeList.isdashboardDisplay(), "AddEmployeePanal displayed");
        EmployeeList.setfname("sathurya");
        EmployeeList.setlname("jeyaveersingam");
        EmployeeList.selectPlantOption1();
        EmployeeList.setSelectDesignation1();
        EmployeeList.setaddress("Jaffna");
        EmployeeList.setnumber("0771234567");
        EmployeeList.setemail("sathurya@gmail.com");
        EmployeeList.clicksavebtn();

    }
}

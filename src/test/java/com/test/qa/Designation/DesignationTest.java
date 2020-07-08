package com.test.qa.Designation;

import com.test.qa.testdata.DesignationDataTest;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.Designation;

//import com.test.qa.tokyo.utils.PageBase;
import com.test.qa.utils.TestBase;


import org.testng.annotations.Test;

public class DesignationTest extends TestBase {

    @Test(groups = {"regression"},priority = 2,dataProviderClass = DesignationDataTest.class ,dataProvider = "Desigantiondataprovider")
    public void TokyoDesignationTest( String Desigination,String Description) {
        Designation.clickMasterPanel();
        Designation.clickMasterDesignation();
        Designation.clickAddesignation();
        Designation.DesignationName(Desigination);
        Designation.DesignationDescription(Description);
        Designation.DesignationSave();

    }
    @Test(groups = {"Smoke"}, priority = 1)

    public void DesignationSmokeTest() {
        Designation.clickMasterPanel();
        Designation.clickMasterDesignation();
        Designation.clickAddesignation();
        Designation.DesignationName("employeeadd");
        Designation.DesignationDescription("employee");
        Designation.DesignationSave();
    }

    }

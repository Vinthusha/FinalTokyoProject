package com.test.qa.Customer;

import com.test.qa.tokyo.DisplayDashboard.master.CustomerNV.Customer;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CustomerTest extends TestBase {
    @Test(groups = {"Test","regression"}, priority = 2)
    public void customerTest() throws Exception {
        softAssert = new SoftAssert();
        Customer.clickMasterMenu();
        Customer.clickCustomer();
        Customer.clickAddCustomer();


        Customer.setCustomerName("Banuja");
        Customer.setAddress("Navali");
        Customer.setContactNO("07698345689");
        Customer.setEmail("banu56@gmail.com");
        Customer.setdropdownPlant("colombo");
        Customer.setbutCustomerSave();

    }

    @Test(groups = {"Smoke"}, priority = 1)
    public void customerSmokeTest() throws Exception {
        softAssert = new SoftAssert();
        Customer.clickMasterMenu();
        Customer.clickCustomer();
        Customer.clickAddCustomer();
        Customer.setCustomerName("Banuja");
        Customer.setAddress("Navali");
        Customer.setContactNO("07698345689");
        Customer.setEmail("banu56@gmail.com");
        Customer.setdropdownPlant("colombo");
        Customer.setbutCustomerSave();
        softAssert.assertAll();
    }
}

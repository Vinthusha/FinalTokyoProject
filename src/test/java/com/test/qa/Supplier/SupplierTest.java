package com.test.qa.Supplier;

import com.test.qa.testdata.SuppliersData;
import com.test.qa.tokyo.DisplayDashboard.master.SupplierNV.Supplier;
import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

public class SupplierTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(SupplierTest.class);
    @Test(groups = { "test", "regression"},priority = 2,dataProviderClass = SuppliersData.class, dataProvider = "SupplierTest", testName = "LoginCorrect")
    public void Edit(String Sname, String Cname, String category, String address, String contactno, String email, String plant) throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(Supplier.isdashboardDisplay(), "Dashboard displayed");
        Supplier.clickMaster();
        Supplier.clicksupplier();
        softAssert.assertTrue(Supplier.isSupplierDisplay(), "Supplier Displayed");
        Supplier.clickeditbt();
        Supplier.setsupplierName(Sname);
        Supplier.setcompanyName(Cname);
        Supplier.setsuppcatergory(category);
        Supplier.setaddress(address);
        Supplier.setcontactno(contactno);
        Supplier.setemail(email);
        Supplier.clickplant();
        PageBase.hitEnter();
        Supplier.clicksave();
        Supplier.clickeditbt();
        Supplier.UpdateAlert();
        softAssert.assertAll();

    }

    @Test(groups = {"Smoke"},priority = 1)
    public void supplierSmoketest() throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(Supplier.isdashboardDisplay(), "Dashboard displayed");
        Supplier.clickMaster();
        Supplier.clicksupplier();
        softAssert.assertTrue(Supplier.isSupplierDisplay(), "Supplier Displayed");
        Supplier.clickeditbt();
        Supplier.setsupplierName("nikshala");
        Supplier.setcompanyName("haribillders");
        Supplier.setsuppcatergory("fine aggregate");
        Supplier.setaddress("jaffna");
        Supplier.setcontactno("076895368");
        Supplier.setemail("nikshala16@gmail.com");
        Supplier.clickplant();
        PageBase.hitEnter();
        Supplier.clicksave();
        softAssert.assertAll();

    }
}



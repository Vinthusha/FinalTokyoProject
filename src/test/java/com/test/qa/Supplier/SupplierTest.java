package com.test.qa.Supplier;

import com.test.qa.testdata.PlantData;
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

        Supplier.clickMaster();
        Supplier.clickMenusupplier();
        Supplier.clickSupplier();
        Supplier.clickAddSupplier();
        Supplier.suppcatergory();
        Supplier.setsupplierName("AgroSuppliers");
        Supplier.setcompanyName("Tokiyocement");
        Supplier.selectplant();
        Supplier.setcontactno("0777945636");
        Supplier.setemail("tokiycement@gmail.com");
        Supplier.setaddress("colombo");
        Supplier.clikSave();



    }

    @Test(groups = {"Smoke" },priority = 1)
    public void supplierSmoketest() throws Exception {
        Supplier.clickMaster();
        Supplier.clickMenusupplier();
        Supplier.clickSupplier();
        Supplier.clickAddSupplier();
        Supplier.suppcatergory();
        Supplier.setsupplierName("AgroSuppliers");
        Supplier.setcompanyName("Tokiyocement");
        Supplier.selectplant();
        Supplier.setcontactno("0777945636");
        Supplier.setemail("tokiycement@gmail.com");
        Supplier.setaddress("colombo");
        Supplier.clikSave();


    }
}



package master.Supplier;

import com.test.qa.utils.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

/**
 *
 * Created by Thushi
 * Supplier Test class
 * Updated on 12.07.2020
 *
 */

public class SupplierTest extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(SupplierTest.class);
//    @Test(groups = { "test", "regression"},priority = 2,dataProviderClass = SuppliersData.class, dataProvider = "SupplierTest", testName = "LoginCorrect")
//    public void Edit(String Sname, String Cname, String category, String address, String contactno, String email, String plant) throws Exception {
//
//        Supplier.clickMaster();
//        Supplier.clickMenusupplier();
//        Supplier.clickSupplier();
//        Supplier.clickAddSupplier();
//        Supplier.clicksuppcatergory();
//        Supplier.setsupplierName("AgroSuppliers");
//        Supplier.setcompanyName("Tokiyocement");
//        Supplier.selectplant();
//        Supplier.setcontactno("0777945636");
//        Supplier.setemail("tokiycement@gmail.com");
//        Supplier.setaddress("colombo");
//        Supplier.clikSave();
//    }

//    @Test(groups = {"Smoke" },priority = 1)
//    public void supplierSmoketest() throws Exception {
//        softAssert = new SoftAssert();
//        Supplier.clickMaster();
//        Supplier.clickMenusupplier();
//        Supplier.clickSupplier();
//        Supplier.clickAddSupplier();
//        Supplier.clicksuppcatergory();
//        Supplier.setsupplierName("AgroSuppliers");
//        Supplier.setcompanyName("Tokiyocement");
//        Supplier.selectplant();
//        Supplier.setcontactno("0777945636");
//        Supplier.setemail("tokiycement@gmail.com");
//        Supplier.setaddress("colombo");
//        Supplier.clikSave();
//        softAssert.assertAll();
//
//
//    }


     @Test(groups = {"Smoke" },priority = 1)
    public void SupplierTest()throws Exception{
        softAssert = new SoftAssert();

        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");// Click Master
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/header/ul/li[13]/a");//  Supplier NV
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");// click Supplier
        MethodBase.click_ByXpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/div/button");// Click  Add Supplier
        MethodBase.click_ByXpath("//*[@id=\"supplier_category\"]/div/div"); // Click Supplier category
        MethodBase.setText_ByID("supplier_name","name"); // Supplier name
        MethodBase.setText_ByID("supplier_company_name","company name");// Company name
        MethodBase.click_ByXpath("//*[@id=\"supplier_plant\"]/div/div");// select Plant_dropdown
        MethodBase.hitEnter();
        Thread.sleep(5);
        MethodBase.setText_ByID("supplier_contactno","0775262482");// Supplier contact number
        MethodBase.setText_ByID("supplier_email","ravi@gmail.com");// Supplier Email
        MethodBase.setText_ByID("supplier_address","address");// Supplier Address
        MethodBase.clickButton_ByXpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");// Enter save button
        softAssert.assertAll();
    }
}



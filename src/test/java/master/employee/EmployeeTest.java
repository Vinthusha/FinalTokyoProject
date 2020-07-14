package master.employee;

import com.test.qa.testdata.masterdata.EmployeeData;
import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.EmployeeList;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;
import utils.PageBase;

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
//        softAssert.assertTrue(EmployeeList.isdashboardDisplay(), "AddEmployeePanal displayed");
        EmployeeList.setfname("kalaivani");
        EmployeeList.setlname("Raja");
        MethodBase.click_ByXpath("//*[@id=\"plant\"]/div/div"); // click plant
        PageBase.staticWait(01);
        MethodBase.hitEnter();
        MethodBase.click_ByXpath("//*[@id=\"desigination\"]/div/div"); // click designation
        PageBase.staticWait(01);
        MethodBase.hitEnter();
        EmployeeList.setaddress("colombo");
        EmployeeList.setnumber("0769835695");
        EmployeeList.setemail("Kalai25@gmail.com");
        EmployeeList.clicksavebtn();
        softAssert.assertAll();
    }
}

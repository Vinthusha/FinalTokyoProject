package master.Designation;

import com.test.qa.tokyo.DisplayDashboard.master.EmployeeNV.Designation;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

public class DesignationTest extends TestBase {

//        @Test(groups = {"regression"},priority = 2,dataProviderClass = DesignationDataTest.class ,dataProvider = "Desigantiondataprovider")
//    public void TokyoDesignationTest( String Desigination,String Description) {
//        Designation.clickMasterPanel();
//        Designation.clickMasterDesignation();
//        Designation.clickAddesignation();
//        Designation.DesignationName(Desigination);
//        Designation.DesignationDescription(Description);
//        Designation.DesignationSave();
//
//    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void DesignationTest() {
        Designation.clickMasterPanel();
        Designation.clickemployee();
        Designation.clickAddDesignation();
        Designation.setdesignation("employeeadd");
        Designation.DesignationDescription("employee");
        Designation.DesignationSave();
    }

}

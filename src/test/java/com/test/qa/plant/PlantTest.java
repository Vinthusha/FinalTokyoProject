package com.test.qa.plant;

import com.test.qa.testdata.PlantData;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

/**
 * @Author Nixsala
 */


public class PlantTest  extends TestBase {
    private static final Logger LOGGER =  Logger.getLogger(String.valueOf((PlantPanel.class)));

    // use testng annoation and group , piriority
    @Test(groups = { "test", "regression",},priority = 1,dataProviderClass = PlantData.class,dataProvider = "PlantDetail")
    public void TokiyomasterTest(String code,String plant,String address,String fax,String contacno,String description) {

//using soft assert
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "LoginPage Displayed");
        PlantPanel.clickMasterPanel();
        PlantPanel.clickPlantpanel();
        PlantPanel.clickAddpanel();

//implement plantpanel method
        PlantPanel.setCode(code);
        PlantPanel.setName(plant);
        PlantPanel.setAddress(address);
        PlantPanel.setContacno(fax);
        PlantPanel.setFax(contacno);
        PlantPanel.setDescription(description);
        PlantPanel.clickSavebutten();
        softAssert.assertAll();
    }
    //Testng and group for smoke
    @Test(groups = {"Smoke" },priority = 2)
    public void PlantSmokeTest() {

        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"LoginPage Displayed");
        PlantPanel.clickMasterPanel();
        PlantPanel.clickPlantpanel();
        PlantPanel.clickAddpanel();
        PlantPanel.setCode("C002");
        PlantPanel.setName("vavuniya");
        PlantPanel.setAddress("vavuniya");
        PlantPanel.setContacno("07696693569");
        PlantPanel.setFax("07696693569");
        PlantPanel.setDescription("Description");
        PlantPanel.clickSavebutten();
        softAssert.assertAll();

    }


}





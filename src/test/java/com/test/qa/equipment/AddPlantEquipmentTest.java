package com.test.qa.equipment;

import com.test.qa.testdata.EquipmentData;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.AddPlantEquipment;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AddPlantEquipmentTest extends TestBase {
    @Test(groups = {"test", "regression", "smoke"}, priority = 2, dataProviderClass = EquipmentData.class, dataProvider = "equipmentdataprovider")
    public void TokiyoequipmentTest(String serialno, String equipment, String plant, String brandname, String modelname, String descripion) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "LoginPage Displayed");
        PlantPanel.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.setSerialno(serialno);
        AddPlantEquipment.setequipment(equipment);
        AddPlantEquipment.setplant(plant);
        AddPlantEquipment.setbrandname(brandname);
        AddPlantEquipment.setmodelnmae(modelname);
        AddPlantEquipment.setdescription(descripion);
        AddPlantEquipment.clickbut();
        softAssert.assertAll();

    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void plantequipmentSmokeTest() {
        AddPlantEquipment.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickplantequipmentField();
        AddPlantEquipment.setSerialno("003");
        AddPlantEquipment.setequipment("Oven");
        AddPlantEquipment.setplant("mannar");
        AddPlantEquipment.setbrandname("Apans");
        AddPlantEquipment.setmodelnmae("C001");
        AddPlantEquipment.setdescription("Tool");
        AddPlantEquipment.clickbut();
        softAssert.assertAll();
    }
}







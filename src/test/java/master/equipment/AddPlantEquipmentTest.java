package master.equipment;

import com.test.qa.testdata.masterdata.EquipmentData;
import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.AddPlantEquipment;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddPlantEquipmentTest extends TestBase {
    @Test(groups = {"test", "regression", "smoke"}, priority = 2, dataProviderClass = EquipmentData.class, dataProvider = "equipmentdataprovider")
    public void TokiyoequipmentTest(String serialno, String equipment, String plant, String brandname, String modelname, String descripion) throws Exception {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(), "LoginPage Displayed");
        PlantPanel.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.setSerialno(serialno);

        AddPlantEquipment.setbrandname(brandname);
        AddPlantEquipment.setmodelnmae(modelname);
        AddPlantEquipment.setdescription(descripion);
        AddPlantEquipment.clickbut();
        softAssert.assertAll();

    }
    @Test(groups = {"Smoke"}, priority = 1)
    public void plantequipmentSmokeTest() throws Exception {
        AddPlantEquipment.clickMasterPanel();
        AddPlantEquipment.clickEquipmentPanel();
        AddPlantEquipment.clickplantequipmentField();
        AddPlantEquipment.clickAddPlantEquipment();
        AddPlantEquipment.setSerialno("S002");
        AddPlantEquipment.selectPlanteuip();
        AddPlantEquipment.selectPlantplant();
        AddPlantEquipment.setbrandname("bans");
        AddPlantEquipment.setmodelnmae("S0015");
        AddPlantEquipment.setdescription("data");
        AddPlantEquipment.clickbut();
        softAssert.assertAll();
    }
}








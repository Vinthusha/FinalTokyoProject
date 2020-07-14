package master.equipment;

import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import com.test.qa.tokyo.DisplayDashboard.master.equipmentNV.Equipment;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.MethodBase;

public class EqupmentTest extends TestBase {
    @Test(groups = {"Smoke" },priority = 1)
    public void equipmentSmokeTest() throws Exception {
       Equipment.clickMasterPanel();
       Equipment.clickequipmenttab();
       Equipment.clickequipment();
       Equipment.clickaddequipment();
       Equipment.setEquipment("Oven");
       Equipment.setDescription("add data");
      Equipment.selecttype();
       MethodBase.hitEnter();
       Equipment.clicksavebtn();


    }
}

package master.SupplierCatecory;

import com.test.qa.tokyo.DisplayDashboard.master.SupplierNV.SupplierCatecory;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;

public class SupplierCatecoryTest extends TestBase {

    @Test(groups = {"Smoke"}, priority = 1)
    public void SupplierCatecorySmokeTest() {
        SupplierCatecory.clickMasterPanel();
        SupplierCatecory.clickMenuTabSupplier();
        SupplierCatecory.clickSupplierCategory();
        SupplierCatecory.clickAddCatecory();
        SupplierCatecory.setsupplier_category("sandbulk");
        SupplierCatecory.setsupplierCategory_description("collect");
        SupplierCatecory.clickplantSave();

    }
}


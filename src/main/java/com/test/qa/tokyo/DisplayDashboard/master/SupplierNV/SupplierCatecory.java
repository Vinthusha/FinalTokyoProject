package com.test.qa.tokyo.DisplayDashboard.master.SupplierNV;

import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

import java.util.logging.Logger;

public class SupplierCatecory extends PageBase {

    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlantPanel.class));

    private static By plantSuplierCatPanel = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[7]");
    private static By btnAddSupplierCategory = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");

    private static By txtCatecory = By.xpath( "//*[@id=\"supplier_category\"]");
    private static By txtsupplierCategory_description = By.xpath("//*[@id=\"supplierCategory_description\"]");

    private static By butPlantSave = By.xpath("//*[@type=\"button\"][2]");

    private static By masterMenu = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");

    private static By AddSubCat = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");


    public static void clickAddSupCatpanel() {

        getDriver().findElement(AddSubCat).click();
    }
    public static void clickSupCatpanel() {

        getDriver().findElement(plantSuplierCatPanel).click();
    }
/*
    public static void clickAddpanel() {

        getDriver().findElement(btnAddSupplierCategory).click();
    }*/
    public static void setsupplier_category(String supplier_category) {

        getDriver().findElement(txtCatecory).sendKeys(supplier_category);
    }

    public static void setsupplierCategory_description(String supplierCategory_description) {

        getDriver().findElement(txtsupplierCategory_description).sendKeys(supplierCategory_description);
    }
    public static void clickplantSave() {

        getDriver().findElement(butPlantSave).click();

    }
    public static void clickMasterPanel() {

        getDriver().findElement(masterMenu).click();


    }

}

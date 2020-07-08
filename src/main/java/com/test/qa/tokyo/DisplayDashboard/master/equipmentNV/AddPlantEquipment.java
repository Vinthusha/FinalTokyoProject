package com.test.qa.tokyo.DisplayDashboard.master.equipmentNV;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.PageBase;

public class AddPlantEquipment extends PageBase {
    private static By masterMenu =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By equipmentPannel =By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[7]");
    private static By plantequipmentField =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    private static By btnAddPLantEquip=By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div/div[1]/div/div[2]/button");
    private static By txtserialno =By.id("serial_no");
    private static By dropequipment =By.xpath("//*[@id=\"equipment\"]/div/div");
    private static  By dropPlant = By.xpath("//*[@id=\"plant\"]/div/div");
    private static  By txtbrandName = By.id("brand_name");
    private static  By txtmodelNamee = By.id("model_name");
    private static  By txtdescription = By.id("description");
    private static  By butSave = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");


    // method for mastermenu
    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }

    public static void clickEquipmentPanel() {
        getDriver().findElement(equipmentPannel).click();
    }

    public static void clickplantequipmentField() {
        getDriver().findElement(plantequipmentField).click();
    }

    public static void clickAddPlantEquipment() {
        getDriver().findElement(btnAddPLantEquip).click();
    }
    public static void setSerialno(String sno) {
        getDriver().findElement(txtserialno).sendKeys(sno);
    }

    public static void setDropdownoption(String option) {
        Select dropflow= new Select(getDriver().findElement(dropequipment));
        dropflow.selectByVisibleText(option);
    }

    public static void selectEquipment () throws Exception {
        getDriver().findElement(dropequipment).click();
        PageBase.hitEnter();
    }

    public static void setequipment(String equipment) {
        getDriver().findElement(dropequipment).sendKeys(equipment);
    }

    public static void setplant(String plant) {
        getDriver().findElement(dropPlant).sendKeys(plant);
    }

    public static void setbrandname(String bname) {
        getDriver().findElement(txtbrandName).sendKeys(bname);
    }

    public static void setmodelnmae(String modelname) {
        getDriver().findElement(txtmodelNamee).sendKeys(modelname);
    }

    public static void setdescription(String description) {
        getDriver().findElement(txtdescription).sendKeys(description);
    }

    public static void clickbut() {
        getDriver().findElement(butSave).click();
    }

}

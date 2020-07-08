package com.test.qa.tokyo.DisplayDashboard.master.equipmentNV;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

public class Equipment extends PageBase {
    public SoftAssert softAssert;

    // WEB element declartion
    private static By masterMenu =By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By equipmenttab = By.xpath(" //*[@id=\"root\"]/div/section/section/header/ul/li[7]/a");
    private static By equipment = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/div[1]");
    private static By addequipment = By.xpath(" //*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static By isEquipmentPageDisplay = By.xpath("//*[@id=\"rcDialogTitle2\"]/div");

    private static By txtequipment =By.id("equipment_name");
    private static By txtdescription =By.id("equipment_description");
    private static By type =By.xpath("//*[@id=\"type\"]/div/div");
    private static By btnsave =By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]");

    // method for mastermenu
    public static void clickMasterPanel() {
        getDriver().findElement(masterMenu).click();
    }
    // Method for equipmenttab
    public static void clickequipmenttab() {
        getDriver().findElement(equipmenttab).click();
    }
    // Method for equipment
    public static void clickequipment() {
        getDriver().findElement(equipment).click();
    }
    // Method for addequipment
    public static void clickaddequipment() {
        getDriver().findElement(addequipment).click();
    }
    // Method for setEquipment
    public static void setEquipment(String equname){
        getDriver().findElement(txtequipment).sendKeys(equname);
    }
    // Method for setDescription
    public static void setDescription(String description){
        getDriver().findElement(txtdescription).sendKeys(description);
    }
    // Method for clicktype
    public static void clicktype(){
        getDriver().findElement(type).click();
    }
    // Method for clicktypedropdown
    public static void clicktypedropdown() throws Exception {
        getDriver().findElement(type).click();
        PageBase.hitEnter();
    }

    // Metgod for clicksavebtn
    public static void clicksavebtn(){
        getDriver().findElement(btnsave).click();
    }
}

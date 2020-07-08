package com.test.qa.tokyo.DisplayDashboard.master.CustomerNV;

import com.test.qa.tokyo.DisplayDashboard.master.PlantNV.PlantPanel;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import utils.PageBase;

import java.util.logging.Logger;

public class Customer extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(PlantPanel.class));
    private static By masterMenu = By.xpath("//h1[contains(text(),'Master')]");
    private static By Customer = By.xpath("//div[contains(text(),'Customer')]");
    private static By btnAddCustomer = By.xpath("//span[contains(text(),'Add Customer')]");
    private static By txtCustomerName = By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By txtAddress = By.id("//input[@id=\"customer_address\"]");
    private static By txtContactNO = By.id("//input[@id=\"customer_contactno\"]");
    private static By txtEmail = By.id("//input[@id=\"customer_email\"]");
    private static By dropdownPlant = By.id("customer_plant");
    private static By butCustomerSave = By.id("//span[contains(text(),'Save')]");

    public static void clickMasterMenu() {
        getDriver().findElement(masterMenu).click();
    }

    public static void clickCustomer() {
        PageBase.waiTillClickable(btnAddCustomer,8000);
        getDriver().findElement(Customer).click();
    }

    public static void clickAddCustomer() {
        PageBase.waiTillClickable(btnAddCustomer,8000);

        getDriver().findElement(btnAddCustomer).click();
    }

    public static void setCustomerName(String Name) {
        getDriver().findElement(txtCustomerName).sendKeys(Name);
    }

    public static void setAddress(String Addresss) {
        getDriver().findElement(txtAddress).sendKeys(Addresss);
    }

    public static void setContactNO(String Contact) {
        getDriver().findElement(txtContactNO).sendKeys(Contact);
    }

    public static void setEmail(String Email) {
        getDriver().findElement(txtEmail).sendKeys(Email);
    }

    public static void setdropdownPlant(String Dropdown) {
        getDriver().findElement(dropdownPlant).sendKeys(Dropdown);
    }

    public static void setbutCustomerSave() {
        getDriver().findElement(butCustomerSave).click();
    }

}

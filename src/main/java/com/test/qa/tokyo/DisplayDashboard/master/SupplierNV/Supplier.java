package com.test.qa.tokyo.DisplayDashboard.master.SupplierNV;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


import utils.MethodBase;

import utils.PageBase;

import java.util.logging.Logger;

public class Supplier extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(Supplier.class));

    private static By supplierName = By.xpath("//input[@id=\"supplier_name\"]");
    private static By companyName = By.xpath("//input[@id=\"supplier_company_name\"]");
    private static By suppcatergory = By.xpath("//input[@id=\"supplier_category\"]");
    private static By address = By.xpath("//input[@id=\"supplier_address\"]");
    private static By contactno = By.xpath("//input[@id=\"supplier_contactno\"]");
    private static By email = By.xpath("//input[@id=\"supplier_email\"]");
    private static By plant = By.xpath("//*[@id=\"supplier_plant\"]/div/div");
    private static By cancel = By.xpath("//input[@id=\"ant-btn\"]");

    private static By save = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By dashboard = By.xpath("//a[@href=\"#/dashboard\"]");

  //  private static WebElement save = ("");
    private static String BtnCancel = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]";

    private static By clickmaster = By.xpath("//h1[contains(text(),'Master')]");
    private static By clicksupplier = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[8]/div[1]");
    private static By clickAddSupplier = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/div/button");
    private static By Alert = By.xpath("/html/body/div[7]/div/div[2]/div/div[2]/div[2]/form/div[1]/div[1]/div[1]/div/div[1]");
    private static By updateAlert  =By.xpath("//*[@class=\"ant-notification-notice-message\"]");
    private static By editbt  =By.xpath("//*[@data-icon=\"edit\"]");

    public static boolean isSupplierDisplay() {

        return getDriver().findElement(clicksupplier).isDisplayed();
    }

    public static void setsupplierName(String supplier_name) {
        getDriver().findElement(supplierName).clear();
        getDriver().findElement(supplierName).sendKeys(supplier_name);

    }
    public static void clickAddDefect() {
        MethodBase.click(BtnCancel);

    }
    public static void setcompanyName(String supplier_company_name) {
        getDriver().findElement(companyName).clear();
        getDriver().findElement(companyName).sendKeys(supplier_company_name);
    }
    public static void setsuppcatergory(String supplier_category) {
        getDriver().findElement(suppcatergory).clear();
        getDriver().findElement(suppcatergory).sendKeys(supplier_category);
    }
    public static void setaddress(String supplier_address) {
        getDriver().findElement(address).clear();
        getDriver().findElement(address).sendKeys(supplier_address);
    }
    public static void setcontactno(String supplier_contactno) {
        getDriver().findElement(contactno).clear();
        getDriver().findElement(contactno).sendKeys(supplier_contactno);
    }
    public static void setemail(String supplier_email) {
        getDriver().findElement(email).clear();
        getDriver().findElement(email).sendKeys(supplier_email);
    }
    public static void clickplant() {
        getDriver().findElement(plant).click();
    }
    public static void clickcancel() {
        getDriver().findElement(cancel).click();
    }
    public static void clicksave() {
        getDriver().findElement(save).click();
    }
    public static void clickMaster() {

        getDriver().findElement(clickmaster).click();
    }
    public static void clicksupplier() {

        getDriver().findElement(clicksupplier).click();
    }

    public static boolean isdashboardDisplay() {

        return getDriver().findElement(dashboard).isDisplayed();
    }

    public static void ClickAddSupplier() {

        getDriver().findElement(clickAddSupplier).click();
    }

    public static void UpdateAlert() {

        getDriver().findElement(updateAlert).click();
    }


    public static void clickeditbt() {

        getDriver().findElement(editbt).click();
    }

  /*  public static String getAlertMsg() {
        return  getDriver().findElement(Alert).getText();
    }*/

}

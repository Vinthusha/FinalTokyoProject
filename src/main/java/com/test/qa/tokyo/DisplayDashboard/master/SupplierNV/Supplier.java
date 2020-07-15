package com.test.qa.tokyo.DisplayDashboard.master.SupplierNV;

import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;


import utils.MethodBase;

import utils.PageBase;

import java.util.logging.Logger;

public class Supplier extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(Supplier.class));

    private static By master = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[1]/a[1]/div/div");
    private static By Menusupplier = By.xpath("//*[@id=\"root\"]/div/section/section/header/ul/li[13]/a");
    private static By supplierFiled = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]");
    private static By AddSupplier = By.xpath("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/div/button");
    private static By supplierName = By.xpath("//*[@id=\"supplier_category\"]/div/div");
    private static By companyName = By.id("supplier_company_name");
    private static By suppcatergory = By.xpath("//*[@id=\"supplier_category\"]/div");
    private static By address = By.id("supplier_address");
    private static By contactno = By.id("supplier_contactno");
    private static By email = By.id("supplier_email");
    private static By plant = By.xpath("//*[@id=\"supplier_plant\"]/div/div");


    private static By save = By.xpath("/html/body/div[8]/div/div[2]/div/div[2]/div[3]/button[2]");
    private static By dashboard = By.xpath("//a[@href=\"#/dashboard\"]");

    private static String BtnCancel = "/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[1]";



    public static void clickMaster() {
        getDriver().findElement(master).click();
    }

    public static void clickMenusupplier() {
        getDriver().findElement(Menusupplier).click();

    }

    public static void clickSupplier() {
        getDriver().findElement(supplierFiled).click();

    }

    public static void clickAddSupplier() {
        getDriver().findElement(AddSupplier).click();

    }


    public static void setsupplierName(String supplier_name) {

        getDriver().findElement(supplierName).sendKeys(supplier_name);

    }

    public static void setcompanyName(String supplier_company_name) {

        getDriver().findElement(companyName).sendKeys(supplier_company_name);
    }

    public static void suppcatergory() throws Exception {
        getDriver().findElement(suppcatergory).click();
        PageBase.hitEnter();
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

    public static void selectplant() throws Exception {
        getDriver().findElement(plant).click();
        PageBase.hitEnter();
    }

    public static void clikSave() {
        getDriver().findElement(save).click();

    }





}

package com.test.qa.tokyo.DisplayDashboard.testconfiguration.testNV;

import org.openqa.selenium.By;
import utils.MethodBase;
import utils.PageBase;

public class Materialtest extends PageBase {


    private static String testconfiguration =("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div[2]/a[1]/div/div");
    private static String MenuTest = ("//*[@id=\"root\"]/div/section/section/header/ul/li[4]/a");
    private static String Materialtestfield = ("//*[@id=\"root\"]/div/section/section/main/div/div[1]/div/div[1]");
    private static String butaddTest = ("//*[@id=\"root\"]/div/section/section/main/div/div[2]/div/div/div/div[1]/div/div[2]/button");
    private static String txtTest = ("test_name");
    private static String butsave = ("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/button[2]");

    public static void clickconfigurePanel() {
        MethodBase.isDisplayed_ByXpath(testconfiguration);
        MethodBase.click_ByXpath(testconfiguration);


    }
    public static void clickMaterialtestfield() {
        MethodBase.isDisplayed_ByXpath(Materialtestfield);
        MethodBase.click_ByXpath(Materialtestfield);


    }


    public static void clickMenuTest() {
        MethodBase.isDisplayed_ByXpath(MenuTest);
        MethodBase.click_ByXpath(MenuTest);


    }

    public static void clickbutaddTest() {
        MethodBase.isDisplayed_ByXpath(butaddTest);
        MethodBase.click_ByXpath(butaddTest);


    }
    public static void clicktxtTest() {
        MethodBase.isDisplayed_ByXpath(txtTest);
        MethodBase.click_ByXpath(txtTest);


    }
    public static void clickbutsave() {
        MethodBase.click_ByXpath(butsave);


    }



}


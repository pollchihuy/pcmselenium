package coid.juaracoding.pcmselenium.impl;

import coid.juaracoding.pcmselenium.connectivity.Constants;
import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *  URL : https://practicetestautomation.com/practice-test-login/
 */
public class LoginNegatif {
    public static WebDriver driver;
    private LoginPage loginPage ;

    @BeforeTest
    public void initCase(){
        DriverSingleton.getInstance(Constants.FIREFOX);
        this.driver = DriverSingleton.getDriver();
        this.driver.get(Constants.URL_LOGIN);
        loginPage = new LoginPage(driver);
//        loginPage = new LoginPage(driver);
    }
    /** Untuk test case input username dan password kosong */
    @Test(priority = 0)
    public void emptyLogin(){
        loginPage.clear();
        loginPage.inputUsername("");
        loginPage.inputPassword("");
        loginPage.clickLogin();
        String strLoginError = loginPage.notificationLoginError();
        System.out.println("Validation Login Error Empty String "+ strLoginError);
        Assert.assertEquals("Your username is invalid!",strLoginError);
    }

    /** Untuk test case input username valid dan password tidak valid */
    @Test(priority = 1)
    public void invalidPassword(){
        loginPage.clear();
        loginPage.inputUsername("student");
        loginPage.inputPassword("password@1234");//PaulABCD1paulabcd1
        loginPage.clickLogin();
        Assert.assertEquals("Your password is invalid!",loginPage.notificationLoginError());
    }

    /** Untuk test case input username tidak valid dan password valid */
    @Test(priority = 2)
    public void invalidUsername(){
        loginPage.clear();
        loginPage.inputUsername("murid");
        loginPage.inputPassword("Password@123");
        loginPage.clickLogin();
        Assert.assertEquals("Your username is invalid!",loginPage.notificationLoginError());
    }

    /** Untuk test case input username tidak valid dan password valid */
    @Test(priority = 3)
    public void invalidLogin(){
        loginPage.clear();
        loginPage.inputUsername("murid");
        loginPage.inputPassword("Password@1234");
        loginPage.clickLogin();
        Assert.assertEquals("Your username is invalid!",loginPage.notificationLoginError());
    }

    @AfterTest
    public void closeDriver(){
        DriverSingleton.closeObjectInstance();
    }
}
package coid.juaracoding.pcmselenium.impl;

import coid.juaracoding.pcmselenium.connectivity.Constants;
import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.page.HomePage;
import coid.juaracoding.pcmselenium.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 *  URL : https://practicetestautomation.com/practice-test-login/
 */
public class LoginPositif {
    public static WebDriver driver;
    private LoginPage loginPage ;
    private HomePage homePage;

    @BeforeTest
    public void initCase(){
        DriverSingleton.getInstance(Constants.FIREFOX);
        this.driver = DriverSingleton.getDriver();
        this.driver.get(Constants.URL_LOGIN);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test(priority = 0)
    public void validLogin(){
        loginPage.clear();//STEP-1
        loginPage.inputUsername("student");//STEP-2
        loginPage.inputPassword("Password123");//STEP-3
        loginPage.clickLogin();//STEP-4
        String strValidation = homePage.homePageValidation();
        System.out.println("Home Page Validation "+strValidation);

        /** tambahkan step logout */
        Assert.assertEquals("Congratulations student. You successfully logged iin!",strValidation);//STEP-5
    }

    @Test(priority = 1)
    public void logout(){
        homePage.logout();
        String strLoginFormValidation = loginPage.loginFormValidation();//setelah logout
        Assert.assertEquals("Test login",strLoginFormValidation);
    }

    @AfterTest
    public void closeDriver(){
        DriverSingleton.closeObjectInstance();
    }
}
//package coid.juaracoding.pcmselenium.impl;
//
//import coid.juaracoding.pcmselenium.util.Constants;
//import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
//import coid.juaracoding.pcmselenium.page.HomePage;
//import coid.juaracoding.pcmselenium.page.LoginPage;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
///**
// *  URL : https://practicetestautomation.com/practice-test-login/
// */
//public class LoginPositifDoank {
//    public static WebDriver driver;
//    private LoginPage loginPage ;
//    private HomePage homePage;
//
//    @BeforeTest
//    public void initCase(){
//        DriverSingleton.getInstance(Constants.FIREFOX);
//        this.driver = DriverSingleton.getDriver();
//        loginPage = new LoginPage(driver);
//        homePage = new HomePage(driver);
//    }
//
//    @Test(priority = 0)
//    public void openWebSite(){
//        this.driver.get(Constants.URL_LOGIN);
//    }
//
//    @Test(priority = 1)
//    public void clearFieldLogin(){
//        loginPage.clear();//STEP-1
//    }
//
//    @Test(priority = 2)
//    public void inputUsername(){
//        loginPage.inputUsername("student");//STEP-2
//    }
//
//    @Test(priority = 3)
//    public void inputPassword(){
//        loginPage.inputPassword("Password123");//STEP-3
//    }
//
//    @Test(priority = 4)
//    public void clickTombolLogin(){
//        loginPage.clickLogin();//STEP-4
//    }
//
//    @Test(priority = 5)
//    public void validasiHomePage(){
//        String strValidation = homePage.homePageValidation();
//        System.out.println("Home Page Validation "+strValidation);
//        Assert.assertEquals("Congratulations student. You successfully logged iin!",strValidation);//STEP-5
//    }
//
//    @Test(priority = 6 )
//    public void clickTombolLogout(){
//        homePage.logout();
//    }
//
//    @Test(priority = 7)
//    public void validasiHalamanLogin(){
//        String strLoginFormValidation = loginPage.loginFormValidation();//setelah logout
//        Assert.assertEquals("Test login",strLoginFormValidation);
//    }
//
//    @AfterTest
//    public void closeDriver(){
//        DriverSingleton.closeObjectInstance();
//    }
//}
package coid.juaracoding.pcmselenium.impl;

import coid.juaracoding.pcmselenium.connectivity.Constants;
import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.page.HomePage;
import coid.juaracoding.pcmselenium.page.LoginPage;
import coid.juaracoding.pcmselenium.page.PracticePage;
import coid.juaracoding.pcmselenium.page.TestExceptionPage;
import coid.juaracoding.pcmselenium.util.GlobalFunction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeToTestExceptions {
    public static WebDriver driver;
    private LoginPage loginPage ;
    private HomePage homePage;
    private PracticePage practicePage;
    private TestExceptionPage testExceptionPage;

    @BeforeTest
    public void initCase(){
        DriverSingleton.getInstance(Constants.FIREFOX);
        this.driver = DriverSingleton.getDriver();
        this.driver.get(Constants.URL_LOGIN);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        practicePage = new PracticePage(driver);
        testExceptionPage = new TestExceptionPage(driver);
    }

    @Test(priority = 0)
    public void validLogin(){
        loginPage.clear();//STEP-1
        loginPage.inputUsername("student");//STEP-2
        loginPage.inputPassword("Password123");//STEP-3
        loginPage.clickLogin();//STEP-4
        String strValidation = homePage.homePageValidation();
        System.out.println("Home Page Validation "+strValidation);
        Assert.assertEquals("Congratulations student. You successfully logged in!",strValidation);//STEP-5
    }

    @Test(priority = 1)
    public void goToMenuPractice(){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()",homePage.goToMenuPractice());

        /** kalau setelah klik menu practice tidak ada delay ,
         * maka pointer langsung ambil komponen dengan id yang sama dan terjadi error karena isi nya berbeda
         */
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String strMenuPracticeValidation = practicePage.menuPracticeValidation();
        System.out.println(strMenuPracticeValidation);
        Assert.assertEquals("Practice",strMenuPracticeValidation);//STEP-5
    }

    @Test(priority = 1)
    public void goToMenuTestExceptions(){
        JavascriptExecutor js = (JavascriptExecutor) this.driver;
        js.executeScript("arguments[0].click()",practicePage.goToMenuTextException());
        /** kalau setelah klik menu practice tidak ada delay ,
         * maka pointer langsung ambil komponen dengan id yang sama dan terjadi error karena isi nya berbeda
         */
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String strMenuValidations = testExceptionPage.menuVerifications();
        System.out.println(strMenuValidations);
        Assert.assertEquals("Test Exceptions",strMenuValidations);//STEP-5
    }

    @Test(priority = 2)
    public void editAndSaveFirstField(){
        testExceptionPage.clickBtnEdit();
        testExceptionPage.inputTextField("Martabak");
        testExceptionPage.clickBtnSave();
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        String strSaveConfirmation = testExceptionPage.saveConfirmation();
        System.out.println("Confirmation Saving "+strSaveConfirmation);
        /** disini nanti angkanya dibuat dynamic trigger dari button add */
        Assert.assertEquals("Row 1 was saved",strSaveConfirmation);//STEP-5
    }

    @AfterTest
    public void closeDriver(){
        DriverSingleton.closeObjectInstance();
    }
}
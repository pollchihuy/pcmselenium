package coid.juaracoding.pcmselenium.page;

import coid.juaracoding.pcmselenium.connectivity.Constants;
import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 19:52
@Last Modified Wed 19:52
Version 1.0
*/
public class PageDaftarAkun {
    private WebDriver driver;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement txtEmail;

    @FindBy(xpath = "//input[@id='mobilePhone']")
    private WebElement txtHP;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement txtPassword;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElement txtConfirmPassword;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement txtNamaDepan;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement txtNamaBelakang;

    public PageDaftarAkun() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String email){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
//        GlobalFunction.delay(30);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT))
                .until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
    }

    public void inputNoHp(String noHp){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtHP)).sendKeys(noHp);
    }

    public void inputPassword(String password){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(password);
    }

    public void inputConfirmPassword(String confirmPwd){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtConfirmPassword)).sendKeys(confirmPwd);
    }

    /** functional selenium untuk input field nama depan */
    public void inputNamaDepan(String strNamaDepan){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtNamaDepan)).sendKeys(strNamaDepan);
    }

    public void inputNamaBelakang(String strNamaBelakang){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(txtNamaBelakang)).sendKeys(strNamaBelakang);
    }
}
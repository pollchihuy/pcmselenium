package coid.juaracoding.pcmselenium.page;

import coid.juaracoding.pcmselenium.util.Constants;
import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.util.GlobalFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestExceptionPage {

    private WebDriver driver;

    @FindBy(xpath = "//h2[normalize-space()='Test Exceptions']")
    private WebElement labelMenuTitleTestException;

    @FindBy(xpath = "//button[@id='edit_btn']")
    private WebElement btnEdit;

    @FindBy(xpath = "//button[@id='save_btn']")
    private WebElement btnSave;

    @FindBy(xpath = "//div[@id='confirmation']")
    private WebElement notifConfirmation;

    @FindBy(xpath = "//button[@id='add_btn']")
    private WebElement btnAdd;

    @FindBy(xpath = "//input[@value='Pizza']")
    private WebElement textFieldRow;

    public TestExceptionPage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public TestExceptionPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String menuVerifications(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return labelMenuTitleTestException==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(labelMenuTitleTestException)).getText();
    }

    public void clickBtnEdit(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnEdit)).click();
//        btnEdit.click();
    }

    public void clickBtnSave(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnSave)).click();
    }

    public void clickBtnAdd(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnAdd)).click();
    }

    public String saveConfirmation(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return  notifConfirmation==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(notifConfirmation)).getText();
    }
    public void inputTextField(String strValue){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldRow)).clear();
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(textFieldRow)).sendKeys(strValue);
    }
}
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

public class LoginPage {
    private WebDriver driver;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement txtFieldUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement txtFieldPassword;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//div[@id='error']")
    private WebElement notifLoginError;

    @FindBy(xpath = "//h2[normalize-space()='Test login']")
    private WebElement labelLogin;

    public LoginPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void inputUsername(String username){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldUsername)).sendKeys(username);
        }catch (Exception e){
            System.out.println("Komponen Text Field Username Tidak Ditemukan !!");
        }
    }

    public void inputPassword(String password){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldPassword)).sendKeys(password);
        }catch (Exception e){
            System.out.println("Komponen Text Field Password Tidak Ditemukan !!");
        }
    }

    public void clickLogin(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(btnSubmit)).click();
        }catch (Exception e){
            System.out.println("Komponen Tombol Tidak Ditemukan !!");
        }
    }

    public void clear(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        try{
            /** Set Field Password Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldPassword)).clear();
            /** Set Field Username Empty String */
            new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                    .until(ExpectedConditions.visibilityOf(txtFieldUsername)).clear();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String notificationLoginError(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return notifLoginError ==null?"": new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(notifLoginError)).getText();
    }

    public String loginFormValidation(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        return labelLogin==null?"":new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(labelLogin)).getText();
    }
}
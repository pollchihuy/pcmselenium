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

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Practice']")
    private WebElement btnMenuPractice;

//    @FindBy(xpath = "//strong[contains(text(),'Congratulations student. You successfully logged i')]")
    @FindBy(xpath = "/html/body/div/div/section/div/div/article/div[2]/p[1]/strong")
    private WebElement homepageLogo;

    @FindBy(xpath = "//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")
    private WebElement btnLogout;

    public HomePage() {
        this.driver= DriverSingleton.getDriver();
        PageFactory.initElements(driver,this);
    }

    public HomePage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public String homePageValidation(){
        return homepageLogo==null?"":homepageLogo.getText();
    }

    public void logout(){
        GlobalFunction.delay(Constants.TIMEOUT_DELAY);
        new WebDriverWait(driver, Duration.ofSeconds(Constants.TIMEOUT_DELAY))
                .until(ExpectedConditions.visibilityOf(btnLogout)).click();
    }

    public WebElement goToMenuPractice(){
        return btnMenuPractice;
    }
}
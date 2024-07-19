package coid.juaracoding.pcmselenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Thu 19:12
@Last Modified Thu 19:12
Version 1.0
*/
public class BikinClass {
    String strNama = "";


    public static void main(String[] args) {
        Random random = new Random();
        WebDriver driver = new ChromeDriver();
//        @FindBy(xpath = "//input[@id='username']")
//        private WebElement txtFieldUsername;
//        WebElement txtFieldUsername = driver.findElement(By.xpath("//input[@id='username']"));
//        WebElement frameOne = driver.findElement(By.xpath("/html/body/iframe"));
//        driver.switchTo().frame(frameOne);
//        driver.switchTo().defaultContent();
//        String [] strArr = {"Volvo","Opel","Saab",};
//
//        WebElement componentSelect = driver.findElement(By.xpath("//select[@id='cars']"));
//        Select select = new Select(componentSelect);
//
//        select.selectByIndex(random.nextInt(0,4));
//        select.selectByIndex(random.nextInt(0,4));
//
//        select.getAllSelectedOptions();
//        List<WebElement> lt = select.getOptions();
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        WebElement movie = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click",movie);
//        /html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div[1]
        //div[@class='promo-code']
        String strX = "ABCD";
        String strTemp = "";
        for (int i = 0; i < strX.length(); i++) {
            strTemp="";
            for (int j = 0; j <= i; j++) {
                strTemp = strTemp + strX.charAt(j);
            }
            System.out.println(strTemp);
        }

        WebElement username = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        WebElement password = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        WebElement btnLogin = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        WebElement uploadFile = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        WebElement btnSend = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        WebElement element1 = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        WebElement element2 = driver.findElement(By.xpath("//li[@class='Box-root css-16wyr6f']//a[@title='Drama Indonesia'][normalize-space()='Drama Indonesia']"));
        username.sendKeys("paul@gmail.com");
//        password.sendKeys("Paul@123"+ Keys.ENTER);
        password.sendKeys("Paul@123");
//        btnLogin.click();
        uploadFile.sendKeys("D://download//abc//image.jpg");
        btnSend.click();

        Actions action = new Actions(driver);
        action.dragAndDrop(element1,element2).click().perform();
        action.doubleClick(element1).perform();
        action.clickAndHold(element1).perform();
        action.contextClick(element2).perform();
    }
}

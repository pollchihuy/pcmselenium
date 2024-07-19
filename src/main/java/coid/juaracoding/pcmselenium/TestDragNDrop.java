package coid.juaracoding.pcmselenium;

import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.util.GlobalFunction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Fri 21:29
@Last Modified Fri 21:29
Version 1.0
*/
public class TestDragNDrop {


    public static void main(String[] args) {
        WebDriverManager.firefoxdriver();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://png2jpg.com/");
        driver.manage().window().maximize();
        WebElement bucketUpload = driver.findElement(By.xpath("//div[@class='files__drop-caption drop-caption']//*[name()='svg']"));
        WebElement btnModals = driver.findElement(By.xpath("//div[@class='files__drop-caption drop-caption']//*[name()='svg']"));
        GlobalFunction.delay(3);
        WebElement btnUpload = driver.findElement(By.xpath("//label[@aria-label='UPLOAD FILES']"));
        GlobalFunction.delay(3);
        btnUpload.sendKeys("D:\\download-automation\\gambar-180-abu-abu.png");
        btnUpload.click();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().sendKeys("Hello, Good Morning");
        driver.switchTo().alert().accept();
        btnModals.click();
        WebElement test = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        test.getAttribute("required");//true atau false

    }
}

package coid.juaracoding.pcmselenium;

import coid.juaracoding.pcmselenium.util.GlobalFunction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

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
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://png2jpg.com/");
        driver.manage().window().maximize();
        /**
         * MASUKKAN PATH FILE YANG MAU DI UPLOAD KE SINI CONTOH NYA : D:\download-automation\gambar-180-abu-abu.png
         * MASUKKAN PATH FILE YANG MAU DI UPLOAD KE SINI CONTOH NYA : D:\download-automation\gambar-180-abu-abu.png
         * MASUKKAN PATH FILE YANG MAU DI UPLOAD KE SINI CONTOH NYA : D:\download-automation\gambar-180-abu-abu.png
         * MASUKKAN PATH FILE YANG MAU DI UPLOAD KE SINI CONTOH NYA : D:\download-automation\gambar-180-abu-abu.png
         * MASUKKAN PATH FILE YANG MAU DI UPLOAD KE SINI CONTOH NYA : D:\download-automation\gambar-180-abu-abu.png
         */
        File uploadFile = new File("MASUKKAN_PATH_FILE_KESINI");
        GlobalFunction.delay(1);
        WebElement btnUpload = driver.findElement(By.xpath("//*[@id=\"fileSelector\"]"));
        GlobalFunction.delay(1);
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
        btnUpload.sendKeys(uploadFile.getAbsolutePath());
    }
}
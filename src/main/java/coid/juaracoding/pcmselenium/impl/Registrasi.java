package coid.juaracoding.pcmselenium.impl;

import coid.juaracoding.pcmselenium.connectivity.Constants;
import coid.juaracoding.pcmselenium.connectivity.DriverSingleton;
import coid.juaracoding.pcmselenium.page.PageDaftarAkun;
import coid.juaracoding.pcmselenium.util.DataGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
IntelliJ IDEA 2024.1.4 (Ultimate Edition)
Build #IU-241.18034.62, built on June 21, 2024
@Author pollc a.k.a. Paul Christian
Java Developer
Created on Wed 21:58
@Last Modified Wed 21:58
Version 1.0
*/
public class Registrasi {
    public static WebDriver driver;
    private PageDaftarAkun pageRegis;
    private DataGenerator dataGenerator;

    @BeforeTest
    public void initCase(){
        DriverSingleton.getInstance(Constants.FIREFOX);
        this.driver = DriverSingleton.getDriver();
        dataGenerator = new DataGenerator();
        this.driver.get("https://www.cermati.com/app/gabung?target=/");
        this.pageRegis = new PageDaftarAkun();
    }

    /** informasi apa kek gituh !! */
    @Test(priority = 1)
    public void inputRegis(){
        String strPassword = dataGenerator.dataPassword();
        pageRegis.inputEmail(dataGenerator.dataEmail());
        pageRegis.inputNoHp(dataGenerator.dataNoHp());
        pageRegis.inputPassword(strPassword);
        pageRegis.inputConfirmPassword(strPassword);
        pageRegis.inputNamaDepan(dataGenerator.dataNamaDepan());
        pageRegis.inputNamaBelakang(dataGenerator.dataNamaBelakang());
        DriverSingleton.closeObjectInstance();
    }
}
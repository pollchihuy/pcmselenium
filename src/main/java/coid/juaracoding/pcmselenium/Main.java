package coid.juaracoding.pcmselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
//username tidak boleh blank
//minimal 25 maksimal 40
//div[11]//a[1]//div[1]//div[1]//div[1]//div[1]//img[1]
    //span[contains(text(),'Selang air merk Maspion sangat tebal 5/8" anti tek')]
    //span[@class='_5+V0nr2fU+1eyI2rpS0FYw==']

//    div[11]//a[1]//div[1]//div[2]//div[4]//div[2]//span[2]
    //div[contains(text(),'Rp619.000')] --> /html/body/div[1]/div/main/div/div[1]/div[2]/div[2]/div/div[16]/a/div[1]
//    /html/body/div[1]/div/main/div/div[1]/div[2]/div[2]/div/div[16]/a/div[1]
//    /html/body/div[1]/div/main/div/div[1]/div[2]/div[2]/div/div[16]/a/div[1]

    static WebDriver driver;
    public static void main(String[] args) {

        // menyiapkan driver
        WebDriverManager.firefoxdriver();
        // buka browser
        driver = new FirefoxDriver();
        // ketik url https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        // maksimalin jendela browser
        driver.manage().window().maximize();
        // INI SI JAVA
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();


    }
}
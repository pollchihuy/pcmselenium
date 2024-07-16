package coid.juaracoding.pcmselenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
//        WebDriverManager.chromedriver();
        // buka browser
        driver = new FirefoxDriver();
//        driver = new ChromeDriver();
        // ketik url https://www.yahoo.com -> http
        // wss / web socket secure => ws / web socket
        // FTP / SMTP / STOMP / HTTP
        driver.get("https://www.yahoo.com");
        // maksimalin jendela browser
//        DELAY -> TIMEOUT
        driver.manage().window().maximize();
        // INI SI JAVA
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        WebElement btnSignIn = driver.findElement(By.xpath("//a[contains(@class,'_yb_1nb9cxc undefined')]"));
        System.out.println("Text SignIn : "+btnSignIn.getText());
        btnSignIn.click();
        driver.close();

//        /html/body/div[1]/div/main/section[1]/div/div[1]/div[1]/section/div[2]/div/div[1]/div/div[4]/div/a/picture/img
//div[4]//div[1]//a[1]//picture[1]//img[1]
        //p[@class='css-l5do8o-unf-heading e1qvo2ff8']
//        .css-1q90pod[src='https://images.tokopedia.net/img/cache/300-square/VqbcmM/2024/6/6/e3e0d15a-ff9a-4b54-afbe-5412ee1757e2.jpg']
//        .css-l5do8o-unf-heading.e1qvo2ff8
//        /html/body/div[1]/div/main/section[1]/div/div[1]/div[2]/section/section/div/div[1]/div[1]/div/div/button[1]/p
// /html/body/div[1]/div/main/section[1]/div/div[1]/div[2]/section/section/div/div[1]/div[1]/div/div/button[1]/p
        //input[@id='email']
        //a[normalize-space()='Lupa kata sandi?']

    }
}
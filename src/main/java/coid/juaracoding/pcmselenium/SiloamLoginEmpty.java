package coid.juaracoding.pcmselenium;

import coid.juaracoding.pcmselenium.util.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SiloamLoginEmpty {
	public static void main(String[] args) {
		String url="https://dev.ptdika.com/staging.siloam";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement fieldUsername = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement fieldPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		delay(3);

		fieldUsername.sendKeys("a");
		fieldPassword.sendKeys("");
		btnLogin.click();
		delay(3);

		/** kalau validasi nya menyala berarti nilai dari variable ini adalah false */
		boolean isEmptyUsername = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", fieldUsername);
		boolean isEmptyPassword = (Boolean)((JavascriptExecutor)driver).executeScript("return arguments[0].validity.valid;", fieldPassword);
		System.out.println("Value Empty Username : "+isEmptyUsername);
		System.out.println("Value Empty Password : "+isEmptyPassword);

		if(!isEmptyUsername && !isEmptyPassword){
			System.out.println("Test Case Login Empty Berhasil");
		}else {
			System.out.println("Test Case Gagal");
		}

		if(!isEmptyUsername && !isEmptyPassword){
			System.out.println("Test Case Login Empty Berhasil");
		}else {
			System.out.println("Test Case Gagal");
		}



		driver.close();
		}

	public static  void delay(int intDetik){
		if(Constants.GLOB_PARAM_DELAY.equalsIgnoreCase("y")){
			try {
				Thread.sleep(intDetik*1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
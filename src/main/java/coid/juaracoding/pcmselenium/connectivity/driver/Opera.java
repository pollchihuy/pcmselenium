package coid.juaracoding.pcmselenium.connectivity.driver;

import coid.juaracoding.pcmselenium.connectivity.DriverStrategy;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;

public class Opera implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        WebDriverManager.operadriver().setup();
        WebDriver driver = (WebDriver) new OperaDriverManager();

        return driver;
    }
}

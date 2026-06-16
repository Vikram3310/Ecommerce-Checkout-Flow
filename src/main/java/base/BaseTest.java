package base;

import org.openqa.selenium.WebDriver;

public class BaseTest extends DriverSetup {
    protected WebDriver driver;

    public void setup(){
        driver = DriverSetup.getDriver();
        driver.get("https://demo.nopcommerce.com/");
    }
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

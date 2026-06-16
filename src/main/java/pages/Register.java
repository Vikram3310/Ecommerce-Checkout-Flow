package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register extends BaseTest {
    // Script to Register as End User
    public void register(){
        setup();
        driver.findElement(By.linkText("Register")).click();
    }
}

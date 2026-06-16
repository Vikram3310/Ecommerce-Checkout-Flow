package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.lang.model.element.Element;

public class Register extends BaseTest {
    // Script to Register as End User
    public void register(){
        setup();
        driver.get("https://practicesoftwaretesting.com/auth/register");
    }

    public static void main(String[] args) {
        Register register = new Register();
        register.register();
    }
}

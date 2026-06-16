package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.Register;

import java.util.Scanner;

public class RegisterTest extends Register {
    public static void main(String[] args) {
        RegisterTest registerTest = new RegisterTest();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String first_name = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String last_name = scanner.nextLine();

        System.out.println("Enter Date of Birth:(YYYY-MM-DD) ");
        String DOB = scanner.nextLine();

        System.out.println("Enter Country Name (e.g. India, United States of America (the)): ");
        String country = scanner.nextLine();

        System.out.println("Enter Postal Code: ");
        String postalCode = scanner.nextLine();

        System.out.println("Enter House Number: ");
        String houseNumber = scanner.nextLine();

        System.out.println("Enter Street: ");
        String street = scanner.nextLine();

        System.out.println("Enter City: ");
        String city = scanner.nextLine();

        System.out.println("Enter State: ");
        String state = scanner.nextLine();

        System.out.println("Enter Phone: ");
        String phone = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        registerTest.register(); // Calls setup() and navigates to the register page

        WebElement enter_first_name = wait.until(ExpectedConditions.elementToBeClickable(By.id("first_name")));
        enter_first_name.sendKeys(first_name);

        WebElement enter_last_name = wait.until(ExpectedConditions.elementToBeClickable(By.id("last_name")));
        enter_last_name.sendKeys(last_name);

        WebElement enter_DOB = wait.until(ExpectedConditions.elementToBeClickable(By.id("dob")));
        enter_DOB.sendKeys(DOB);

        WebElement countryElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("country")));
        Select countrySelect = new Select(countryElement);
        countrySelect.selectByVisibleText(country);

        WebElement postalCodeElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("postal_code")));
        postalCodeElement.sendKeys(postalCode);

        WebElement houseNumberElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("house_number")));
        houseNumberElement.sendKeys(houseNumber);

        WebElement streetElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("street")));
        streetElement.sendKeys(street);

        WebElement cityElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("city")));
        cityElement.sendKeys(city);

        WebElement stateElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("state")));
        stateElement.sendKeys(state);

        WebElement phoneElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("phone")));
        phoneElement.sendKeys(phone);

        WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        emailElement.sendKeys(email);

        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        passwordElement.sendKeys(password);

        WebElement registerButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-test='register-submit']")));
        registerButton.click();

        registerTest.tearDown(); // Close the browser
    }
}
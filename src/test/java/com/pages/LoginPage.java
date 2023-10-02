package com.pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage{
    public static WebElement brandingLogo = $x("//*[contains(@class, 'orangehrm-login-branding') or contains(@class, 'oxd-brand-banner')]");
    public static WebElement title = $x("//*[contains(@class, 'orangehrm-login-title')]");
    public static WebElement personIcon = $(".bi-person");
    public static WebElement username = $x("//input[@name='username']");
    public static WebElement password = $x("//input[@name='password']");
    public static WebElement loginBth = $("[type='submit']" );

}

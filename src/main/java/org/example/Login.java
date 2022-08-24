package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;


public class Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.citilink.ru/");
        WebElement webElement1 = driver.findElement(By.xpath("//button[@data-label='Войти'])[1]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//input[contains(@class,'js--SignIn__login__container-input')]"));
        webElement2.sendKeys("Andreygorl@mail.ru");
        WebElement webElement3 = driver.findElement(By.xpath("//input[contains(@class,'js--SignIn__password js--InputPassword InputPassword__container-input')]"));
        webElement3.sendKeys("ac0444452");
        WebElement webElement4 = driver.findElement(By.xpath("//div[contains(@class,'SignIn__actions')]//div[1]//button[1]"));
        webElement4.click();





    }
}
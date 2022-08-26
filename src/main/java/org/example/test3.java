package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class test3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.citilink.ru/");

        WebElement webElement1 = driver.findElement(By.xpath("//div[contains(@class,'AuthPopup__button Popup__button js--AuthPopup__button')]//div[2]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//input[contains(@class,'js--SignIn__login__container-input')]"));
        webElement2.sendKeys("Andreygorl@mail.ru");
        WebElement webElement3 = driver.findElement(By.xpath("//input[contains(@class,'js--SignIn__password js--InputPassword InputPassword__container-input')]"));
        webElement3.sendKeys("ac0444452");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='SignIn__action SignIn__action_sign-in']//button[@data-label='Войти']")));
        WebElement webElement4 = driver.findElement(By.xpath("//div[@class='SignIn__action SignIn__action_sign-in']//button[@data-label='Войти']"));
        webElement4.click();


        WebElement webElement5 = driver.findElement(By.xpath("//a[contains(text(),'Ноутбуки')]"));
        webElement5.click();


        WebElement webElement6 = driver.findElement(By.xpath("//a[contains(text(),'Huawei MateBook D 15, 53013HST,')]"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath("//button[contains(@data-label,'В избранное')]"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath("//div[@class='HeaderMenu__button HeaderMenu__button_wishlist IconAndTextWithCount_mainHeader js--HeaderMenu__button_wishlist IconAndTextWithCount js--IconAndTextWithCount']"));
        webElement8.click();

       WebElement webElement9 = driver.findElement(By.xpath("//button[@data-label='Очистить список']"));
       webElement9.click();





    }


}
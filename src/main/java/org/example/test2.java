package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;


public class test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.citilink.ru/");

        WebElement webElement1 = driver.findElement(By.xpath("//a[contains(text(),'Ноутбуки')]"));
        webElement1.click();

       // webElement1.sendKeys("//a[contains(text(),'Huawei MateBook D 16, 53013JHP,')]");
        //webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//a[contains(text(),'Huawei MateBook D 16, 53013JHP,')]"));
        webElement2.click();

       WebElement webElement3 = driver.findElement(By.xpath("//button[@data-label='Добавить в корзину']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath("//div[@class='UpsaleBasket__header-link']//button[@data-label='Перейти в корзину']"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath(" //button[@data-label='Очистить корзину']"));
        webElement5.click();











    }
}
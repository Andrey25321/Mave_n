package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class App {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://marksandspencer.ru");

        WebElement webElement1 = driver.findElement(By.xpath(".//input[@name='q']"));

        webElement1.click();
        webElement1.sendKeys("футболка");
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@name =\"s\"]"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//span[text() = 'Трикотажная рубашка-поло из хлопка']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath(".//div[text()='Размеры']//following-sibling::ul//li[2]"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath("//span[text()='Добавить в корзину']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//div[@class='popmechanic-close']"));
        webElement6.click();
        WebElement webElement7 = driver.findElement(By.xpath("//div[@class='purchase visible']//a[text()='Перейти в корзину']"));
        Thread.sleep(2000);
        webElement7.click();
        WebElement webElement8 = driver.findElement(By.xpath("//div[@id='cart_block1products']//a[@title='Удалить']"));
        Thread.sleep(2000);
        webElement8.click();
        driver.quit();










    }
}
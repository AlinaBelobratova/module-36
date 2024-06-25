package ru.SkillFactory.PageObject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
public class TestFour {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void Test4() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1096, 672));
        driver.switchTo().frame(11);
        driver.findElement(By.cssSelector(".svelte-1qe9gqs")).click();
        driver.findElement(By.cssSelector(".button__text")).click();
        driver.findElement(By.id("opened-textfield")).click();
        {
            WebElement element = driver.findElement(By.cssSelector(".right-slot .cqi-chat"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
    }
}
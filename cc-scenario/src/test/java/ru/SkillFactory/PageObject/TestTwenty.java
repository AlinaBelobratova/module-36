package ru.SkillFactory.PageObject;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
public class TestTwenty {
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
    public void test20() {
        driver.get("https://skillfactory.ru/");
        driver.manage().window().setSize(new Dimension(1280, 680));
        js.executeScript("window.scrollTo(0,74.66666412353516)");
        js.executeScript("window.scrollTo(0,4191.33349609375)");
        driver.findElement(By.id("free-materials-prev-btn")).click();
        driver.findElement(By.id("free-materials-prev-btn")).click();
        driver.findElement(By.id("free-materials-next-btn")).click();
        driver.findElement(By.id("free-materials-next-btn")).click();
    }
}